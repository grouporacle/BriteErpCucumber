package Step_Definition;

import FeaturPages.ManagerLevel.CRMmodule;
import FeaturPages.ManagerLevel.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CRM_Step_Definirtion {


    @Given("the manager on the login page")
    public void the_manager_on_the_login_page() {
        System.out.println("Manager in the login page");
        Driver.getDriver().get("http://52.39.162.23/web/login");
    }

    @When("the manager click on the BriteErpDemo button")
    public void the_manager_click_on_the_BriteErpDemo_button() {
        System.out.println("Manager click ot Brite-Errp-button");
        LoginPage crMmodule = new LoginPage();
        crMmodule.brrerp.click();
    }

    @When("the manager log in using {string} and {string}")
    public void the_manager_log_in_using_and(String username, String password) {
        System.out.println("Manager login using the valid account");
        LoginPage crMmodule = new LoginPage();
        crMmodule.username.sendKeys("EventsCRM_Manager@info.com");
        crMmodule.password.sendKeys("Ugh45wQ12");

    }

    @Then("the Manager click log in button")
    public void the_Manager_click_log_in_button() {
        System.out.println("Manager click the login button");
        LoginPage crMmodule = new LoginPage();
        crMmodule.loginButton.click();
    }

// Here is My code starting to work



    @When("the Manager click to the CRM from the tab")
    public void the_Manager_click_to_the_CRM_from_the_tab() {
        System.out.println("Manager click to the CRM");
        CRMmodule crm = new CRMmodule();
        crm.crmNavigation.click();

    }

    @When("the manager click to the Activity Type")
    public void the_manager_click_to_the_Activity_Type() {
        System.out.println("Manager click to the Activity Type");
        CRMmodule crm = new CRMmodule();
        crm.activityType.click();

    }

    @Then("the manager see the following information")
    public void the_manager_see_the_following_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



















/*








     @Test
    public void CRM_ManagingCreateTest() {
        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Musername"), ConfigurationReader.getProperty("Mpassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

 * Here starts STEPS of BRIT-2005 test case


    //1- Verify that Events CRM Manager can see options of activity types.
          pages.manager().activityType.click();
          Assert.assertTrue(pages.manager().activityType.getText().equals("Activity Types"));

    //2 –Verify that Events CRM Manager can search names by entering keyword to the search box
    //    Then hitting enter.
            pages.manager().serchbox.sendKeys("call");
            BrowserUtils.waitForPageToLoad(5000);
            pages.manager().serchbox.click();

    //3 – Verify that Events CRM Manager should be able to update names of the activity types.
            pages.manager().serchbox.sendKeys("Efi" + Keys.ENTER);
            BrowserUtils.waitForPageToLoad(2000);
    //pages.manager().click.click();

    //4 –Verify Events CRM Manager should be able to create activity types.
           pages.manager().create.click();
           pages.manager().name.sendKeys("Efi");
    //pages.manager().summary.sendKeys("CRM Manager "+ Keys.ENTER);
           BrowserUtils.wait(5);
           pages.manager().save.click();
           pages.manager().activityType.click();

              System.out.println("--------------------------");

    //5 – Verify that Events CRM Manager can print all names of the activity types.
            BrowserUtils.waitForPageToLoad(5000);
           for ( WebElement allName : pages.manager().tableNames){
        System.out.println(allName.getText());

    }
              System.out.println("--------------------------");

    //6 – Verify that Events CRM Manager can print all table headers of the activity types.
            BrowserUtils.waitForPageToLoad(5000);

           for ( WebElement head : pages.manager().tableheaders){
        System.out.println(head.getText());
    }
                System.out.println("--------------------------");

    //7 – Verify that Events CRM Manager can print all Rows of the activity types.

            BrowserUtils.waitForPageToLoad(5000);
            System.out.println("Numbers of rows "+ pages.manager().printallRows.size());
            for ( WebElement alltable : pages.manager().printallRows){
        System.out.println(alltable.getText());
    }
               System.out.println("--------------------------");

    //8 – Verify that Events CRM Manager can print all table of the activity types.

            BrowserUtils.waitForPageToLoad(5000);

            for ( WebElement alltable : pages.manager().printalltable){
        System.out.println(alltable.getText());
    }
             System.out.println("--------------------------");

    // 9. Verify that Events CRM Manager can print by coordinates : based on the row and collomn number

            BrowserUtils.waitForPageToLoad(5000);
            BrowserUtils.wait(15);

            for(WebElement header : pages.manager().cells1 ){
        System.out.println(header.getText());
    }
             System.out.println("--------------------------");

    //10 Verify that Events CRM Manager can find the select check box for a given name

          BrowserUtils.waitForPageToLoad(5000);
          BrowserUtils.wait(15);

          for(WebElement header2 : pages.manager().checkbox ) {
        System.out.println(header2.getText());

        System.out.println(header2.isSelected());
        header2.click();
        System.out.println(header2.isSelected());

    }


*/
}