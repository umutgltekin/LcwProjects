import com.sun.jndi.ldap.sasl.LdapSasl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.findElement(By.cssSelector(".dropdown-label")).click();
        driver.findElement(By.cssSelector(".login-form__link")).click();
        driver.findElement(By.name("RegisterFormView.RegisterEmail")).sendKeys("yanlısmail.com");
        driver.findElement(By.name("RegisterFormView.Password")).sendKeys("123456");
        WebElement element1=driver.findElement(By.cssSelector(".field-validation-error") );
        WebElement element2=driver.findElement(By.cssSelector(".field-validation-error #RegisterFormView_Password-error"));

        System.out.println("error1  "+element1.getText());
        System.out.println("error2 "+ element2.getText());
        driver.close();








    }

}
