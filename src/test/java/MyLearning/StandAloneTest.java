package MyLearning;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("test111@mail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test1234");
		driver.findElement(By.id("login")).click();
		
		List<WebElement> prodWebElements =  driver.findElements(By.cssSelector(".mb-3"));
		System.out.println(prodWebElements);
		System.out.println(prodWebElements.size());
		
		for(int i=0;i<prodWebElements.size(); i++)
		{
			String element = prodWebElements.get(i).getText();
			System.out.println(element);
		}
		

	}

}
