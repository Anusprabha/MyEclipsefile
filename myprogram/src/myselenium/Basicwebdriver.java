package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicwebdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to run the webpage in browser
		driver.get("https://www.google.com/");
		
		//to find the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get the url of current page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//to get the page source code of current url
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		
		//navigate from one url to another url
		driver.navigate().to("https://paytm.com/");
		
		//navitage to backward
		driver.navigate().back();
		
		//navitage to forward
		driver.navigate().forward();
		
		//close the current browser window 
		driver.close();
		
		/*to quit the whole browser session along 
		with all the associated browser windows, tabs and pop-ups*/
		driver.quit();

	}

}
