package stepdefininations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_steps {
	WebDriver driver;
	public Register_steps(WebDriver driver) {
		this.driver = driver;

	}

	public void Register(String email,String pwd,String cfmpwd,String name) {

		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//a[text()=\"Login/Signup\"]")).click();
		System.out.println("user has opened login page");
		driver.findElement(By.xpath("//a[text()=\"Not a member? Signup\"]")).click();
		System.out.println("user opts to register");
		
		driver.findElement(By.xpath("//input[@name=\"email_id\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name=\"pwd2\"]")).sendKeys(cfmpwd);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(name);

		System.out.println("user enters details required");
	}
}


