package MountainProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mountainProjectTest {

	public static void main(String[] args) {
		// instantiation of objects and declaration of variables

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		Dimension headerDimension = null;
		int expectedHeight = 73;
		int expectedWidth = 1040;

		String baseUrl = "http://mountainproject.com/";
		String expectedTitle = "Rock Climbing Guides: Routes, Photos & Forum | " + "Mountain Project";
		String actualTitle = "";

		// launches Chrome and directs it to the Base URL
		driver.get(baseUrl);

		// retrieve actual title of web page
		actualTitle = driver.getTitle();

		/*
		 * compares the actual title of the page with the expected one and prints result
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Title Test Passed");
		} else {
			System.out.println("Title Test Failed");
		}
		
		/*
		 * compares the actual header dimensions of the page with the expected 
		 * dimensions and prints the result
		 */

		headerDimension = driver.findElement(By.id("blueHeaderBox")).getSize();

		if (expectedHeight == headerDimension.height && expectedWidth == 
				headerDimension.width) {
			System.out.println("Header Dimension Test Passed");
		}
		
		else {
			
			System.out.println("Header Dimension Test Failed.");
			
		}

		// close Chrome
		driver.close();

	}

}
