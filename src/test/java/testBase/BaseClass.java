package testBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import net.bytebuddy.asm.Advice.This;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	@Parameters({"OS","browsername"})
	@BeforeClass
	public void setUp(String os,String br) throws FileNotFoundException {
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();  
		
		logger=(Logger) LogManager.getLogger(this.getClass());
		switch (br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:System.out.println("Browser Name Is MissMatched");
		
		}
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	public String CaptureScreenShot(String fname) throws IOException {
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		
		File sourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenShot/"+fname+".png");
		//try {
		FileUtils.copyFile(sourceFile, destFile);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		return timestamp;
		
	}

}


//	if (ScreenShotSubFolderName==null) {
//		
//	
//	 LocalDateTime myDateObj = LocalDateTime.now();
//	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
//	     ScreenShotSubFolderName = myDateObj.format(myFormatObj);
//	   
//	}
//	TakesScreenshot takescreenshot=(TakesScreenshot) driver;
//	File sourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
//	File destFile=new File("./ScreenShot/"+ ScreenShotSubFolderName+"/"+filename);
//	try {
//		FileUtils.copyFile(sourceFile, destFile);
//	} catch (Exception e) {
//		e.printStackTrace();
//		
//	}
//	System.out.println("screenshot saved successfully");
//
