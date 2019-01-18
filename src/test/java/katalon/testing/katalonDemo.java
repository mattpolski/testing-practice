package katalon.testing;

import katalon.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class katalonDemo {
    public static void main(String[] args) {
        final String XPATH_MAKE_APPOINTMENT = "//a[@id='btn-make-appointment']";
        final String XPATH_USERNAME = "//input[@id='txt-username']";
        final String XPATH_PASSWORD = "//input[@id='txt-password']";
        final String XPATH_LOGIN = "//button[@id='btn-login']";
        final String XPATH_TITLE = "//h1[contains(text(),'CURA Healthcare Service')]";
        String username = "John Doe";
        String password = "ThisIsNotAPassword";


        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment = driver.findElement(By.xpath(XPATH_MAKE_APPOINTMENT));
        makeAppointment.click();

        WebElement putName = driver.findElement(By.xpath(XPATH_USERNAME));
        putName.sendKeys(username);

        WebElement putPassword = driver.findElement(By.xpath(XPATH_PASSWORD));
        putPassword.sendKeys(password);

        WebElement login = driver.findElement(By.xpath(XPATH_LOGIN));
        login.click();

        WebElement menu = driver.findElement(By.xpath("//i[@class='fa fa-bars']"));
        menu.click();
        WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        logout.click();

        WebElement title = driver.findElement(By.xpath(XPATH_TITLE));
        String displayedTitle = title.getText();

        System.out.println(displayedTitle);

    }
}
