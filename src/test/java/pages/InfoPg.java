package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class InfoPg {
WebDriver driver;

By contact_details= By.linkText("Contact Details");

public InfoPg(WebDriver driver) {
this.driver=driver;
}
public void click_contactDetails() {
driver.findElement(contact_details).click();

}
}