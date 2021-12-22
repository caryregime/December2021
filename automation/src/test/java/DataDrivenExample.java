import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExample {

	@DataProvider(name = "credentialsProvider")
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "dennis";
		data[0][1] = "42394e";
		data[1][0] = "david";
		data[1][1] = "0987";
		
		return data;
	}

	@Test(dataProvider="credentialsProvider")
	public void canPrintSomething(String userName, String password) {
		System.out.println(userName + "," + password);
	}
}
