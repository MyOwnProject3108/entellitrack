package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class NewAppeal extends Base{
    Base base = new Base();

    By searchClaimantLocator =By.id("btn_claSearch");
    By randomClaimantSelect = By.xpath("//table[contains(@class, 'hover')]//tr[@class='etk-q-odd']");
    By selectClaimantLocator = By.id("selectClaimantBtn");
    By  selectHearingTypeLocator = By.id("Apl_hearingRequestType");
    By selectProgramLocator = By.id("program");
    By subProgramSelectLocator = By.id("subProgram");
    By agencyLocator = By.id("Apl_responsibleAgency");
    By descriptionLocator = By.id("issueDescription");
    By prefLangLocator = By.id("Apl_languageOfPreference");
    By prefComLocator = By.id("Apl_communicationMethod");
    By hearingModLocator = By.id("Apl_hearingModality");
    By reasonForExpReqLocator = By.id("Apl_reasonForExpediteRequest");
    By saveFormLocator = By.id("saveButton");


   public void clickSearchClaimant() {
        driver.findElement(searchClaimantLocator).click();

        base.sleep(5000);
    }

    public void selectClaimant() {

        driver.findElement(randomClaimantSelect).click();
        base.sleep(5000);
        driver.findElement(selectClaimantLocator).click();
        base.sleep(5000);
        }

    public void selectHearingRequestType(String name) {

        WebElement selectElement =   driver.findElement(selectHearingTypeLocator);
        Select dropdown = new Select(selectElement);
        dropdown.selectByVisibleText(name);
    }

    public void clickReviewTaskRadioButton(String radioButton) {

        driver.findElement(By.id("Apl_reviewTaskRequired_"+radioButton.toLowerCase())).click();

    }

    public void selectProgram(String programSelect) {
    WebElement selectProgram=  driver.findElement(selectProgramLocator);
    Select drpDown = new Select(selectProgram);
    drpDown.selectByVisibleText(programSelect);

    }

    public void selectSubProgram(String subProgramSelect) {
    WebElement selectsubProgram= driver.findElement(subProgramSelectLocator);
    Select drp = new Select(selectsubProgram);
    drp.selectByVisibleText(subProgramSelect);
    }

    public void selectResponsibleAgeny(String agencySelect) {
        WebElement selectAgency = driver.findElement(agencyLocator);
        Select drp = new Select(selectAgency);
        drp.selectByVisibleText(agencySelect);

    }

    public void enterDesciption(String desc) {
        driver.findElement(descriptionLocator).sendKeys(desc);

    }

    public void selectPrefLang(String prefLang) {
        WebElement prefSelect = driver.findElement(prefLangLocator);
        Select sel = new Select(prefSelect);
        sel.selectByVisibleText(prefLang);
    }

    public void selectPrefCom(String prefCom) {
        WebElement prefComSel = driver.findElement(prefComLocator);
        Select selPref = new Select(prefComSel);
        selPref.selectByVisibleText(prefCom);
    }

    public void selectHearingMod(String hearingMod) {
        WebElement hearingModSel = driver.findElement(hearingModLocator);
        Select sel = new Select(hearingModSel);
        sel.selectByVisibleText(hearingMod);
    }

    public void clickExpectedHearingRadioButton(String expHearing) {
        driver.findElement(By.id("Apl_expeditedHearingRequested_"+ expHearing.toLowerCase())).click();


    }

    public void enterReasonForExp(String reasonExp) {
        driver.findElement(reasonForExpReqLocator).sendKeys(reasonExp);
    }


    public void saveForm() {
        base.sleep(5000);
        driver.findElement(saveFormLocator).submit();

    }
}
