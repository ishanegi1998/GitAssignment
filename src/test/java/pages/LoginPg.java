package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPg {
WebDriver driver;

By Name= By.xpath("//input[@name='txtUsername']");
By psswrd = By.xpath("//input[@name='txtPassword']");
By sendButton = By.className("button");

public LoginPg(WebDriver driver) {
this.driver=driver;

}

public void sendUserName(String username) {
driver.findElement(Name).sendKeys(username);

}
public void sendPassword(String password) {
driver.findElement(psswrd).sendKeys(password);
}

public void clickButton() {
driver.findElement(sendButton).click();
}



}