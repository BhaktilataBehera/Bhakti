package com.hrms.LIB;

import org.openqa.selenium.WebDriver;

public class Global {
	//variable
public WebDriver driver;
public String url="http://127.0.0.1/orangehrm-2.6/login.php";
public String username="admin";
public String password="admin";
public String EmpFirstName="Bhaktilata";
public String EmpLastName="Behera";
public String EmpId="0013";
public String text="Welcome admin";
//objects
public String txt_loginname="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String link_logout="Logout";
public String framename="rightMenu";
public String link_Pim="PIM";
public String link_Add="Add Employee";
public String txt_frstName="txtEmpFirstName";
public String txt_LastName="txtEmpLastName";
public String btn_save="btnEdit";
public String btn_back="backbutton";
public String Emp_list="Employee List";
public String dd_selname="loc_code";
public String search_for="loc_name";
public String xpath_srchclick="//input[@value='Search']";
public String Rbtn_click="chkLocID[]";
public String btn_delet="//input[@value='Delete']";
public String txt_welcom="//ul[@id='option-menu']/li[1]";

}


