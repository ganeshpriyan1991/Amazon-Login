package com.concord.step;

import java.io.IOException;

import org.junit.Assert;

import com.concord.pages.LoginPage;
import com.concord.utility.SeleniumCommands;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends SeleniumCommands {

	@Given("user is on amazon page")
	public void user_is_on_amazon_page() throws Throwable, Throwable {

		launchBrowser(getProperty("browser"));
		openApp(getProperty("url"));
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		LoginPage l=new LoginPage();

		clickButton(l.getSignInBtn());
		
		
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		LoginPage l=new LoginPage();
		enterText(l.getUserTxt(),string );
		clickButton(l.getConBtn());
		enterText(l.getPassTxt(),string2 );
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		LoginPage l=new LoginPage();
		clickButton(l.getLogInBtn());
	}

	@Then("user verify the successful login")
	public void user_verify_the_successful_login() {
		LoginPage l=new LoginPage();
		
		String text = l.getProfileName().getText();
		String name=text.split(",")[1];
		
		Assert.assertEquals("ganesh", name.trim());
	}

}
