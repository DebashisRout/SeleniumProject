package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debashis\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.rediff.com/");
	
	/* WebElement search_id = driver.findElement(By.id("srchword"));
	search_id.sendKeys("Mobile");
	search_id.clear();
	
	WebElement search_name = driver.findElement(By.name("srchword"));
	search_name.sendKeys("Mobile");
	search_name.clear(); 
	
	WebElement search_class = driver.findElement(By.className("homesrchbox"));
	search_class.sendKeys("Mobile");
	search_class.clear(); */
	
	WebElement search_tagname = driver.findElement(By.tagName("input"));
	search_tagname.sendKeys("Mobile");
	// search_tagname.clear();
	
	// WebElement search_xpath = driver.findElement(By.xpath(""));
	// search_xpath.sendKeys("Mobile");
	// search_xpath.clear();
	
	// WebElement click_linktext = driver.findElement(By.linkText("rediffmail"));
	// click_linktext.click();
	
	WebElement click_partiallink = driver.findElement(By.partialLinkText("rediff"));
	click_partiallink.click();
	
	// WebElement serach_cssSelector = driver.findElement(By.cssSelector(""));
	// serach_cssSelector.sendKeys("Mobile");
	
	}
	
}
