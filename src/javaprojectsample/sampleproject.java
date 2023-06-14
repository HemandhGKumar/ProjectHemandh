package javaprojectsample;

import org.openqa.selenium.chrome.ChromeDriver;

public class sampleproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.audi.com");
		String actualtitle=driver.getTitle();
		System.out.println("Actual tilte is "+actualtitle);
		String expectedtitle="Audi";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		

	}

}
