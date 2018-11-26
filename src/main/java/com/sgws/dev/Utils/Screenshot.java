package com.sgws.dev.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sgws.TestBaseClass;

public class Screenshot extends TestBaseClass {

	public void takeScreenShot() throws IOException {
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\Administrator.BLR058\\eclipse-workspace\\sgws1\\Results\\ss.png"));
	}
}
