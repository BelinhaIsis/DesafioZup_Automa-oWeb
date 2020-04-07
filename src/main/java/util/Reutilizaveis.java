package util;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import org.openqa.selenium.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reutilizaveis {

	protected ATUTestRecorder gravavideo = null;
	java.util.Date d = new Date();
	String dStr = java.text.DateFormat.getDateInstance(DateFormat.LONG).format(d);

	public void iniciarGravacao() {
//		try {
		/*//	gravavideo = new ATUTestRecorder("C:\\Users\\JoaoCaboclo\\grava video com evidencias dos destes\\",
//					"GodIsgood-VideoTeste", false);
		//	gravavideo.start();
//		} catch (ATUTestRecorderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void CopiarTela(String pStep) {
		try {
			File scrFile = ((TakesScreenshot) getDriver("chrome")).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\JoaoCaboclo\\grava video com evidencias dos destes\\" + pStep + ".png"));
		} catch (Exception e) {
			new Exception(e.toString());
		}
	}


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
