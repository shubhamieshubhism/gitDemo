package data_DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data {
	
	
	@DataProvider
	public static Object[][] getData(Method name) {
		System.out.println("TestCase which has the method is : "+name.getName());
		Object[][] data = new Object[3][4];
		data[0][0] = "user";
		data[0][1] = "chrome";
		data[0][2] = 543210;
		data[0][3] = "sgt@gmail.com";

		data[1][0] = "user1";
		data[1][1] = "firefox";
		data[1][2] = 543211;
		data[1][3] = "pgt@gmail.com";

		data[2][0] = "user2";
		data[2][1] = "edge";
		data[2][2] = 543212;
		data[2][3] = "gct@gmail.com";

		return data;
	}
}
