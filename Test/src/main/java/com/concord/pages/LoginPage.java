package com.concord.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.concord.utility.SeleniumCommands;

public class LoginPage extends SeleniumCommands {
	
	@FindBy(xpath = "(//*[contains(text(),'Hello, sign in')])[1]")
	private WebElement signInBtn;
	
	@FindBy(id = "ap_email")
	private WebElement userTxt;
	
	@FindBy(id="continue")
	private WebElement conBtn;
	
	@FindBy(id = "ap_password")
	private WebElement passTxt;
	
	@FindBy (id = "signInSubmit")
	private WebElement logInBtn;
	
	
	@FindBy(xpath = "(//span[@class='nav-icon nav-arrow'])[2]")
	private WebElement signOutArrow;
	
	@FindBy(xpath = "(//*[contains(text(),'Sign Out')])[2]")
	private WebElement logOutBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Hello, ')]")
	private WebElement profileName;

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public void setSignInBtn(WebElement signInBtn) {
		this.signInBtn = signInBtn;
	}

	public WebElement getUserTxt() {
		return userTxt;
	}

	public void setUserTxt(WebElement userTxt) {
		this.userTxt = userTxt;
	}

	public WebElement getConBtn() {
		return conBtn;
	}

	public void setConBtn(WebElement conBtn) {
		this.conBtn = conBtn;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public void setPassTxt(WebElement passTxt) {
		this.passTxt = passTxt;
	}

	public WebElement getLogInBtn() {
		return logInBtn;
	}

	public void setLogInBtn(WebElement logInBtn) {
		this.logInBtn = logInBtn;
	}

	public WebElement getSignOutArrow() {
		return signOutArrow;
	}

	public void setSignOutArrow(WebElement signOutArrow) {
		this.signOutArrow = signOutArrow;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public void setLogOutBtn(WebElement logOutBtn) {
		this.logOutBtn = logOutBtn;
	}
	
	
	
	public WebElement getProfileName() {
		return profileName;
	}

	public void setProfileName(WebElement profileName) {
		this.profileName = profileName;
	}

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	

}
