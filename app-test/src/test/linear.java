
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class MyClass {
    AndroidDriver<WebElement> driver;
    @BeforeMethod
    public void bm() throws MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot+"/apps");
//        File app = new File(appDir.getCanonicalPath(), "todolist.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");

        capabilities.setCapability("noReset",true);//保留历史数据

        capabilities.setCapability("appPackage", "me.tictok.linear");
        capabilities.setCapability("appActivity", ".WelcomeActivity");

        driver =new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @Test
    public void SportRecord(){
        driver.findElement(By.id("manage_record")).click();

        driver.currentActivity();
        System.out.println(11);
    }
    @Test
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"日常拉伸\")").click();
        driver.currentActivity();
        System.out.println(11);
    }
@Test
    public void ClickDiscover(){
    driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"发现\")").click();
    driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"和专业运动员学习呼吸\")").click();
        String activity=driver.currentActivity();
        System.out.println(activity);
    }

    @Test
    public void friend(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"好友\")").click();
        driver.findElement(By.id("back")).click();
        driver.currentActivity();
    }
    @Test
    public void healthy(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的健康数据\")").click();
        driver.currentActivity();
        System.out.println(1);
    }
    @Test
    public void Choosesport(){
        driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"发现\")").click();
        driver.findElementByAndroidUIAutomator
                      ("new UiSelector().text(\"骑行\")").click();
        driver.currentActivity();
    }
    @Test
    public void Essence(){
        driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"好友\")").click();
        driver.findElementByAndroidUIAutomator
                      ("new UiSelector().text(\"Recent3\")").click();
        driver.currentActivity();
    }
    @Test
   public void Quit(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"设置\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"退出登录\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"取消\")").click();
        String activity=driver.currentActivity();
        driver.currentActivity();
      System.out.println(1);
    }
}