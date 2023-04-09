package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	
	public WebDriver driver;
	int pincode;
	
	@Before
	public void clearcookies() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		// driver.get("https://www.hometown.in/");
		//driver.manage().deleteAllCookies();
	}

	@Given("User navigate to the homepage")
	public void user_navigate_to_the_homepage() throws InterruptedException {
		
	  //  driver = new ChromeDriver();
	    Thread.sleep(5000);
	    driver.get("https://www.hometown.in/");
	}

	@When("User Pass inputs<search> to the search field")
	public void user_pass_inputs_search_to_the_search_field(DataTable dataTable) throws AWTException, InterruptedException {
		 List<List<String>> data = dataTable.asLists(String.class);
		    String s1 = data.get(0).get(1);
		    //String s2 = data.get(0).get(2);
		/*
		 * List<String> search = dataTable.asList(); String s = search.get(1);
		 */
	   driver.findElement(By.xpath("//input[@id='ht_generic_search']")).sendKeys(s1);
	   
	   Robot robot2 = new Robot();
	    robot2.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(4000);
	}

	@Then("Verify it takes to the corresponding search results page.")
	public void verify_it_takes_to_the_corresponding_search_results_page() {
		driver.getCurrentUrl();
		
	    
	}
	
	@Then("Verify user can able to pass pincode {int}")
	public void verify_user_can_able_to_pass_pincode(int int1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='unbxd-location-container']//input[@id='search']")).sendKeys(String.valueOf(int1));
	    
	}

	/*
	 * @Then("Verify user can able to pass pincode {string}") public void
	 * verify_user_can_able_to_pass_pincode(String string) { //this.pincode =
	 * pincode; driver.findElement(By.id("search")).sendKeys(string); // Write code
	 * here that turns the phrase above into concrete actions
	 * 
	 * }
	 */
@After
public void teardown() {
	driver.close();
}

}
