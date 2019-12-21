package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ClubMahindra_Madikeri {
WebDriver driver ;
	public ClubMahindra_Madikeri(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (css = "div[title='Search']" )
	WebElement search;
	@FindBy (id = "mainSearch")
	WebElement mainsearch ;
	@FindBy (id = "SEARCH_BUTTON")
	WebElement searchbutton;
	@FindBy (css = "div.result-title" )
	WebElement clubmahindra;
	@FindBy (css = "span.hotels-hotel-review-atf-info-parts-Rating__reviewCount--1sk1X" )
	WebElement reviews;
	@FindBy (linkText = "Write a review" )
	WebElement write_a_review;
	@FindBy (id = "ReviewTitle" )
	WebElement reviewtitle;
	@FindBy (id = "ReviewText" )
	WebElement reviewtext;
	@FindBy (id = "noFraud" )
	WebElement submitreview;
	public WebElement search()
    {
    	return search;
    }
    public WebElement mainSearch()
    {
    	return mainsearch; }
    public WebElement searchButton()
    {return searchbutton;
    }
    
    public WebElement clubMahindra()
    {return clubmahindra;}
    
public WebElement reviews()
{
	return reviews; }
public WebElement write_A_Review()
{
	return write_a_review; }
public WebElement reviewTitle()
{
	return reviewtitle; }
public WebElement reviewText()
{
	return reviewtext; }
public WebElement submitReview()
{
	return submitreview; }}
	
	


