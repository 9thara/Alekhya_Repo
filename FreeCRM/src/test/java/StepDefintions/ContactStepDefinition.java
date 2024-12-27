package StepDefintions;

import com.crm.Pages.ContactPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.LaunchPage;
import com.crm.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDefinition {

	LaunchPage lp=new LaunchPage();
	LoginPage login=new LoginPage();
	HomePage hp=new HomePage();
	ContactPage cp=new ContactPage();
	
	@Given("User is in the Home page")
	public void the_application_is_Loggedin() {
	 hp.verifyApplicationinHome();
	}

	
	@When("User clicks the Contact button")
	public void clicks_Contact_button() {
		cp=hp.clickContactButton();
	}

	@Then("User navigates to the Contact page")
	public void user_lands_on_Contact_page() {
	  cp.verifyApplicationinContact();
	}

	
}
