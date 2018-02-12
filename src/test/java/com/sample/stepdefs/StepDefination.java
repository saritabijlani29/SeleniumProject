package com.sample.stepdefs;


import org.openqa.selenium.support.PageFactory;

import com.sample.page.ElectronicsPage;
import com.sample.page.HomePage;
import com.sample.page.ProductDetailPage;
import com.sample.page.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends TestBase{
	
	@Given("^user open browser and application$")
	public void openBrowser(){
		getDriver();
		HomePage home= PageFactory.initElements(driver, HomePage.class);
		home.openApp();
	}

	@Then("^user verify homepage")
	public void verifyHomePage(){
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		home.verifyPage();
	}
	
	@When("^user click on \"([^\"]*)\" under \"([^\"]*)\" tab$")
	public void clickOnSubCategoryUnderCategory(String subCategory , String category) throws InterruptedException{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnMenuElement(subCategory,category);
	}
	
	@Then("^verify user landed on \"([^\"]*)\" page$")
	public void verifyPageHeader(String pageName){
		ElectronicsPage electronics = PageFactory.initElements(driver, ElectronicsPage.class);
		electronics.verifySubCategoryPageHeader(pageName);
	}
	
	@When("^user click on \"([^\"]*)\" tab$")
	public void clickOnTab(String tabName) {
		ElectronicsPage electronics = PageFactory.initElements(driver, ElectronicsPage.class);
		electronics.clickOnAppleItemCategoryTab(tabName);
	}
	
	@When("^user select \"([^\"]*)\" product$")
	public void selectProduct(String productName){
		ElectronicsPage electronics = PageFactory.initElements(driver, ElectronicsPage.class);
		electronics.selectProduct(productName);
	}
	
	@Then("^user verify product description page$")
	public void verifyProductDescription(){
		ProductDetailPage detailPage = PageFactory.initElements(driver, ProductDetailPage.class);
		detailPage.verifyProductDescriptionPage();
	}
	
}