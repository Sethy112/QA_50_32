package experements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsTextBox() {
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        pausa(3);
        hideFooter();
        hideBanner();

        WebElement btnTextBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
        btnTextBox.click();

        WebElement fieldFullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fieldFullName.sendKeys("Andrey");
        pausa(3);
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        fieldEmail.sendKeys("andrey123@gmail.com");
        pausa(2);
        WebElement fieldCurrentAdress = driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        fieldCurrentAdress.sendKeys("Vienna, austria");
        pausa(2);
        scroll();
        pausa(2);
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        btnSubmit.click();
        pausa(2);
        WebElement outPut = driver.findElement(By.id("output"));
        System.out.println(outPut.getText());


        pausa(3);
        driver.quit();

    }


    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0 ,500);");
    }

    public void pausa(int time) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void hideBanner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }
    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }
}
