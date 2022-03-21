package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Section3UIAutomation {

	WebDriver driver;	

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Given("I am in the initial screen of {string}")
	public void i_am_in_the_initial_screen_of(String site) {
		driver.navigate().to(site);
	}

	@And("check that is the correct {string}")
	public void check_that_is_the_correct(String site) {
		String title = driver.getTitle();
		assertEquals("Jobs at Tribal Credit", title);
		String url = driver.getCurrentUrl();
		assertEquals(url, site);
	}

	@When("I filter by {string}")
	public void i_filter_by(String department) {
		WebElement departments = driver.findElement(By.id("s2id_departments-select"));
		departments.click();
		assertTrue(departments.isDisplayed());
		driver.findElement(By.id("select2List0")).click();
		List<WebElement> options = driver.findElements(By.className("selectedOption"));
		for (WebElement option : options) {
			if (option.getText() == department) {
				option.click();
			}
		}

	}

	@And("filter by {string}")
	public void filter_by(String office) {
		WebElement offices = driver.findElement(By.id("s2id_offices-select"));
		offices.click();
		assertTrue(offices.isDisplayed());
		List<WebElement> options = driver.findElements(By.className("select2-result-label"));
		for (WebElement option : options) {
			if (option.getText().contains(office)) {
				option.click();
				System.out.println(option.getText().contains(office));
			}
		}

	}

	@Then("it should be displayed the {string}")
	public void it_should_be_displayed_the(String job) {
		List <WebElement> teste = driver.findElements(By.className("opening"));
		for(WebElement option : teste) {
			if(option.getText() == job) {
				System.out.println("deu certo");
			}
			System.out.println(option.getText());
		}
	}


		
	@After
	public void closeBrowser() {
	
		driver.close();
	}
}