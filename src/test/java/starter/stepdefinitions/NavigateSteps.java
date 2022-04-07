package starter.stepdefinitions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.locators.NavigateLocators;

public class NavigateSteps extends UIInteractionSteps {

    public static String titleOnArrival;

    @Step
    public void userNavigatesToRequestedUrl(){
        open();
    }


    @Step
    public void verifyPageTitle(){
//        waitFor(ExpectedConditions.titleIs("DuckDuckGo — Privacy, simplified."));
        waitFor(ExpectedConditions.titleContains("DuckDuckGo"));
        titleOnArrival = getTitle();
        System.out.println(titleOnArrival);

    }

    @Step
    public void userSearchForText() throws InterruptedException {
        $(NavigateLocators.SEARCH_FIELD_DUCKDUCKGO).waitUntilVisible().waitUntilClickable().sendKeys("cucumber");
        withAction().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }


}
