package SeleniumProject.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;
import org.testng.Assert;

import junit.framework.TestCase;  

public class BankingTest extends TestCase{
	
	//download chrom driver from https://googlechromelabs.github.io/chrome-for-testing/
	public String baseUrl = "http://localhost:8080/hello";  
	String driverPath = "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";  
	
	public WebDriver driver;
	
	@Test             
	public void testGoogle() {      
		// set the system property for Chrome driver      
		System.out.println("inside testGoogle");
		System.setProperty("webdriver.chrome.driver", driverPath);  
		System.out.println("inside testGoogle "+driverPath);
		// Create driver object for CHROME browser  
		driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.manage().window().maximize();  
		driver.get(baseUrl);  
		
		// get the current URL of the page  
		String URL= driver.getCurrentUrl();  
		System.out.print(URL);  
		
		//get the title of the page  
		String title = driver.getTitle();                  
		System.out.println(title);
		
		
		

        waitForMe(2000);
		// Find the search input element
        //WebElement searchInput = driver.findElement(By.name("q"));
		WebElement e = driver.findElement(By.xpath("//*[text()='DilipKumar's Banking project']"));
		System.out.println("Element with text(): [" + e.getText() +"]");
		Assert.assertEquals("Welcome to Finance Me website", e.getText());
		
		driver.quit();
        
		waitForMe(1000);
        // Enter search text
        //searchInput.sendKeys("Dilip");

        //waitForMe(1000);
        
        // Submit the search form
        //searchInput.submit();

        //waitForMe(5000);

        // Close the browser
        //driver.quit();
	}   
	
	public void waitForMe(int time) {
		// Wait for a few seconds to see the results
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	@BeforeTest  
	public void beforeTest() {    
		System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
		//driver.quit();  
		System.out.println("after test");  
	}         	

}
