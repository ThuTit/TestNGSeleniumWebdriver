package DemoTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
public class NewTest {
	
	public WebDriver driver ;
	
  @BeforeClass
  public void init(){
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
	  driver = new FirefoxDriver() ;
  }
  @Test
  private void login()throws InterruptedException{
	  driver.get("http://www.demo.guru99.com/v4/index.php");
	  driver.findElement(By.name("uid")).sendKeys("mngr87793");
	  driver.findElement(By.name("password")).sendKeys("bubyjEq");
	  driver.findElement(By.name("btnLogin")).click();
  }
  @Test
  public void title() throws InterruptedException{
	  String expectedTitle = "Guru99";
	  String actualTitle = "";
	  driver.get("http://www.demo.guru99.com/v4/index.php");
	  actualTitle = driver.getTitle();
	  if(actualTitle.contentEquals(expectedTitle)){
		System.out.println("Pass!");
	  }
	  else 
		System.out.println("Fail!");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
