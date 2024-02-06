import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public String baseUrl = "https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage";
	public WebDriver driver = new ChromeDriver();
	
	 public void WebDriverWait(WebDriver driver, Duration timeout) {
		  
		  }
	
	
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
  }
	
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement userName = driver.findElement(By.xpath("//*[@id=\"usernameField\"]"));
	  userName.sendKeys("vkmalkotia98@gmail.com");
	  
	  WebElement password = driver.findElement(By.xpath("//*[@id=\"passwordField\"]"));
	  password.sendKeys("malkotia77");
	  
	  WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]"));
	  loginButton.click();
	  
	  WebElement viewProfile = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[3]/div/div[3]/div[2]/a"));
	  viewProfile.click();
	  
	  WebElement pencilButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div[1]/em"));
	  pencilButton.click();
	  
	  WebElement nameTxtbox = driver.findElement(By.xpath("//*[@id=\"name\"]"));
	  
	  nameTxtbox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  nameTxtbox.sendKeys("Vivek Malkotia");
	  
	  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[9]/div[2]/div/form/div[7]/div/button"))).click();
	 System.out.println("Updated--------------------------");
	 
  }
  

  @AfterTest
  public void afterTest() {
	//driver.close();
	//driver.quit();
  }

}
