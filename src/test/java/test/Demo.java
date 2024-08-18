package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Build your own computer")).click();

		Thread.sleep(2000);

		List<WebElement> chk = driver
				.findElements(By.xpath("//input[@type='checkbox' and @name='product_attribute_5']"));

		System.out.println(chk.size());

		for (WebElement ele : chk) {
			Thread.sleep(3000);
			ele.click();
		}

		Thread.sleep(3000);
		driver.close();

	}

}
