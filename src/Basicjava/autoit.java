package Basicjava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhqq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.47.1")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\alok\\Desktop\\alok.au3");
		

	}

}
