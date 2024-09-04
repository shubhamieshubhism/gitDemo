package seleniumPractice;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Response_code {
	public static WebDriver driver;

	@Test
	public void response_test() {

		String url = "https://google.com";

		int response_code = 0;

		try {
			response_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("the response code for: " + url + " : " + response_code);
			if (response_code == 200) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://google.co.in");
				System.out.println("The title of the page is : " + driver.getTitle());
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
