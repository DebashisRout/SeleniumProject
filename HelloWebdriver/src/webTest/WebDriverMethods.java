package webTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debashis\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com/");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		/* String Pagesource = driver.getPageSource();
		System.out.println(Pagesource); */
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		driver.navigate().to("https://www.youtube.com/watch?v=yExZWUtcD-Y&index=20&list=PLyGqUe6Oa_5Elc-Dv9jPzHKDx-m2GvMOd");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh(); 
		
		driver.get("http://www.rediff.com/");
		boolean a = driver.findElement(By.className("newsrchbtn")).isEnabled();
		System.out.println(a);
		
		boolean b = driver.findElement(By.className("newsrchbtn")).isDisplayed();
		System.out.println(b);
		

		String Aname = driver.findElement(By.className("newsrchbtn")).getAttribute("type");
		System.out.println(Aname);
		
		WebElement search_id = driver.findElement(By.id("srchword"));
		search_id.sendKeys("Mobile");
		
		String click_partial = driver.findElement(By.partialLinkText("rediff")).getText();
		System.out.println(click_partial);
		WebElement click_partiallink = driver.findElement(By.partialLinkText("rediff"));
		click_partiallink.click();
		
		WebElement alert_Check = driver.findElement(By.name("proceed"));
		alert_Check.click();
		
		Alert alert = driver.switchTo().alert();
		String Error_msg = alert.getText();
		System.out.println(Error_msg);
		alert.dismiss();
		
		driver.get("https://www.carmax.com/");
		
		Actions builder = new Actions(driver);
		
		WebElement menuEelement = driver.findElement(By.id("buysMenu"));
		
		builder.moveToElement(menuEelement).build().perform();
		driver.findElement(By.linkText("Cars For Sell")).click();
		
		driver.manage().window().maximize();
		// driver.close();	
		// driver.quit();
		
	}

}
