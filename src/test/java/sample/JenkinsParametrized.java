package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsParametrized {
	@Test
	 public void demo() throws InterruptedException
	 {
		 WebDriver driver=null;
		 String browser=System.getProperty("browser");
		 switch(browser) {
		  case "chrome":
			 System.setProperty("WebDriver.Chrome.Driver", "./src/main/resources/chromedriver.exe");
			 driver=new ChromeDriver();
			 break;
		 case "firefox":
			 driver=new FirefoxDriver();
			 break;
		 case "edge":
			 driver=new EdgeDriver();
			 break;
		 default:
		     System.out.println("Invalid Browser");
		 }
	 Thread.sleep(2000);
	 driver.quit();
	}
}
