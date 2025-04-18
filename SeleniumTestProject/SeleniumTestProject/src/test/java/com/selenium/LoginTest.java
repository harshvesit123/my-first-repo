package com.selenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginTest {
WebDriver driver;
@BeforeTest
public void setup() {
System.setProperty(&quot;webdriver.chrome.driver&quot;,
&quot;C:\\Users\\Admin\\myfirst\\SeleniumTestProject\\chromedriver.exe&quot;);
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(&quot;file:///C:/Users/Admin/myfirst/SeleniumTestProject/index.html&quot;); // Change
this to your actual login page URL
}
@Test
public void testLogin() {
WebElement username = driver.findElement(By.id(&quot;username&quot;));
WebElement password = driver.findElement(By.id(&quot;password&quot;));
WebElement loginButton = driver.findElement(By.id(&quot;login&quot;));
username.sendKeys(&quot;testuser&quot;);
password.sendKeys(&quot;password123&quot;);
loginButton.click();
}
@AfterTest
public void tearDown() {
driver.quit();
}
}