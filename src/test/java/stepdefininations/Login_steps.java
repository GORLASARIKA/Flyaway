package stepdefininations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_steps {
	WebDriver driver;
	
	public Login_steps(WebDriver driver) {
		this.driver = driver;
		
	}

	public void Login(String email,String pwd) {
		
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name=\"email_id\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pwd);
	    System.out.println("user provide name and password");

	}

}
