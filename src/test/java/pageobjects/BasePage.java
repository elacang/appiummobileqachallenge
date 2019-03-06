package pageobjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasePage {

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'url_bar')]")
    MobileElement navBarChrome;

    AndroidDriver driver;

    public BasePage() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        try {
            driver  = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    public void openPage(String url){
        driver.navigate().to(url);
    }


    public String getURLInNavBar(){
        return navBarChrome.getAttribute("text");
    }

}
