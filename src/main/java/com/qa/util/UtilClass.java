package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.BaseClass;

public class UtilClass extends BaseClass{

	//WebDriver driver;
	public Actions a;
	public UtilClass() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void action() 
	{
		 a = new Actions(driver);
	}

}
