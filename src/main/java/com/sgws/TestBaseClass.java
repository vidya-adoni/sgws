package com.sgws;

import com.sgws.dev.Utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBaseClass  {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Screenshot ss=new Screenshot();
	HomePage homepageobj=new HomePage();
	public TestBaseClass() {
	
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Administrator.BLR058\\eclipse-workspace\\sgws1\\Resources\\config.properties");
		
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static HomePage Initialize() throws IOException {
		
			//HomePage homepageobj=new HomePage();
			String browser=prop.getProperty("browser");
	 if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator.BLR058\\eclipse-workspace\\sgws1\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
		ss.takeScreenShot();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		}  
	 return new HomePage(); 
	}
	

	
		
}
