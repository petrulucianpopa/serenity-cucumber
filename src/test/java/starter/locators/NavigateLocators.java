package starter.locators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigateLocators extends PageObject {

    public static By SEARCH_FIELD_DUCKDUCKGO = By.xpath("//input[@id='search_form_input_homepage']");
}
