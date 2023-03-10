package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormatDate {

//	The TestNG Eclipse plug-in offers several quick fixes while you are editing a TestNG class (accessible with Ctrl-1 on Windows/Linux and ⌘-1 on Mac OS):
	String name="The"
			+ "Coding"
			+ "Compile"
			+ "Execution"
			+ ""
			+ ""
			+ ""
			+ ""
			+ "";

	@Parameter
	@Test
	public void enterDate() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/datepicker.php#load_box");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#datepicker")).click();
		System.out.println(driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText());
		
		//WebElement date=driver.findElement(By.cssSelector("div.ui-datepicker-title"));
		while(!driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().equalsIgnoreCase("December 2024")) {
		driver.findElement(By.cssSelector("a[title='Next']")).click();
	}

	System.out.println(driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText());
	System.out.println("Dec 2024 is selected!!");
		
		//driver.quit();
	}
}
