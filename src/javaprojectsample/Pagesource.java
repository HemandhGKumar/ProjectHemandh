package javaprojectsample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String ps=driver.getPageSource();
		if(ps.contains("Gmail"))
		{
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("Gmail is not present");
		}

	}

}
