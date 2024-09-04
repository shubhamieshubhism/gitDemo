package seleniumPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_learning {
	@Test
	public void softTestCaseValidation() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("I am writing a test script");
		softassert.assertTrue(true);
		//condidtion which states it is true
		
		System.out.println("I am writing a java logic");
		softassert.assertTrue(false);
		//condidtion which states it is false
		softassert.assertAll(); 
		
		/*
		 * softassert will mention all the exception within the same test case if at the
		 * end of all the logic we invoke the method assertAll()
		 */
		
	}
	

}
