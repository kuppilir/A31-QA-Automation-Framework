import org.testng.Assert;
import org.testng.annotations.Test;
public class homework16 extends BaseTest {
  @Test(enabled = true, priority = 0, description = "Redirected to Registration page")

  public static void navigation() {
      Webdriver.driver = new ChromeDriver();
      Webdriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


      String url = "https://testpro.io/";
      driver.get url ();
      Webelement registrationlink = driver.findElement(By.cssSelector("[id='hel']"));
      registrationlink.click();
      string registration url = "https://bbb.testpro.io/registration.php";
  }


}

