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

public class PartFiveOfMultipleExtraction {
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
		//List<WebElement> toplist = driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));	
		//System.out.println("Total top links : "+toplist);
		String part1="//*[@id=\\\"orb-header\\\"]/div/nav[2]/ul/li[";
		String part2="]/a";
		
		int i=1;
		while(isElementPresent(part1+i+part2)) {
			String textlink = driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(textlink);
			String url = driver.findElement(By.xpath(part1+i+part2)).getAttribute("href");
			System.out.println(url);
			
			
		    boolean result = validateRespose(url);
		    soft.assertTrue(result, "invalid response code");
		    driver.findElement(By.xpath(part1+i+part2)).click();    System.out.println("Title of this page is : "+driver.getTitle());
		    driver.get("https://bbc.com");
		    
			System.out.println("----------------------------------");
			i++;
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
	
	public boolean isElementPresent(String elementXpath) {
		List<WebElement> links = driver.findElements(By.xpath(elementXpath));
		int s=links.size();
		if(s==0)
			return false;
		if(driver.findElement(By.xpath(elementXpath)).isDisplayed()&&driver.findElement(By.xpath(elementXpath)).isEnabled()) 
			return true;
			
		else
			return false;
		}
}
