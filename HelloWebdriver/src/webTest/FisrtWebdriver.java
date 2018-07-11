package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FisrtWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debashis\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.rediff.com/");
	driver.findElement(By.className("homesrchbox")).sendKeys("Ram");
	driver.findElement(By.className("newsrchbtn")).click();
	
	String url = driver.getCurrentUrl();
	if (url.equals("http://shopping.rediff.com/product/Ram?sc_cid=shopping_inhomesrch")) {
		System.out.println("pass");
	}
	
	driver.close();

	}
	
	
}
