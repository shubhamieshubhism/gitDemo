package seleniumPractice;

import java.io.IOException;
import java.time.Duration;
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

public class Handle_Box_elementLinks {
	public static WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@Test
	public void boxElementHandle() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://cnn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement box = driver.findElement(By.xpath(
				"/html/body/div[1]/section[3]/section/div/section/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/div[4]/div/div/div"));
		List<WebElement> boxlist = box.findElements(By.tagName("a"));
		System.out.println("totol links in the box : "+boxlist.size());
		
		for(int i=0;i<boxlist.size();i++) {
			 System.out.println(boxlist.get(i).getText()+"presense of this link is : "+boxlist.get(i).isDisplayed());
			 String url = boxlist.get(i).getAttribute("href");
			 System.out.println(url);
			 boolean result = validateRespose(url);
			 soft.assertTrue(result, "Invalid response");
			 boxlist.get(i).click();
			 System.out.println("Title of the page is : "+driver.getTitle());
			 driver.get("https://cnn.com");
			 box = driver.findElement(By.xpath(
						"/html/body/div[1]/section[3]/section/div/section/div/div/div/div[3]/div/div[1]/div[1]/div/div[2]/div/div[3]/div/div/div"));
			 boxlist = box.findElements(By.tagName("a"));
			 System.out.println("-------------------------------");
			 
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
