package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Loaded landing page");
	}
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string1);
		System.out.println(string2);
	}
	@When("User signup with folllowing details")
	public void user_signup_with_folllowing_details(DataTable data) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    // For other transformations you can register a DataTableType.
		List<List<String>> obj = data.asLists();
	    System.out.println(obj.get(0).get(0));
	    System.out.println(obj.get(0).get(1));
	    System.out.println(obj.get(0).get(2));
	    System.out.println(obj.get(0).get(3));
	    System.out.println(obj.get(0).get(4));
	}
	
	@When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
	
	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Homepage populated");
	}
	@And("Card display is {string}")
	public void card_display_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Card= "+ string );
	}
	
	@Given("validate the browser")
	public void validate_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Browser validated");
	}
	@When("Browser is triggered")
	public void browser_is_triggered() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser triggered");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser started");
	}
}
