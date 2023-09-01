package com.baseclass;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public WebDriver driver;
	public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\New_Batch_Aug2023\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();

	}
	public void openUrl(String url) {
		driver.get(url);

	}
	public void click(WebElement element) {
		element.click();

	}
	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void close() {
		driver.close();

	}
	public void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public void dragAndDrop(WebElement from, WebElement to) {
		Actions act= new Actions(driver);
		act.dragAndDrop(from, to);

	}
	public void sendkeys(WebElement element, String key) {
		element.sendKeys(key);
	}
	public void navigate(String url) {
		driver.navigate().to(url);

	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void alertAccept() {
		driver.switchTo().alert().accept();

	}
	public void promptAlert(String key) {
		driver.switchTo().alert().sendKeys(key);
	}
	public void frames(WebElement element) {
		driver.switchTo().frame(element);

	}
	public void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		

	}
	public void screenShot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
		

	}
	public void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

}
