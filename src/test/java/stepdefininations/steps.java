package stepdefininations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	public static WebDriver driver;
	Register_steps register = new Register_steps(driver);
	Login_steps login = new Login_steps(driver);
	Tickets ticket = new Tickets(driver);
	


	@Given("user has opened chrome browser")
	public void user_has_opened_chromebrowser() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gsarika\\installs\\chromedriver_win32_96\\chromedriver_96.exe");
		driver = new ChromeDriver();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user has opened application page")
	public void user_has_opened_application_page() {
		driver.get("http://localhost:8080/FlyAway/");
		driver.manage().window().maximize();
		System.out.println("user has opened Application");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("user opens register page")
	public void user_opens_register_page() {
		// Write code here that turns the phrase above into concrete actions
		register.Register("sarika6@gmail.com", "sarika","sarika","sarika");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then("user provides details to register")
	public void user_provides_details_to_register() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()=\"Signup\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Given("user clicks on login")
	public void user_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks on login");
		driver.findElement(By.xpath("//a[text()=\"Login/Signup\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	@When("user provide name and password")
	public void user_provide_name_and_password() {
	    
		login.Login("sarika@gmail.com","sarika");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("user logs in")
	public void user_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	    System.out.println("user logs in");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Given("user opens a home page")
	public void user_opens_a_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		System.out.println("user opens a home page");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user selects the source and destination")
	public void user_selects_the_source_and_destination() {
	    
		ticket.Tickets("1", "11");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@When("user submit the details")
	public void user_submit_the_details() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
	    System.out.println("user submit the details");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user books the flight")
	public void user_books_the_flight() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"Book Flight\"]")).click();
	    System.out.println("user books the flight");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("user makes the paymet")
	public void user_makes_the_paymet() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"Click to complete booking\"]")).click();
		System.out.println("user makes the paymet");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Given("user views the bookings")
	public void user_views_the_bookings() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"See Your Bookings\"]")).click();
		System.out.println("user views the bookings");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("user logout from application")
	public void user_logout_from_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
		System.out.println("user logout from application");
		
		
	    
	}
	




}
