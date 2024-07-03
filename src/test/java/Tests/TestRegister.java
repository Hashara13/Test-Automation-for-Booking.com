package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestRegister {
	 WebDriver driver;

@BeforeSuite
public void launchWindow() {
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
}

@Test
public void RegisterInput() {
	driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCKyBQoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4q0QRVcHdESnBpQnhvb01jbDYzc3ZTOEdIdkY3bFdUVTFnRC1aM3JKejRDY2ZubmVVQVpBUF9yUmZwRGNwcTVzWUNFUWNaSmtkNlB2cE9ZdkRfSDBhM042NUlRckRiRVRQa3lJMDNmeHlKbG1GNml5TmVPQ3BoY0pHdWotS0hGRjdBTmp1UzIzT1pvS2oyRkhZdHdZU3BFb3RCWmxTaURwVTB1bzk4dG9kNVhBdmtBd0swMXNILUZVa1pZcDh0Rjk0RzVrOGlSazZfRDRzSWZESmRnVlllbmpWb1RqTkwtRXlXQ0kxYWp0RFNtR3hYSDFFaVJsb0RvRzM5WkRGOFh5Q0NTTFk0YUpCZEx6SmQ2VEEtZGFxMGY3RFZaaW5ubWQ5dWFfcWIxTkZrWUpQbjgtSlZ6YXBOMHZUTlFkY09vMkdDSDBqNzE1M2p6QnJFb3ZyeHhHZ0labWFUdzlfZER3WFB1Q3cwSEVqdG1oV0JtdGtLN1Q2UkNodFRISXNLLV9rUDZTNTRrTkhkaV9vR3VkenBjWXJrM3pOVldTdmpqdmV4OWljYkgtZmEzTEJqenVYSmlrLTV1UXd2VmxxYlhDeWREd00yd2lvTTV5X3dZbGs3WGR3WVNuelMtTmRjMnVJX0ZxSDlWQXpnY0RKM1k1SE9RSklLVTI5MVRBYjV3UmN1aWc3dmV0WUNfXy1qdjRuNy1BT2ZkVExRTDBrRjR5RXlpUEF4dmxpLUhYUT09KmV5SnBaQ0k2SW5SeVlYWmxiR3hsY2w5b1pXRmtaWElpZlE9PUIEY29kZSoxCI7IEjCa2ITWlY4nOgBCAFj8xpW0BpIBEHRyYXZlbGxlcl9oZWFkZXKaAQVpbmRleA");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Test
public void validInput() {
	WebElement MailInput=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	MailInput.sendKeys("nethhashara@gmail.com");
	WebElement Button=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div[2]/div[2]/button"));
	Button.click();
}
@Test
public void InvalidInput() {
	WebElement MailInput=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	MailInput.sendKeys("nethhara@gmail.com");
	WebElement Button=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div[2]/div[2]/button"));
	Button.click();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}
@AfterSuite
public void close() {
	driver.close();
}
}
