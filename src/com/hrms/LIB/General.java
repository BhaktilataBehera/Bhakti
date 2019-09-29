package com.hrms.LIB;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium_Suresh\\\\Drivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application open");
		Log.info("Application open");
	}
	public void closeApplication() {
		driver.quit();
		System.out.println("Application close");
		Log.info("Application close");
	}
	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(200);
		System.out.println("Login completed");
		Log.info("login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("logout completed");
	}
	public void waitstmt() throws Exception{
		Thread.sleep(2000);
		System.out.println("Wait stmt");
		Log.info("wait stmt completed");
		}
	public void entertoframe() {
		driver.switchTo().frame(framename);
		System.out.println("Enter to frame");
		Log.info("Enter to frame");
	}
	public void exittoframe() {
		driver.switchTo().defaultContent();
		System.out.println("Exit to frame");
		Log.info("Exit to frame");
	}
	public void navigateTopim() {
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.linkText(link_Pim));
		action.moveToElement(element).perform();
		Log.info("navigating pim menu");
	}
	public void addEmp() {
		driver.findElement(By.linkText(link_Add)).click();
		System.out.println("Add Employe");
		Log.info("Add employee");
	}
	public void clickEmpList() {
		driver.findElement(By.linkText(Emp_list)).click();
		Log.info("click emplist");
	}
	public void savedetails() {
		driver.findElement(By.name(txt_frstName)).sendKeys(EmpFirstName);
		driver.findElement(By.name(txt_LastName)).sendKeys(EmpLastName);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("save completed");
		Log.info("save details");
		}
	public void searchemp() {
		Select st=new Select(driver.findElement(By.name(dd_selname)));
		st.selectByIndex(1);
		driver.findElement(By.name(search_for)).sendKeys(EmpId);
		driver.findElement(By.xpath(xpath_srchclick)).click();
		Log.info("Search employee");
	}
	public void titleverify() {
		if(driver.getTitle().equals("orange"))
		{
			System.out.println("title match");
		}
		else
		{
			System.out.println("title not matched and expectedvtitle is"+driver.getTitle());
			Log.info("Title verify");
		}
	}
	public void deletEmploye() {
		driver.findElement(By.name(Rbtn_click)).click();
		driver.findElement(By.xpath(btn_delet)).click();
		Log.info("Delete employee");
	}
	public void welcometxt() {
		assertTrue(driver.findElement(By.xpath(txt_welcom)).getText().matches(text));
		System.out.println("welcome txt verify");
		Log.info("Welcome text verify");
	}
}



