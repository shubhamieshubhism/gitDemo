package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener{
	
	//What are Listeners ?

		//Answer: Listeners help us to understand the staus quo of execution of Test Cases. Help us manage end test result

		//Is is mandatory to use Listeners? Have you used Listeners in your project?

		//Answer-No (You may chose not to)

		//How do we implement Listeners?

		//Answer: Via testng.xml file by giving <listeners> tag

		//What are the important Interfaces we need to keep in mind while introducing Listeners in our Framework?

		//Answer - ITestListener(running test case), ITestResult(pass, fail, skips), ITestContext contextual meaning)
		
	    //Step 1 - implement the interface ITestListeners

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	
	
	
	
}
