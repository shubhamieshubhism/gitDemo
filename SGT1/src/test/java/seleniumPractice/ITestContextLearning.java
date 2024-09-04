package seleniumPractice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContextLearning {
	// it is an interface used in TestNG it help to share data
	// within the test case which are in a single java file or in the same class
	@Test(priority = 1)
	public void SwitchOn(ITestContext context) {
		System.out.println("Laptop is switch on ");
		context.setAttribute("LaptopName", "ASUS");

	}

	@Test(priority = 1, dependsOnMethods = "SwitchOn")
	public void Operating(ITestContext context) {
		System.out.println("Laptop is Running");
		String LaptopBrand = (String) context.getAttribute("LaptopName");
		System.out.println("Brand name is : " + LaptopBrand);
		context.setAttribute("LaptopSpeed", "very Fast");

	}

	@Test(priority = 1, dependsOnMethods = { "SwitchOn", "Operating" })
	public void SwitchOff(ITestContext context) {
		System.out.println("Laptop is switch off");
		String LaptopSpeed = (String) context.getAttribute("LaptopSpeed");
		System.out.println("Laptop speed is : " + LaptopSpeed);
	}

}
