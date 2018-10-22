package Global;

import java.io.IOException;

import org.testng.annotations.Test;

public class Dependency extends TestBase {
	
	@Test
	public void OpeningBrowser() throws IOException
	{
		// This open the browser
		System.out.println("Executing Opening Browser");
		Login1();
		
	}

	@Test(dependsOnMethods=("OpeningBrowser"))
	public void FlightBooking() throws IOException
	{
		Login1();
		System.out.println("Executing Test");
	}

}

