package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_vs_Softassert {
	@Test
	public void HardAssertLogic() {
		System.out.println("This is my first atatement");
		Assert.assertTrue(true);
		
		int i=100,j=50;
		System.out.println("The sum is : "+(i+j));
		Assert.assertTrue(true);
		
		System.out.println("This is my last logic statement inside this hardassert logic test case");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void SoftAssertLogic() {
		SoftAssert soft = new SoftAssert();
		System.out.println("This is my softassert statement logic");
		soft.assertTrue(true);
		
		int k=100,l=99;
		System.out.println("The subtracted value is : "+(k-l));
		soft.assertTrue(false);
		
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1==b2);
		soft.assertEquals(b1, b2,"not equal");
		soft.assertAll();
		
		
	}

}
