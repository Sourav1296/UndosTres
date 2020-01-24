package parallelTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowseerScript {
	
	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
					//create Edge instance
					driver = new EdgeDriver();
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		driver.get("https://prueba.undostres.com.mx/");
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/input[1]")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/input[1]")).sendKeys("5523261151");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/input[1]")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	
	driver.findElement(By.xpath("//div[contains(@class,'box menuitem')]//div[3]//div[1]//button[1]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("4111111111111111");
	Thread.sleep(1000);

	
	driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("11");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2025");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("111");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]")).click();
	
	
	}
    }


