package testCases;
import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectRepository.ClubMahindra_Madikeri;


public class TestCase_ClubMahindra {
	@Test
	public void PriceAnalysis() throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D://Testing Softwares//ChromeDriver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("http://www.tripadvisor.in/");
		ClubMahindra_Madikeri resort = new ClubMahindra_Madikeri(driver);
		resort.search().click();
		resort.mainSearch().sendKeys("Club Mahindra");
		resort.searchButton().click();
		System.out.println(resort.clubMahindra().getText());
		resort.clubMahindra().click();
		Set<String> S = driver.getWindowHandles();
		Iterator<String> it = S.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		resort.reviews().click();
		resort.write_A_Review().click();
		driver.switchTo().window(ParentId);
        driver.close();
        driver.switchTo().window(ChildId);
       Set<String> S1 = driver.getWindowHandles();
		Iterator<String> it1 = S1.iterator();
		String ParentId1 = it1.next();
		String ChildId1 = it1.next();
        driver.switchTo().window(ChildId1);
        resort.reviewTitle().sendKeys("Good Place To Visit Once");
        resort.reviewText().sendKeys("Club Mahindra Madikeri Resort is just awesome. The ambiance was excellent and all the staffs were very helpful and Great varities of food by chef Ravi.. mesmerising for the eyes, tantalizing the taste buds.. Excellent service provided by club Mahindra. A good place to hop in to have a wonderful ambience. A great place to vacation.");
        resort.submitReview().click();
	}
}
