package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.LIB.General;

public class Tc_02 {
	@Test
	public void tc2()throws Exception{
		DOMConfigurator.configure("Log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.waitstmt();
		obj.titleverify();
		obj.login();
		obj.waitstmt();
		obj.welcometxt();
		obj.navigateTopim();
		obj.addEmp();
		obj.entertoframe();
		obj.savedetails();
		obj.exittoframe();
		obj.waitstmt();
		obj.logout();
		obj.closeApplication();
		
	}
	}


