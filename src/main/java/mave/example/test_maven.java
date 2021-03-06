package mave.example;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test_maven {
	public static final String USERNAME = "LoanNguyen";
	  public static final String ACCESS_KEY = "1d295b6d-8778-4c27-9dc8-d573db3bb38f";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows XP");
	    caps.setCapability("version", "43.0");
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 
	    /**
	     * Goes to Sauce Lab's guinea-pig page and prints title
	     */
	 
	    driver.get("https://saucelabs.com/test/guinea-pig");
	    System.out.println("title of page is: " + driver.getTitle());
	 
	    driver.quit();
	  }
}
