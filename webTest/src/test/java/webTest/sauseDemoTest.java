package webTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class sauseDemoTest {
	
	WebDriver driver;
	@BeforeTest
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void logIn() // logIn using relative path
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Test(priority=2)
	public void addTocart() // add to cart "Test.allTheThings() T-Shirt (Red)"
	{
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
	}
	
	@Test(priority=3)
	public void viewProduct()
	{
		//view product 
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
	
	@Test(priority=4)
	public void checkOut()
	{
		//check out the product
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	
	
	
	

}
