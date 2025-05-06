package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DynamicDropdowns
{
    protected WebDriver driver;

    @FindBy(xpath="//div[@id='select-class-example']/fieldset/input[@id='autocomplete']" )
    private WebElement suggestiveDropdown;

    @FindBy(xpath="//ul/li[@class='ui-menu-item']")
    private List<WebElement> dropdownlist;


    public DynamicDropdowns (WebDriver driver)
    {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = (WebDriver) driver;
        PageFactory.initElements(driver,this);
    }

    public void DynamicDropdownsSuggestive()
    {

      suggestiveDropdown.sendKeys("IN");

      for(WebElement element:dropdownlist)
      {
          if(element.getText().equalsIgnoreCase("india"))
          {
              element.click();
              break;
          }
      }




    }
}
