package StepDefintions;

import com.crm.Pages.HomePage;
import com.crm.Pages.LaunchPage;
import com.crm.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	LaunchPage lp=new LaunchPage();
	LoginPage login;
	HomePage hp=new HomePage();
	
	
	@Given("The application is launched")
	public void the_application_is_launched() {
	   lp.verifyAppilicationLaunchPage();
	}

	@When("User clicks the Login button")
	public void user_navigates_to_the_login_page() {
		login=lp.navigateToLoginPage();
	}
	
	@Then("Verify the Login page have all fields")
	public void verifyLoginPagefeilds() {
		login.verifyFeild();
	}
	
	//User enters the <Userid> and <password>
	
	//"^User enters the (.*) and (.*)$"
	
	  @When("^User enters the (.*) and (.*)$")
	  public void user_enters_the_name1_(String user, String password) {
	  login.enterthecredentials(user, password);
	  
	  }
	 
	  
	 @Then("Verify user is navigated to the Home page") 
	 public void user_lands_on_home_page() {
	  hp.verifyApplicationinHome(); }
	 
	 	
}
