package FeaturPages.ManagerLevel;

import Utilities.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CRMmodule {
    public CRMmodule() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[5]/a")
    public WebElement crmNavigation;

    @FindBy(xpath = "//ul[@class='oe_secondary_submenu nav nav-pills nav-stacked'][3]//li[2]//span")
    public WebElement activityType;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement serchbox;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement click;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement create;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement name;

    @FindBy(xpath = "//table//tr[3]//td[2]//input[@id='o_field_input_62']")
    public WebElement summary;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save;

    @FindAll({@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr/td[3]")})
    public List<WebElement> tableNames;


    @FindAll({@FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th")})
    public List<WebElement> tableheaders;


    @FindAll({@FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr")})
    public List<WebElement> printallRows;

    @FindAll({@FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")})
    public List<WebElement> printalltable;

    @FindAll({@FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr[2]/td[3]")})
    public List<WebElement> cells1;

    @FindAll({@FindBy(xpath = "//td[.='UEN/Team/3/Survivors/Test-001']/../td[3]")})
    public List<WebElement> checkbox;


}







