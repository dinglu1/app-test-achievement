package com.example.appiumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.android.AndroidDriver;

public class Linear {
    AndroidDriver<WebElement> driver;
    Actions action=new Actions(driver);
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
    //1. “管理我的运动记录”可以正常点击
    @Test  
    public void SportRecord(){
        WebElement manage=driver.findElement(By.id("manage_record"));
        action.click(manage);

        driver.currentActivity();
        System.out.println(11);
    }
    //2.获取“高效跑步”可以正常点击
    @Test   
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"高效跑步\")").click();
        driver.currentActivity();
        System.out.println(9);
    }
    //3.“历史记录”可以正常点击
     @Test   
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"历史记录\")").click();
        driver.currentActivity();
        System.out.println(9);
    }
    //4.“饮食记录”可以正常点击
     @Test   
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"饮食记录\")").click();
        driver.currentActivity();
        System.out.println(9);
    }
    //5.“饮食计划”可以正常点击
     @Test   
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"饮食计划\")").click();
        driver.currentActivity();
        System.out.println(9);
    }
    //6.“运动记录”可以正常点击
    @Test   
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"运动记录\")").click();
        driver.currentActivity();
        System.out.println(9);
    }
    //7.“运动计划”可以正常点击
    @Test   
    public void ChooseTrain(){
       driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"运动计划\")").click();
        driver.currentActivity();
        System.out.println(9);
    }
    //8.“发现‘可以正常点击
     @Test
    public void ClickDiscover(){
    driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"发现\")").click();
        String activity=driver.currentActivity();
        System.out.println(activity);
    }
    //9.”发现“下级目录可以点击
    @Test
    public void ClickDiscover(){
    driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"发现\")").click();
    driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"android.widget.TextView\")").click();
        String activity=driver.currentActivity();
        System.out.println(activity);
    }
    //10.”发现“下级页面中的”骑行“可以点击
    @Test
    public void Choosesport(){
        driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"发现\")").click();
        driver.findElementByAndroidUIAutomator
                      ("new UiSelector().text(\"骑行\")").click();
        driver.currentActivity();
    }
    //11. “好友”可以点击
    @Test
    public void friend(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"好友\")").click();
        driver.findElement(By.id("back")).click();
        driver.currentActivity();
    }
    //12.“我的”可以点击
     @Test
    public void healthy(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的\")").click();
        driver.currentActivity();
        System.out.println(1);
    }
    //13.”我的“下级页面可以点击
    @Test
    public void Essence(){
        driver.findElementByAndroidUIAutomator
                       ("new UiSelector().text(\"好友\")").click();
        driver.findElementByAndroidUIAutomator
                      ("new UiSelector().text(\"Recent3\")").click();
        driver.currentActivity();
    }
    //14."我的“下级页面中”我的健康数据“可以点击
    @Test
    public void healthy(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的健康数据\")").click();
        driver.currentActivity();
        System.out.println(1);
    }
    //15."我的“下级页面中”个人信息“可以点击
    @Test
    public void healthy(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"个人信息\")").click();
        driver.currentActivity();
        System.out.println(1);
    }
    //16."我的“下级页面中”我的饮食“可以查看
    @Test
    public void healthy(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的饮食\")").click();
        driver.currentActivity();
        System.out.println(1);
    }
    //17."我的“下级页面中”目标计划“可以查看
    @Test
    public void healthy(){
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"目标计划\")").click();
        driver.currentActivity();
        System.out.println(1);
    }
    
    //18.点击设置中的退出，正常退出
     @Test
   public void Quit(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"设置\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"退出登录\")").click();
        String activity=driver.currentActivity();
        driver.currentActivity();
      System.out.println(1);
    }
    //19.取消退出
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
    //20.点击重新登录
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
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"登陆\")").click();      
        String activity=driver.currentActivity();
        driver.currentActivity();
      System.out.println(1);
    }
}
