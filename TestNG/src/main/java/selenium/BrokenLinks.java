package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\sunil\\java\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		((WebDriver) driver).manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		links.addAll(driver.findElements(By.tagName("img")));
		int size = links.size();
		System.out.println("Total links are"+size);
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		for (int i = 0; i < links.size() ; i++) {
			if(links.get(i).getAttribute("href")!=null) {
				activeLinks.add(links.get(i));
			
		}
	}
		System.out.println("the activeLinks are"+activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
		URL url=new URL(activeLinks.get(j).getAttribute("href"));
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinks.get(j).getAttribute("href")+"...."+response);
			
			
}
}}