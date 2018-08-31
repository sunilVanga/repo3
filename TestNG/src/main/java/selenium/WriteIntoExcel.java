package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteIntoExcel {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\sunil\\java\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			((WebDriver) driver).manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
			System.out.println(rows.size());
			//*[@id='customers']/tbody/tr[1]/th[1]
			//*[@id='customers']/tbody/tr[2]/td[1] for company
			//*[@id='customers']/tbody/tr[7]/td[1]
			//*[@id='customers']/tbody/tr[2]/td[2] for contacts
			//*[@id='customers']/tbody/tr[2]/td[3] for country
			
			String beforeXpath_company="//*[@id='customers']/tbody/tr[";
			String afterXpath_company="]/td[1]";
			String beforeXpath_contacts=".//*[@id='customers']/tbody/tr[";
			String afterXpath_contacts="]/td[2]";
			String beforeXpath_country="//*[@id='customers']/tbody/tr[";
			String afterXpath_country="]/td[3]";
		
		
			for(int i=2;i<=rows.size();i++) {
				String actualcompany=beforeXpath_company+i+afterXpath_company;
				String companyName=driver.findElement(By.xpath(actualcompany)).getText();
				System.out.println(companyName);
				
				String actualContact=beforeXpath_contacts+i+afterXpath_contacts;
				String contactName=driver.findElement(By.xpath(actualContact)).getText();
				System.out.println(contactName);
				String actualCountry=beforeXpath_country+i+afterXpath_country;
				String countryName=driver.findElement(By.xpath(actualCountry)).getText();
				System.out.println(countryName);
				
				
				
			}
			
	}

}
