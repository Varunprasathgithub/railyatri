package StepDef;

import Pages.LiveStatusPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class LiveStatusSteps extends BasePage{

    LiveStatusPage liveStatusPage = new LiveStatusPage(driver);

    /* @Given("I launch the url")
    public void i_launch_the_url() {
    }*/

    @And("I click on Train Information dropdown on the header")
    public void i_click_on_train_information_dropdown_on_the_header() {
        liveStatusPage.clickOnTrainInfoDd();
    }

    @And("I select Live Train Status")
    public void i_select_live_train_status() {
        liveStatusPage.clickOnLiveTrainSts();
    }

    @And("I verify you will get Search by Train section")
    public void i_verify_you_will_get_search_by_train_section() {
        liveStatusPage.verifySearchSection();
    }

    @And("I print the Text field heading")
    public void i_print_the_text_field_heading() {
        liveStatusPage.printSearchBoxHeading();
    }

    @And("I enter {string} in the text field")
    public void iEnterInTheTextField(String TrainNO) {
        liveStatusPage.enterNoInTxtBox(TrainNO);
    }

    @And("I verify the below train detail is displayed in suggestion")
    public void i_verify_the_below_train_detail_is_displayed_in_suggestion(DataTable dt1) {
        liveStatusPage.verifyAutoSugg(dt1);
    }

    @And("I Click on Check Status")
    public void i_click_on_check_status() throws InterruptedException {
        liveStatusPage.clickOnCheckStsBtn();
    }

    @And("I Verify the below columns were displayed")
    public void i_verify_the_below_columns_were_displayed(DataTable dt) {
        liveStatusPage.verifyColumns(dt);
    }
}
