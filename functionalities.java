package Functionalitycasestudy;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import javax.imageio.ImageIO;


import org.openqa.selenium.Cookie;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Objectrepository2.elementscasestudy;
import io.github.bonigarcia.wdm.WebDriverManager;


public class functionalities {
	
	 @Test
	 public void  test() throws InterruptedException, IOException, AWTException {
		 
		/* FileInputStream fw = new FileInputStream("src\\test\\java\\Functionalitycasestudy\\config.properties");
		  Properties prop = new Properties();
		  prop.load(fw);
		 String fromvalue= prop.getProperty("fromPlaceName");	
		 String tovalue = prop.getProperty("toPlaceName");*/
		 
	Reporter.log("functionalities class");
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  
	  driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	  
	  PageFactory.initElements(driver, elementscasestudy.class);  
	
	/* elementscasestudy.origin.sendKeys(fromvalue);
	  Thread.sleep(10000);
	  elementscasestudy.origin.sendKeys(Keys.ENTER);*/
	
	  elementscasestudy.origin.sendKeys("chen");
	  Thread.sleep(10000);
	  elementscasestudy.chen.click();
	
	 /* elementscasestudy.destiny.sendKeys(tovalue);
	  Thread.sleep(10000);
	  elementscasestudy.destiny.sendKeys(Keys.ENTER);*/
	  
	  elementscasestudy.destiny.sendKeys("ban");
	  Thread.sleep(10000);
	  elementscasestudy.ban.click();
	  elementscasestudy.fromdate.click();
	  elementscasestudy.fdate.click();
	  elementscasestudy.todate.click();
	  elementscasestudy.tdate.click();
	  elementscasestudy.close.click();
	  elementscasestudy.search.click();
	  elementscasestudy.close1.click();
	  elementscasestudy.seat.click();
	  elementscasestudy.seats.click();
	  Thread.sleep(10000);
	  
	  elementscasestudy.seatno.click();
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	 File source= ts.getScreenshotAs(OutputType.FILE);
	 File destination = new File("C:\\Users\\PK\\eclipse-workspace\\se\\selinium project\\seleniumjan\\src\\test\\java\\Functionalitycasestudy\\screen1.jpeg");
	  FileHandler.copy(source, destination);
	  
	  Robot r2 = new Robot();
	  Dimension scscreen = Toolkit.getDefaultToolkit().getScreenSize();
	  Rectangle rect = new Rectangle(scscreen);
	  BufferedImage source1 =r2.createScreenCapture(rect);
	  File destination1 = new File("C:\\Users\\PK\\eclipse-workspace\\se\\selinium project\\seleniumjan\\src\\test\\java\\Functionalitycasestudy\\screen.jpeg");
	  ImageIO.write(source1,"png", destination1);
	  
	  elementscasestudy.pdetails.click();	  
	  elementscasestudy.name.sendKeys("suresh"); 
	  elementscasestudy.gender.click();
	  elementscasestudy.gender1.click();
	  elementscasestudy.age.sendKeys("32");
	  
	  TakesScreenshot ts1=(TakesScreenshot) driver;
		 File source2= ts1.getScreenshotAs(OutputType.FILE);
		 File destination2 = new File("C:\\Users\\PK\\eclipse-workspace\\se\\selinium project\\seleniumjan\\src\\test\\java\\Functionalitycasestudy\\screen3.jpeg");
		  FileHandler.copy(source2, destination2);
		  
		  Robot r3 = new Robot();
		  Dimension scscreen1 = Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle recta = new Rectangle(scscreen1);
		  BufferedImage source3 =r3.createScreenCapture(rect);
		  File destination3 = new File("C:\\Users\\PK\\eclipse-workspace\\se\\selinium project\\seleniumjan\\src\\test\\java\\Functionalitycasestudy\\screeen.jpeg");
		  ImageIO.write(source3,"png", destination3);
		  
	        	
	        File file = new File("C:\\Users\\PK\\eclipse-workspace\\se\\selinium project\\seleniumjan\\src\\test\\java\\Functionalitycasestudy\\Cookies.data");							
	        try		
	        {	  
	           
						
	            file.createNewFile();			
	            FileWriter fileWrite = new FileWriter(file);							
	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
	       		
	            	
	            // loop for getting the cookie information 		
	            for(Cookie ck : driver.manage().getCookies())							
	            {			
	                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
	                Bwrite.newLine(); 
	                
	                driver.manage().deleteAllCookies();
	                System.out.println("cookies all deleted");
	                
	                
	                
	                
	            }			
	            Bwrite.close();			
	            fileWrite.close();	
	            
	        }
	        catch(Exception ex)	{
	        	
	        }
	        	
	         
		  
		  
	 }  
			 
}		
	
		  
			
	  
		  
	 

	 

	 
