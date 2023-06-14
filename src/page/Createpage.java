package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createpage{
ChromeDriver driver;
By createpagelink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div6");

public Createpage(ChromeDriver driver)
{
this.driver=driver;	
}
public void createpageclick()
{
driver.findElement(createpagelink).click();	
}
public void getstartedclick()
{
driver.findElement(getstarted).click();	
}
}
