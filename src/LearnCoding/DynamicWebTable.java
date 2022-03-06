package LearnCoding;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\SCUBI\\Automation\\chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      
      driver.get("http://demo.guru99.com/test/web-table-element.php");
      
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
      
      List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
      
      Iterator<WebElement> it=li.iterator();
      
      it.hasNext();
      
   
      
      System.out.println("Row value"+li.size());
      
          
      
      List<WebElement> lirows=driver.findElements(By.xpath(" //*[@id=\"leftcontainer\"]/table/thead/tr/th"));
      
      System.out.println("Column value"+lirows.size());
      
      for(int i=1;i<lirows.size();i++)
      {
    	 for(int j=1;j<li.size();j++)
    	 {
    	  //System.out.println(li.get(i).getText());
    	  
    	  String act=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+1+"]/td["+j+"]")).getText();
    	
    	  System.out.println(act);
    	  
		    	   if( act.equalsIgnoreCase("718.1"))
		    	   {
		    		   System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+(i+1)+"]/td["+j+"]")).getText());
		    	   }    		    	  
    	
    	 }
      }
      
      
      
	}

}
