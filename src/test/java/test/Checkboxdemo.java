package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		// Step 1:- create a common xpath.

		// Step 2:- store the elements in list

		// Step 3:- iterate it using for each loop

		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// System.out.println(ele.size());

		for (WebElement clk : ele) {

			Thread.sleep(2000);
			clk.click();

		}

		Thread.sleep(3000);
		driver.close();

	}

}
