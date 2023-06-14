package test;

import java.time.Duration;

import org.testng.annotations.Test;

import page.Flights;

public class Flighttest extends Baseclassexpedia {
@Test
public void flighttest()
{
	
	Flights f=new Flights(driver);
	f.clickflight();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	f.boardingselect();
	
	f.boardingname("Brussels");
	
	f.tocity();
	
	f.tocityname("Newyork");
	
	f.datefrom();
	
	f.done();
	
	f.travellerselect();
	
	f.economy();
	
	

	}
}
