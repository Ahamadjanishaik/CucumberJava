package steps_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondOpinion_steps {
	
	WebDriver driver;
	
	@Given("Open the browser, enter sparsh hospital url")
	public void open_the_browser_enter_sparsh_hospital_url() {
	    
		driver = new ChromeDriver();
		driver.get("https://www.sparshhospital.com/about-sparsh/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

	@Given("click on hospitals dropdown and select Yeswanthpur hospital")
	public void click_on_hospitals_dropdown_and_select_yeswanthpur_hospital() {
	    
		driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]")).click();
		driver.findElement(By.linkText("SPARSH Hospital, Yeswanthpur")).click();
		
		
	}

	@When("User clicks second opinion link")
	public void user_clicks_second_opinion_link() {
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		WebElement secondoption = driver.findElement(By.cssSelector("[href='https://www.sparshhospital.com/second-opinion/']"));
				
		jsExecutor.executeScript("arguments[0].click();",secondoption );


	}

	@When("User enters firstname lastname phnum email")
	public void user_enters_firstname_lastname_phnum_email() {
		driver.findElement(By.name("secondopinion_first_name")).sendKeys("James");
	    driver.findElement(By.name("secondopinion_last_name")).sendKeys("Bond");
	    driver.findElement(By.name("secondopinion_phone")).sendKeys("9878685848");
	    driver.findElement(By.name("secondopinion_email")).sendKeys("jamesbond007@gmail.com");

	}

	@When("Upload the reports and enter message")
	public void upload_the_reports_and_enter_message() {
		driver.findElement(By.name("secondopinion_message")).sendKeys("This is my Second Option");

	}

	@Then("Click on send button")
	public void click_on_send_button() {
		driver.findElement(By.id("secondopinion_submit")).click();
	}


	



	
}
