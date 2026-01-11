package experements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
WebDriver driver = new ChromeDriver();


@Test
    public void selectorHomePage(){
    driver.get("https://demoqa.com/");
    driver.manage().window().maximize();
    pausa(3);
    driver.navigate().to("https://demoqa.com/elements");
    pausa(3);
    driver.navigate().back();
    pausa(3);
    driver.navigate().refresh();
    pausa(3);
//    driver.close();
    driver.quit();

}

@Test
public void selectorsCssTests(){
    driver.get("https://demoqa.com/");
    driver.manage().window().maximize();
    WebElement footer = driver.findElement(By.tagName("footer"));
    System.out.println(footer.getTagName());
    WebElement divElements =driver.findElement(By.cssSelector(".card-up"));
    pausa(3);
    divElements.click();
    WebElement radioBtn = driver.findElement(By.cssSelector("#item-2"));
    radioBtn.click();
    WebElement radioBtnYes= driver.findElement(By.cssSelector("label[for='yesRadio']"));
    radioBtnYes.click();
    pausa(3);
    driver.navigate().back();
    driver.navigate().back();
//    WebElement divWidgets = driver.findElement(By.cssSelector("div[class='category-cards']" + "[class='card mt-4 top-card']:nth-child(4)"));
//   WebElement divWidget = driver.findElement(By.cssSelector("div[class='category-cards' ] [class='card mt-4 top-card']:nth-child(4)"));
//   divWidget.click();


}





public void pausa(int time){
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}



}
