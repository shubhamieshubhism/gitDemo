package seleniumPractice;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Response_code_onListOperation {
	public static WebDriver driver;
	public SoftAssert soft=new SoftAssert();
	@Test
	public void response_on_list() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		List<WebElement> toplist = driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));	
		System.out.println("Total top links : "+toplist);
		
		for(int i =0;i<toplist.size();i++) {
			System.out.println(toplist.get(i).getText()+"presense of this link is : "+toplist.size());
			String url=toplist.get(i).getAttribute("href");
			System.out.println(url);
		    boolean result = validateRespose(url);
		    soft.assertTrue(result, "invalid response code");
		    toplist.get(i).click();
		    System.out.println("Title of this page is : "+driver.getTitle());
		   driver.get("https://bbc.com");
		   toplist=driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));
		    
			System.out.println("----------------------------------");
			
		}
		soft.assertAll();
		
	}
	public boolean validateRespose(String url) {
		int response_code=0; 
		try {
			response_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("respose code for url : "+url+" is :"+response_code);
			if(response_code==200) {
				return true;
			}
		} catch (ClientProtocolException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
