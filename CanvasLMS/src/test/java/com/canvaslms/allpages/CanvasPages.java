
package com.canvaslms.allpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanvasPages 
{
	WebDriver driver;
	public CanvasPages(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//**************Login Page**************
	@FindBy(xpath="//*[@id='pseudonym_session_unique_id']")
	WebElement userName;
	public void enterUserName(String un) 
	{
		userName.sendKeys(un);
	}
	
	

	@FindBy(xpath="//*[@id='pseudonym_session_password']")
	WebElement passWord;
	public void enterPassword(String pw) 
	{
		passWord.sendKeys(pw);
	}
	
	@FindBy(xpath="//*[@id='login_form']/div[3]/div[2]/button")
	WebElement loginBtn;
	public void clickLoginBtn() 
	{
		loginBtn.click();
	}
	
	
	
	//**************Home Page**************
	
	@FindBy(xpath="//h3[contains(@title,'QA Multiple tab 1')]")
	WebElement course;
	public void clickOnCourseLink() 
	{
		course.click();
	}
	
//	@FindBy(xpath = "//*[@id='assignment_19190']/div/div[2]/a")
//	WebElement content;
//	public void clickOnContentBtn() 
//	{
//		content.click();
//	}
//	
//	@FindBy(linkText = "CogBooks Content Items")
//	WebElement contentItems;
//	public void clickOnContentItems() 
//	{
//		contentItems.click();
//	}
	
	
	@FindBy(linkText = "The Cell")
	WebElement topic1;
	public void clickOnTopic1() 
	{
		topic1.click();
	}
	
	@FindBy(xpath = "//*[@id='tool_form']/div/div[1]/div/button")
	WebElement topiclink1;
	public void clickOnTopiclink1()
	{
		topiclink1.click();
	}
	
	@FindBy(xpath = "//*[@id='section-tabs']/li[2]/a")
	WebElement assignment1;
	public void clickOnAssignment1()
	{
		assignment1.click();
	}
	// assognment 1 done
	
	@FindBy(linkText = "Intellectual Virtues and Fallacies")
	WebElement topic2;
	public void clickOnTopic2() 
	{
		topic2.click();
	}
	
	@FindBy(xpath = "//*[@id='tool_form']/div/div[1]/div/button")
	WebElement topiclink2;
	public void clickOnTopiclink2()
	{
		topiclink2.click();
	}
	
	@FindBy(xpath = "//*[@id='section-tabs']/li[2]/a")
	WebElement assignment2;
	public void clickOnAssignment2()
	{
		assignment2.click();
	}
	
	@FindBy(linkText = "Cooperative Principles and Fallacies")
	WebElement topic3;
	public void clickOnTopic3() 
	{
		topic3.click();
	}
	
	@FindBy(xpath = "//*[@id='tool_form']/div/div[1]/div/button")
	WebElement topiclink3;
	public void clickOnTopiclink3()
	{
		topiclink3.click();
	}
	
	@FindBy(xpath = "//*[@id='section-tabs']/li[2]/a")
	WebElement assignment3;
	public void clickOnAssignment3()
	{
		assignment3.click();
	}
	
	@FindBy(linkText = "Foundations of Argumentation")
	WebElement topic4;
	public void clickOnTopic4() 
	{
		topic4.click();
	}
	
	@FindBy(xpath = "//*[@id='tool_form']/div/div[1]/div/button")
	WebElement topiclink4;
	public void clickOnTopiclink4()
	{
		topiclink4.click();
	}
	
	@FindBy(xpath = "//*[@id='section-tabs']/li[2]/a")
	WebElement assignment4;
	public void clickOnAssignment4()
	{
		assignment4.click();
	}
	
	@FindBy(xpath="//*[@id=\"ltitr-trialpanel\"]/div/input")
	WebElement continueBtn;
	public void clickOnContinue() 
	{
		
		continueBtn.click();
	}
	
	@FindBy(id="startIcon")
	WebElement startCourse;
	public void clickOnStartCourse() 
	{
		startCourse.click();
	}
	
}
