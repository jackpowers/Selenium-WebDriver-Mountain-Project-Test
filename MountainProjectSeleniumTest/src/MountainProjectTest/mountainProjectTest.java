package MountainProjectTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mountainProjectTest {
	
	 public static void main(String[] args) {
	        // instantiation of objects and declaration of variables

			System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://mountainproject.com/";
	        String expectedTitle = "Rock Climbing Guides: Routes, Photos & Forum | "
	        		+ "Mountain Project";
	        String actualTitle = "";

	        // launches Chrome and direct it to the Base URL
	        driver.get(baseUrl);

	        // retrieve actual title of web page
	        actualTitle = driver.getTitle();

	        /*
	         * compares the actual title of the page with the expected one 
	         *  print result 
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Chrome
	        driver.close();
	       
	    }

}
