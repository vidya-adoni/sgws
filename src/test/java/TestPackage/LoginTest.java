package TestPackage;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sgws.TestBaseClass;

public class LoginTest extends TestBaseClass {
	
	

	TestBaseClass baseclassobject; ;
	
@BeforeMethod
public void setUp() throws Exception {
	
	baseclassobject=new TestBaseClass();
	
	
}

@Test
public void initiateBrowserTest() throws Exception {
	
	baseclassobject.Initialize();
}

@AfterClass
public void tearDown() {
	
	driver.quit();
	
}


}
