package stepdefininations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Tickets {
	 WebDriver driver;
	 public Tickets (WebDriver driver) {
		 this.driver=driver;
		
	}

	public void Tickets(String source,String destination) {
		Select se = new Select(driver.findElement(By.xpath("//select[@name=\"source\"]")));
		// Select the option by index
		se.selectByValue(source);
		Select se1 = new Select(driver.findElement(By.xpath("//select[@name=\"destination\"]")));
		se1.selectByValue(destination);

	}

}
