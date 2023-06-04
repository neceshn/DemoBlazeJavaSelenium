package utils;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormHelper {
    public static WebDriver webDriver = null;
    public static Wait<WebDriver> wait = null;

    public static WebElement findElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return webDriver.findElement(by);
    }

    public static final void waitPage(Integer time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void click(By by) {
        FormHelper.findElement(by).click();
    }

    public static void checkVisibility(By by) {
        try {
            String element = FormHelper.findElement(by).getText();
            Assert.assertEquals(element, "Sign up", "Signup ekranı yükleme işleminde hata alınmıştır.");
        } catch (Exception e) {

        }
    }

    public static void sendKeys(By by, String text) {
        WebElement element = FormHelper.findElement(by);
        element.sendKeys(text);
    }

    public static String getModalText() {
        try {
            FormHelper.waitPage(2000);
            String modalMessage = webDriver.switchTo().alert().getText();
            return modalMessage;
        } catch (Exception e) {
            return e.toString();
        }
    }

    public static void closeAlert() {
        try {
            FormHelper.waitPage(2000);
            webDriver.switchTo().alert().accept();
        } catch (Exception e) {
        }
    }

    public static void scrollPage(By by) {
        WebElement element = FormHelper.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public static String getText(By by) {
        return FormHelper.findElement(by).getText();
    }

    public static By getByTitle(String title) {
        String x = "//*[text()='" + title + "']";
        return By.xpath(x);
    }

    public static String GetString(String value, Pattern pattern) {
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            var x = matcher.group(0);
            return x;
        }
        return "";
    }


}
