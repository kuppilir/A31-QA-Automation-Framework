import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homework16 extends BaseTest {
  @Test(enabled = true, priority = 0, description = "navigationTest")

//  public static void  navigationTest() {
    public static void navigationTest() throws InterruptedException {

    // Webdriver.driver = new ChromeDriver();
     // Webdriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     String url = "https://bbb.testpro.io/";
       driver.get (url) ;
      Thread.sleep(2000);
       WebElement registrationLink = driver.findElement(By.cssSelector("[id='hel']"));
      registrationLink.click();

      String  registrationUrl = "https://bbb.testpro.io/registration.php";
      Assert.assertEquals(driver.getCurrentUrl(), registrationUrl);
      Thread.sleep(2000);
      driver.quit();
  }
  }




