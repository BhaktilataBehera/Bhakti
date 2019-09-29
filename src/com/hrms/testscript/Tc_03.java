package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.LIB.General;

public class Tc_03 {
	@Test
	public void tc03()throws Exception{
		DOMConfigurator.configure("Log4j.xml");
	General obj=new General();
	obj.openApplication();
	obj.waitstmt();
	obj.titleverify();
	obj.login();
	obj.navigateTopim();
	obj.clickEmpList();
	obj.entertoframe();
	obj.searchemp();
	obj.deletEmploye();
	obj.waitstmt();
	obj.exittoframe();
	obj.logout();
	obj.closeApplication();
	
}
}
