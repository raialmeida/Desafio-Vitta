package Suporte;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static ChromeDriver driver;

	public static WebDriver Iniciadriver() {

		// Abrindo o ChromeDriver
		System.setProperty("webdriver.chrome.driver", "target\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navegando para o site
		driver.get("https://www.saraiva.com.br/");
		return driver;
	}

//screenshot    
	static String pastascreenshot = new SimpleDateFormat("dd-MM-yyyy HH-mm").format(Calendar.getInstance().getTime());

	public void Print(String nomePrint) throws IOException {
		File foto = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(foto, new File("target\\screenshot\\" + pastascreenshot + "\\" + nomePrint + ".png"));

	}
}
