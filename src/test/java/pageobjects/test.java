package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test {

    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "/Apps/Amazon/");
//        File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.navigate().to("http://www.kraken.com");
        TimeUnit.MINUTES.sleep(1);
        driver.quit();

    }

}