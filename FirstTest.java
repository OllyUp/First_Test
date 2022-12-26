import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings
{
    @Test
    public void firstTest()
    {
        driver.get("https://loveandlive.ua/");
        WebElement pageLogo = null;
        try
        {
           pageLogo = driver.findElement(By.xpath("//*[@class='logo']"));
        }
        catch (Exception e)
        {
            System.out.println("Страница не найдена");
        }
        if(pageLogo.isDisplayed())
        {
            System.out.println("Страница найдена");
        }
        try
        {
            driver.findElement(By.xpath("//*[@class='menu-link menu-link--current']")).click();
        }
        catch (Exception e)
        {
            System.out.println("Страница не открилась");
        }
    }
}
