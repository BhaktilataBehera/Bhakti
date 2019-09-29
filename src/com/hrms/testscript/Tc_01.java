package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.LIB.General;

public class Tc_01 {
	@Test
	public void tc01()throws Exception{
		DOMConfigurator.configure("Log4j.xml");
	
	//public static void main(String args[])throws Exception{
		General obj=new General();
		obj.openApplication();
		obj.titleverify();
		obj.login();
		obj.welcometxt();
		obj.waitstmt();
		obj.logout();
		obj.closeApplication();
	}
	}


