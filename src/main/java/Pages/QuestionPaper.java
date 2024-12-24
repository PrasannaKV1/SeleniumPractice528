package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionPaper {

     @FindBy(xpath = "//a[text()='Question Papers']")
     WebElement QuestionPaper;

     @FindBy(xpath = "//button[text()='Create New Question Paper']")
     WebElement CreateQP;

     @FindBy(xpath="//h4[text()='Auto generation']")
     WebElement Auto ;

     @FindBy(xpath = "(//button[text()='Create Assessment'])[1]")
     WebElement CreateAssessment;

     @FindBy(xpath = "//span[text()='Name of Examination *']")
     WebElement  Nameofexamination;

     @FindBy(xpath = "(//div[@role='button'])[1]")
     WebElement Grade;

     @FindBy(xpath = )


}

