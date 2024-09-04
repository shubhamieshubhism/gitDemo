package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Execution_Method {
	public static WebDriver driver;
	
	@Test(priority = 1, threadPoolSize=2 , invocationCount=2)
	//if you want to run this particular method in multiple threads
	public void login() {
		System.out.println("This is login test : "+ Thread.currentThread().getId());
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
	}
	
	@Test(priority = 2,threadPoolSize=2 , invocationCount=2,dependsOnMethods = {"login"})
	public void Operation() {
		System.out.println("This is operating test : "+ Thread.currentThread().getId());

	}
	
	@Test(priority = 3, threadPoolSize=2 , invocationCount=2, dependsOnMethods = {"login","Operation"})
	public void logout() {
		System.out.println("This is logout test : "+ Thread.currentThread().getId());

	}

}
