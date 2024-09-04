package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningAssertions {
	//validation check point
	@Test
	public void PramaeterA() {
		//String actual = "my Channel is about this and that";
		//String expected="my channel is about this and that";
		
		//Assert.assertEquals(actual, expected);
		//Assert.assertTrue(true!=false);
		//Assert.fail();
		//Assert.fail("i am deliberately failing the test case parameterA");
		Assert.assertTrue(true!=false);
		boolean actual=1<2;
		boolean expected=2<3;
		Assert.assertEquals(actual, expected, "need to know that logic is vague");
	}

}
