package LegacyApplication.MavenJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	
	@Test(description = "First Test", enabled = true)
	public void TestOne() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\samer.rahal\\eclipse-workspace\\TestProject\\param.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to(prop.getProperty("URL"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("usernam")));
		System.out.println("First Maven Test");
		driver.quit();
	}
	
	@Test(description = "Second Test", enabled = true)
	public void TestTwo()
	{
		System.out.println("Second Maven Test");
	}


}
