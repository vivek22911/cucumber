package org.jvm.report;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String name) {
//1.mention target folder location
	File f=new File("C:\\Users\\VIVEK\\eclipse-workspace\\Cucumber\\jvmReport");
//2.Configuration class	
	Configuration c=new Configuration(f,"Facebook and Amazon");
	c.addClassifications("OS","Windows");
	c.addClassifications("Tool","Eclipse");
	c.addClassifications("Lang","Java");
	c.addClassifications("Date","29/9/2022");
//3.To add json file path
	List<String> l=new ArrayList<String>();
	l.add(name);
//4.Create object for ReportBuilder class and call generateReports method
	ReportBuilder r=new ReportBuilder(l,c);
	r.generateReports();
}
}
