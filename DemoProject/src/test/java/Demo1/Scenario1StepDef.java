package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Scenario1StepDef {
	WebDriver driver;

	@Given("^navigate to gmail page$")
	public void navigate_to_gmail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}

	@When("^user logged in using username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logged_in_using_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9823334335");	 
	     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sairam@1234");
		 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@Then("^render home page$")
	public void render_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@Given("^navigate to FB page and clicked on homepage$")
	public void navigate_to_FB_page_and_clicked_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9823334335");	 
	     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sairam@1234");
		 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//*[@class='x1lliihq x1k90msu x2h7rmj x1qfuztq xcza8v6']")).click();
	}


	@SuppressWarnings("deprecation")
	@When("^user should check account$")
	public void user_should_check_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String homepage = driver.findElement(By.xpath("//*[contains(text(),'Home')]")).getAttribute("value");
		System.out.println(homepage);
	}

	@Then("^closed browser$")
	public void closed_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
		driver =null;
	}
}
