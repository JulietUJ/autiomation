package automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basepage {

	 public WebDriver driver;

    @BeforeClass

    public void preCondition()

    {

  	 


                driver = new ChromeDriver();

//code is to open the URL in browser

                driver.get("https://www.meesho.com");

//code  to maximize window

                driver.manage().window().maximize();

//code is to wait for 40 seconds

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

    }

    @AfterClass

    public void postCondition() 

    {


//code is to close the browser

                driver.quit();

    }

}
