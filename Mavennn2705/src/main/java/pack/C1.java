package pack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C1 {
	
	@Parameters({"A", "B"}) //A=u, B=v
	@Test
	public void p1(String u, String v)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.mycontactform.com");
	    //id
	    ob.findElementById("user").sendKeys(u);
	    
	    //name
	    ob.findElementByName("pass").sendKeys(v);
	    
	    ob.findElementByClassName("btn_log").click();

	}

}
