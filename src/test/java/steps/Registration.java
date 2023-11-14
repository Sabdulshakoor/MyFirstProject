package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class Registration {
    MyAccountPage mp;
    public Registration (){
        mp= new MyAccountPage();
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        mp.open_chrome_browser();


        }

    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String userName) {
        mp.enter_user_name(userName);

    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String email) {
       mp.enter_user_email(email);

    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String password) {
        mp.enter_user_password(password);

    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        mp.click_on_registration_btn();


    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {


//
//        WebElement dashboardText = driver.findElement(By.linkText("Dashboard"));
//        String dashboardTextValue = dashboardText.getText();
//
//        if (dashboardTextValue.equals("Dashboard")) {
//            System.out.println("Verification Passed: Dashboard text is displayed.");
//        } else {
//            System.out.println("Verification Failed: Dashboard text is not displayed.");
//        }
    }

    }


