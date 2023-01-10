package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String jsonfile) {
File file = new File("C:\\Users\\Konvict\\eclipse-workspace-new\\OMRBRANCHAdactinAutomation\\target");

Configuration configuration = new Configuration(file, "Adactin Automation Page");

configuration.addClassifications("Browser", "Google Chrome");
configuration.addClassifications("Version", "108.0.5359.125 (Official Build) (64-bit)");
configuration.addClassifications("Os", "Windows 8.1 Pro");
configuration.addClassifications("Sprint", "35");
	
	
List<String> jsonFiles = new ArrayList<String>();
jsonFiles.add(jsonfile);

ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

builder.generateReports();


	}
	
}
