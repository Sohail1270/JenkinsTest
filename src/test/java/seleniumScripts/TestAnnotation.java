package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestAnnotation {
	
	// in order to execute below script written in the method use TestNG annotation
	// ** TestNG annotation will be always written above the Java method
	
	@Test
	public void createAccount() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sohail@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("sohailsonu");
		
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		Thread.sleep(1500);
		


		driver.close();
		/*
		 * driver.get(
		 * "https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin"
		 * ); driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");
		 * driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys(
		 * "admin@123");
		 * driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
		 */
	}
	
	/*
	 * @Test public void login() // this will be referred as test method { WebDriver
	 * driver = new ChromeDriver(); driver.manage().window().maximize(); driver.get(
	 * "https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in"
	 * ); driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("admin");
	 * driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys(
	 * "admin@123");
	 * driver.findElement(By.xpath("//button[@id='wpLoginAttempt']")).click();
	 * 
	 * }
	 */
	/*
	 * @Test
	 * 
	 * public void teardown() { WebDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize(); driver.get(
	 * "https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in"
	 * ); driver.close();
	 * 
	 * }
	 */
}

