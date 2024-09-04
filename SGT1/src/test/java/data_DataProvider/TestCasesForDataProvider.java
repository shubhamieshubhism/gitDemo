package data_DataProvider;

import org.testng.annotations.Test;

public class TestCasesForDataProvider {
	@Test(dataProviderClass=Data.class,dataProvider="getData")
	public void addUser(String username,String browser,int mobile,String email) {
		System.out.println(username+"-->"+browser+"-->"+mobile+"-->"+email+"-->");
	}
	
	@Test(dataProviderClass=Data.class,dataProvider="getData")
	public void RegisterUser(String username,String browser,int mobile,String email) {
		System.out.println(username+"-->"+browser+"-->"+mobile+"-->"+email+"-->");
	}
	
	@Test(dataProviderClass=Data.class,dataProvider="getData")
	public void deleteUser(String username,String browser,int mobile,String email) {
		System.out.println(username+"-->"+browser+"-->"+mobile+"-->"+email+"-->");
	}

}
