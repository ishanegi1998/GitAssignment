package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePg {
WebDriver driver;
By myInfo= By.id("menu_pim_viewMyDetails");
By profile = By.id("welcome");
By logout= By.linkText("Logout");

public HomePg(WebDriver driver) {
this.driver=driver;
}
public void click_myInfo() {
driver.findElement(myInfo).click();
}
public void click_profileLink() {
driver.findElement(profile).click();
}
public void click_logout() {
driver.findElement(logout).click();
}



}