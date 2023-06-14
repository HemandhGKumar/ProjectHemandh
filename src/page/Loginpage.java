package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
ChromeDriver driver;
By fbemail=By.name("email");
By fbpasswrd=By.name("pass");
By fblogin=By.name("login");

public Loginpage(ChromeDriver driver)
{
	this.driver=driver;
	}
public void setvalues(String email,String pswrd)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpasswrd).sendKeys(pswrd);
}
public void login()
{
	driver.findElement(fblogin).click();
}
}
