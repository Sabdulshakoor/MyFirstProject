package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{
    public void enter_user_name(String un){
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys(un);

    }
    public void enter_user_email(String em){
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(em);
    }
    public void enter_user_password(String pwd){
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(pwd);
    }
    public void click_on_registration_btn(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();

    }

}
