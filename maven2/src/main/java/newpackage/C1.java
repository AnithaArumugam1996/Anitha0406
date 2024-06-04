package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver m2= new ChromeDriver();
		m2.get("https://jqueryui.com/droppable/");
		
	}

}
