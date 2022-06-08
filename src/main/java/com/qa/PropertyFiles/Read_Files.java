package com.qa.PropertyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Read_Files {

	
	@Test
	public void read() throws Exception {
		File src = new File("C:\\EclipseSetUp\\FrameworkDesign\\PropertyFiles\\Configuration");

		FileInputStream f = new FileInputStream(src);

		Properties pr = new Properties();

		pr.load(f);

		String url = pr.getProperty("url");

		System.out.println("Url is "+url);

	}
}
