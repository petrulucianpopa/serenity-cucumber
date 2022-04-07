package starter.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.Dimension;

public class NavigationUtils extends UIInteractionSteps {

    private EnvironmentVariables environmentVariables;

    @Step
    public void navigateToAdmin(){
        String  platform = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("platform");
        getDriver().navigate().to(platform);
    }


    @Step
    public void userNavigatesToTheDeliveryApplication(){
//        options.addArguments("start-maximized","deny-permission-prompts","disable-geolocation","disable-popup-blocking","disable-web-security","disable-notifications","incognito","disable-gpu","ignore-certificate-erros");
        Dimension dim = new Dimension(420, 900);
        getDriver().manage().window().setSize(dim);
        String delivery = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("delivery");
        getDriver().navigate().to(delivery);
    }
}
