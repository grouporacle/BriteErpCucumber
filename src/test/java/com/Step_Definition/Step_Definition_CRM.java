package com.Step_Definition;

import com.FeaturPages.ManagerLevel.CRMmodule;
import com.FeaturPages.ManagerLevel.LoginPage;
import com.Utilities.Config;
import com.Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.Map;

public class Step_Definition_CRM {


    @Given("manager on the login page")
    public void manager_on_the_login_page() {
        System.out.println("Manager in the login page");
        Driver.getDriver().get(Config.getProperty("url"));
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
      @When("the manager enters valid {string} and  {string}")
       public void the_manager_enters_valid_and(String email, String password) {

            LoginPage crMmodule = new LoginPage();

            System.out.println("email: "+ email);
            System.out.println("password: "+ password);

            crMmodule.login(email, password);

   }

    @When("the manager click login button")
    public void the_manager_click_login_button() {
        System.out.println("Manager click login button");
        CRMmodule crm = new CRMmodule();
        crm.crmNavigation.click();
    }

    @When("the Manager click to the CRM from the tab")
    public void the_Manager_click_to_the_CRM_from_the_tab() {
        System.out.println("Manager click CRM");
        CRMmodule crm = new CRMmodule();
        crm.crmNavigation.click();


        }

    @When("the manager goes to the activity type page")
    public void the_manager_goes_to_the_activity_type_page() throws InterruptedException {
           System.out.println("Manager click Activity Type");
           CRMmodule crm = new CRMmodule();
           Thread.sleep(3000);
           crm.activityType.click();
        }

    @When("the manager send activity name to the search box and hit enter")
    public void the_manager_send_activity_name_to_the_search_box_and_hit_enter() throws InterruptedException {
        System.out.println("Manager serching name CALL");
        CRMmodule crm = new CRMmodule();
        Thread.sleep(3000);
        crm.serchbox.sendKeys("call" + Keys.ENTER);
        crm.click.click();
    }


    @Then("manager abel to update summary")
    public void manager_abel_to_update_summary() throws InterruptedException {
        System.out.println("Manager update sammury CRM BOOS");
        CRMmodule crm = new CRMmodule();
        Thread.sleep(3000);
        crm.create.click();
        crm.name.sendKeys("Samriye");
        Thread.sleep(3000);
        crm.summary.sendKeys("CRM BOOS");
        //crm.pupUp.click();
        crm.save.click();
        crm.activityType.click();


    }

    @Then("manager should be abel to to create activity type")
    public void manager_should_be_abel_to_to_create_activity_type() throws InterruptedException {
        System.out.println("Manager create name BBOB");
        CRMmodule crm = new CRMmodule();
        Thread.sleep(3000);
        crm.create.click();
        crm.name.sendKeys("BBOB");
        Thread.sleep(3000);
        crm.summary.sendKeys("Selamey");
        crm.save.click();
        crm.activityType.click();
    }


    @Then("the manager should be able to print all the names of activity type")
    public void the_manager_should_be_able_to_print_all_the_names_of_activity_type( ) throws InterruptedException {
        System.out.println("Manager print all the names,summary, and dates ");
             CRMmodule crm = new CRMmodule();
        Thread.sleep(3000);
        for ( WebElement alltable : crm.printalltable){
            System.out.println(alltable.getText());
        }
    }

    @Then("the manager get headers of all activity type")
    public void the_manager_get_headers_of_all_activity_type() throws InterruptedException {
        System.out.println("Manager print the headers ");
        Thread.sleep(3000);
        CRMmodule crm = new CRMmodule();
        for ( WebElement head : crm.tableheaders){
            System.out.println(head.getText());
        }
    }

    @Then("the manager can get all rows of activity type")
    public void the_manager_can_get_all_rows_of_activity_type() throws InterruptedException {
        System.out.println("Manager print the rows");
        CRMmodule crm = new CRMmodule();
        Thread.sleep(3000);
        for ( WebElement alltable : crm.printallRows){
            System.out.println(alltable.getText());
        }
    }

}
