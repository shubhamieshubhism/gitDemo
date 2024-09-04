package seleniumPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcepts {
	@Test(dataProvider = "getData")
	public void RegisteringNewUser(String username, String browser, int mobile, String email) {

	}

	@DataProvider
	public Object[][] getData() {
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
