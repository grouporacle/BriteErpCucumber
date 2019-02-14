package Step_Definition;

import FeaturPages.ManagerLevel.CRMmodule;
import FeaturPages.ManagerLevel.LoginPage;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition_CRM {


    @Given("manager on the login page")
    public void manager_on_the_login_page() {
        System.out.println("Manager in the login page");

    }

    @When("the manager goes to http:\\/\\/{double}{double}{double}\\/")
    public void the_manager_goes_to_http(Double double1, Double double2, Double double3) {
        System.out.println("Manager goes to the website ");
        Driver.getDriver().get("http://52.39.162.23/web/login");
    }

    @Given("the manager click on BriteErpDemo")
    public void the_manager_click_on_BriteErpDemo() {
        System.out.println("Manager click ot Brite-Errp-button");
        LoginPage crMmodule = new LoginPage();
        crMmodule.brrerp.click();
    }

    @When("the manager enters valid<email> and <password>")
    public void the_manager_enters_valid_email_and_password() {
        System.out.println("Manager login using the valid account");
        LoginPage crMmodule = new LoginPage();
        crMmodule.username.sendKeys("EventsCRM_Manager@info.com");
        crMmodule.password.sendKeys("Ugh45wQ12");
    }

    @When("the manager click login button")
    public void the_manager_click_login_button() {
        System.out.println("Manager click the login button");
        LoginPage crMmodule = new LoginPage();
        crMmodule.loginButton.click();
    }
//
//    @When("the title is Inbox-Odoo")
//    public void the_title_is_Inbox_Odoo() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }

    @When("the Manager click to the CRM from the tab")
    public void the_Manager_click_to_the_CRM_from_the_tab() {
        System.out.println("Manager click to the CRM");
        CRMmodule crm = new CRMmodule();
        crm.crmNavigation.click();
    }


    @When("the manager goes to the activity type page")
    public void the_manager_goes_to_the_activity_type_page() {
        System.out.println("Manager click to the Activity Type");
        CRMmodule crm = new CRMmodule();
        crm.activityType.click();
    }

    @Then("the manager see the following information")
    public void the_manager_see_the_following_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
















}
