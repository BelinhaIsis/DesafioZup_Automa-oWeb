package util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Reutilizaveis {

	
	public WebDriver getDriver(String pDtipoDriver) {

		WebDriver driver = null;

		if (pDtipoDriver.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\JoaoCaboclo\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("chrome.switches", "--disable-extensions");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (pDtipoDriver.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C://Users//P979//Firefox Driver - geckodriver-v0.26.0-win64//geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
	
}
