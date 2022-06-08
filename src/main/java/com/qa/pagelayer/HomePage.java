package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.BaseClass;
import com.qa.util.UtilClass;

public class HomePage extends BaseClass{

	UtilClass u;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[1]")
	private WebElement tShirt;
	
	@FindBy(xpath ="(//a[@class='button ajax_add_to_cart_button btn btn-default']/child::span)[1]")
	private WebElement addToCart;

	public void tShirt()
	{
		u = new UtilClass();
		u.action();
	}
	
}
