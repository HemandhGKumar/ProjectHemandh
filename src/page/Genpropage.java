package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Genpropage {
	ChromeDriver driver;
	By username=By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input");
	By password=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input");
	By sort=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By item1=By.name("add-to-cart-sauce-labs-onesie");
	By item2=By.name("add-to-cart-sauce-labs-bike-light");
	By item3=By.name("add-to-cart-sauce-labs-bolt-t-shirt");
	By item4=By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
	By item5=By.name("add-to-cart-sauce-labs-backpack");
	By item6=By.name("add-to-cart-sauce-labs-fleece-jacket");
	By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	By checkout=By.xpath("//*[@id=\"checkout\"]");
	By firstnamecheckout=By.xpath("//*[@id=\"first-name\"]");
	By lastnamecheckout=By.xpath("//*[@id=\"last-name\"]");
	By zipcode=By.xpath("//*[@id=\"postal-code\"]");
	By contbtn=By.xpath("//*[@id=\"continue\"]");	
	By finish=By.xpath("//*[@id=\"finish\"]");
	By backhome=By.xpath("//*[@id=\"back-to-products\"]");
	By hmbrgr=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By hmbrgrlogout=By.xpath("//*[@id=\"logout_sidebar_link\"]");
	
	public Genpropage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void login1(String username1,String pswrd)
	{
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(pswrd);
		driver.findElement(login).click();
		}
	public void dropdwn()
	{
		WebElement dropbtn=driver.findElement(sort);
		Select btndrop=new Select(dropbtn);
		btndrop.selectByValue("lohi");
	}
	public void add()
	{
		List<WebElement>p=driver.findElements(By.xpath("//*[@class=\"btn btn_primary btn_small btn_inventory\"]"));
		for(WebElement allproducts:p)
		{
			allproducts.click();
		}
		
	}
	public void cart()
	{
		driver.findElement(cart).click();
	}
	public void removeitems()
	{
		List<WebElement>r=driver.findElements(By.xpath("//*[@id=\"cart_contents_container\"]"));
		for(WebElement r1:r)
		{
			String txt=r1.getText();
			if(txt.contains("$9.99"))
					{
				driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
					}
			if(txt.contains("$7.99"))
			{
				driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
			}
		}
	}
	public void checkoutbtn()
	{
		driver.findElement(checkout).click();;
	}
	public void details()
	{
		driver.findElement(firstnamecheckout).sendKeys("name1");
		driver.findElement(lastnamecheckout).sendKeys("name2");
		driver.findElement(zipcode).sendKeys("87456");
		driver.findElement(contbtn).click();
	}
	public void finishbtn()
	{
		driver.findElement(finish).click();
	}
	public void home()
	{
		driver.findElement(backhome);
	}
	public void hbrgr()
	{
		driver.findElement(hmbrgr).click();
		
	}
	public void logout()
	{
		driver.findElement(hmbrgrlogout).click();
	}

}