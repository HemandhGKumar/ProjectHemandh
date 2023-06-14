package test;

import org.testng.annotations.Test;

import page.Createpage;

public class Createpagetest extends Baseclass1 {
@Test
public void createpagetest()
{
Createpage crte=new Createpage(driver);
crte.createpageclick();
crte.getstartedclick();
}
}
