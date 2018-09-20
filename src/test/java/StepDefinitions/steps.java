package StepDefinitions;

import PageObjects.Base;
import PageObjects.LoginPage;
import PageObjects.NewAppeal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class steps {
    Base base = null;

    @Before
    public void start()
    {
       base = new Base();
    }

    private LoginPage getLoginPage(){
        return new LoginPage();
    }

    private NewAppeal getNewAppeal(){
        return new NewAppeal();
    }

    @Given("I am on the \"(.*?)\" page")
    public void i_am_on_the_page(String url){
        base.initialise(url);

    }
    @When("I SignIn with username \"(.*?)\" and password \"(.*?)\"$")
    public void i_SignIn_with_username_and_password(String userName, String password) {

         getLoginPage().signIn(userName, password);
    }
    @Then("I should be on the \"(.*?)\" page")
    public void i_should_be_on_the_page(String page) {
        base.verifyURLText(page);
    }

    @When("I navigate to the New Appeal page")
    public void i_navigate_to_the_page() {
     base.navigateToNewAppealPage();
    }

    @When("I click on Search Claimant button")
    public void i_click_on_Search_Claimant_button() {
        getNewAppeal().clickSearchClaimant();
    }

    @When("I select any random Claimant")
    public void i_select_any_random_Claimant() {
        getNewAppeal().selectClaimant();
    }

    @When("I select Type of Hearing Request with the option \"(.*?)\"$")
    public void i_select_Type_of_Hearing_Request_with_the_option(String name) {
        getNewAppeal().selectHearingRequestType(name);

    }

    @When("I click Review Task Required as \"(.*?)\"$")
    public void i_click_Review_Task_Required_as(String radioButton) {
        getNewAppeal().clickReviewTaskRadioButton(radioButton);

    }

    @When("I select Program as \"(.*?)\"$")
    public void i_select_Program_as(String programSelect) {
        getNewAppeal().selectProgram(programSelect);

    }

    @When("I select Sub-Program as \"(.*?)\"$")
    public void i_select_Sub_Program_as(String subProgramSelect) {
      getNewAppeal().selectSubProgram(subProgramSelect);
    }

    @When("I select Responsible Agency as \"(.*?)\"$")
    public void i_select_Responsible_Agency_as(String agencySelect) {
       getNewAppeal().selectResponsibleAgeny(agencySelect);
    }

    @When("I enter Issue Description as \"(.*?)\"$")
    public void i_enter_Issue_Description_as(String desc) {
      getNewAppeal().enterDesciption(desc);
    }

    @When("I select Preferred Language \"(.*?)\"$")
    public void i_select_Preferred_Language(String prefLang) {
        getNewAppeal().selectPrefLang(prefLang);

    }

    @When("I select Preferred Communication Method as \"(.*?)\"$")
    public void i_select_Preferred_Communication_Method_as(String prefCom) {
        getNewAppeal().selectPrefCom(prefCom);

    }

    @When("I select Hearing Modality as \"(.*?)\"$")
    public void i_select_Hearing_Modality_as(String hearingMod) {
        getNewAppeal().selectHearingMod(hearingMod);

    }

    @When("I click Expedited Hearing Requested as \"(.*?)\"$")
    public void i_click_Expedited_Hearing_Requested_as(String expHearing) {
        getNewAppeal().clickExpectedHearingRadioButton(expHearing);


    }

    @When("I enter Reason for Expedite Request as \"(.*?)\"$")
    public void i_enter_Reason_for_Expedite_Request_as(String reasonExp) {
        getNewAppeal().enterReasonForExp(reasonExp);


    }

    @When("I click on Save button")
    public void i_click_on_Save_button() {
        getNewAppeal().saveForm();

    }






}
