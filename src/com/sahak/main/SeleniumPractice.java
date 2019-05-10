package com.sahak.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "S:\\Selenium tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		User user = new User();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://stackoverflow.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log In")).click();

		driver.findElement(By.id("email")).sendKeys("myemail@gmail.com");
		driver.findElement(By.id("password")).sendKeys("passowrd");
		driver.findElement(By.id("submit-button")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.className("-link--channel-name")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.id("nav-jobs")).click();		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.id("q")).sendKeys("Java");		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='job-search-form']/div[2]/div[2]/div/div[1]/button")).click();
		Thread.sleep(5000);
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.className("s-link__visited"));
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		for(WebElement e : elements) {
			System.out.println(e.getText());
			driver.findElement(By.linkText(e.getText())).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='content']/header/div[3]/div[1]/a")).click();
			Thread.sleep(1000);
			
			if(	driver.findElement(By.id("CandidateName"))!=null){
				driver.findElement(By.id("CandidateName")).clear();
				driver.findElement(By.id("CandidateName")).sendKeys(user.getCandidateName());
			}
			
			if(	driver.findElement(By.id("CandidateLocation"))!=null){
				driver.findElement(By.id("CandidateLocation")).clear();
				driver.findElement(By.id("CandidateLocation")).sendKeys(user.getCandidateLocation());
			}
			
			
			if(	driver.findElement(By.id("CandidateEmail"))!=null){
				driver.findElement(By.id("CandidateEmail")).clear();
				driver.findElement(By.id("CandidateEmail")).sendKeys(user.getCandidateEmail());
			}
			
			if(	driver.findElement(By.id("CandidatePhoneNumber"))!=null){
				driver.findElement(By.id("CandidatePhoneNumber")).clear();
				driver.findElement(By.id("CandidatePhoneNumber")).sendKeys(user.getCandidatePhoneNumber());
			}
			
			if(	driver.findElement(By.id("CoverLetter"))!=null){
				driver.findElement(By.id("CoverLetter")).clear();
				driver.findElement(By.id("CoverLetter")).sendKeys(user.getCoverLetter());
			}
			
			if(	driver.findElement(By.id("custom-question_13065066"))!=null){
				driver.findElement(By.id("custom-question_13065066")).clear();
				driver.findElement(By.id("custom-question_13065066")).sendKeys(user.getCustomeQuestion13065066());
			}
			
			if(	driver.findElement(By.id("custom-question_13065068"))!=null){
				driver.findElement(By.id("custom-question_13065068")).clear();
				driver.findElement(By.id("custom-question_13065068")).sendKeys(user.getCustomeQuestion13065068());
			}
			
			if(	driver.findElement(By.id("custom-question_13065072"))!=null){
				driver.findElement(By.id("custom-question_13065072")).clear();
				driver.findElement(By.id("custom-question_13065072")).sendKeys(user.getCustomeQuestion13065072());
			}
			
			if(	driver.findElement(By.id("custom-question_13065073"))!=null){
				driver.findElement(By.id("custom-question_13065073")).clear();
				driver.findElement(By.id("custom-question_13065073")).sendKeys(user.getCustomeQuestion13065073());
			}
			
			if(	driver.findElement(By.id("custom-question_13065074"))!=null){
				driver.findElement(By.id("custom-question_13065074")).clear();
				driver.findElement(By.id("custom-question_13065074")).sendKeys(user.getCustomeQuestion13065074());
			}
			
			if(	driver.findElement(By.id("custom-question_13065075"))!=null){
				driver.findElement(By.id("custom-question_13065075")).clear();
				driver.findElement(By.id("custom-question_13065075")).sendKeys(user.getCustomeQuestion13065075());
			}
			
			if(	driver.findElement(By.id("custom-question_13065076"))!=null){
				driver.findElement(By.id("custom-question_13065076")).clear();
				driver.findElement(By.id("custom-question_13065076")).sendKeys(user.getCustomeQuestion13065076());
			}
			
			
			if(	driver.findElement(By.id("custom-question_13065077"))!=null){
				driver.findElement(By.id("custom-question_13065077")).clear();
				driver.findElement(By.id("custom-question_13065077")).sendKeys(user.getCustomeQuestion13065077());
			}
			
			
			if(	driver.findElement(By.id("custom-question_13065078"))!=null){
				driver.findElement(By.id("custom-question_13065078")).clear();
				driver.findElement(By.id("custom-question_13065078")).sendKeys(user.getCustomeQuestion13065078());
			}
			
			
			if(	driver.findElement(By.id("custom-question_13065079"))!=null){
				driver.findElement(By.id("custom-question_13065079")).clear();
				driver.findElement(By.id("custom-question_13065079")).sendKeys(user.getCustomeQuestion13065079());
			}
			
			if(	driver.findElement(By.id("custom-question_13065080"))!=null){
				driver.findElement(By.id("custom-question_13065080")).clear();
				driver.findElement(By.id("custom-question_13065080")).sendKeys(user.getCustomeQuestion13065080());
			}
			
			//*[@id="content"]/div[3]/form/div[14]/div[1]/input
			

			if(	driver.findElement(By.xpath("//*[@id='content']/div[3]/form/div[14]/div[1]/input"))!=null){
	
				driver.findElement(By.xpath("//*[@id='content']/div[3]/form/div[14]/div[1]/input")).click();
			}
			
			if(!driver.getTitle().equalsIgnoreCase(title)){
				String originalHandle = driver.getWindowHandle();
				
				for(String handle : driver.getWindowHandles()) {
					if(!handle.equals(originalHandle)) {
						driver.switchTo().window(handle);
						driver.close();
					}
				}
				driver.switchTo().window(originalHandle);
			}
	
			
		}
		
		
	}
}
