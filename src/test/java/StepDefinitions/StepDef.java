package StepDefinitions;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePg;
import pages.LoginPg;
import pages.InfoPg;
public class StepDef {
WebDriver driver;

LoginPg lgn;
HomePg hmInfo;
InfoPg myinfoContactDtl;


@Before
public void setup() {
String projectpath = System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver", projectpath +"/Driver/chromedriver.exe");
driver = new ChromeDriver();

//initializing driver to class objects
lgn= new LoginPg(driver);
hmInfo= new HomePg(driver);
myinfoContactDtl= new InfoPg(driver);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();

}


@Given("^User is on Login Page$")
public void user_is_on_login_page() {




driver.get("https://opensource-demo.orangehrmlive.com/");

}




@When("^User enters Credentials to LogIn$")
public void user_enters_credentials_to_log_in(DataTable table) {
List<List<String>> data = table.cells();

lgn.sendUserName(data.get(0).get(0));
lgn.sendPassword(data.get(0).get(1));
lgn.clickButton();

}



@Then("^User is on homepage$")
public void message_displayed_login_successfully() {

System.out.println("user is on home page ");

}
@And("^User clicks on MyInfo$")
public void user_clicks_on_myinfo() {
hmInfo.click_myInfo();
}
@And("^User clicks on Contanct details$")
public void user_clicks_on_contact_details() {
myinfoContactDtl.click_contactDetails();
}
@And("^User clicks on profile icon$")
public void user_clicks_on_profile_icon() throws InterruptedException {
hmInfo.click_profileLink();
Thread.sleep(3000);
}
@And("^user clicks on logout button$")
public void user_clicks_on_logout_button() {
hmInfo.click_logout();
}

@After
public void tearDown() {
driver.close();
driver.quit();
}



}