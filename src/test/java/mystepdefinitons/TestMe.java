package mystepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TestMe {
	WebDriver driver;
	@Given("test me app is launched by the user")
	public void test_me_app_is_launched_by_the_user() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  Thread.sleep(5000);
	}

	@When("User clicks on SignIn link in landing page")
	public void user_clicks_on_SignIn_link_in_landing_page() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("user provides the valid username {string}")
	public void user_provides_the_valid_username(String uname) {
	    driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@Then("user provides the valid password {string}")
	public void user_provides_the_valid_password(String pwd) {
	  driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("user clicks for the submission of the data")
	public void user_clicks_for_the_submission_of_the_data() {
	 driver.findElement(By.name("Login")).click();
	}

	@Then("verfifies the login status for the account")
	public void verfifies_the_login_status_for_the_account() {
	  String actual =driver.findElement(By.linkText("SignOut")).getText();
	  String expected="SignOut";
	  Assert.assertEquals(expected, actual);
	  driver.close();
	  
	}

}
