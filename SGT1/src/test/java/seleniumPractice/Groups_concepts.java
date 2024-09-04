package seleniumPractice;

import org.testng.annotations.Test;
@Test(groups="CompleteClassLevelTest")
public class Groups_concepts {
	/*
	 * Groups - it is a simple feature of TestNGwhich //helps us to assigns
	 * test/classes to a certain //goup(test)
	 * 
	 * execute - we will need testNG.xml file
	 */	
	@Test(groups= {"smoke"})
	public void testCaseNo1(){
		System.out.println("Testcaseno1");
		
	}
	
	@Test(dependsOnMethods = {"testCaseNo1"},groups= {"smoke","sanity"})
	public void testCaseNo2(){
		System.out.println("Testcaseno2");
		
	}
	
	@Test(groups= {"sanity","regression"})
	public void testCaseNo3(){
		System.out.println("Testcaseno3");
		
	}
	
	@Test(groups= {"windows.sanity"})
	public void testCaseNo4(){
		System.out.println("Testcaseno4");
		
	}
	
	@Test(groups= {"linux.regression"})
	public void testCaseNo5(){
		System.out.println("Testcaseno5");
		
	}

}
