import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ubdateddropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //count of check boxes
        Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());




       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(1000);

       int i=1;
       while (i<6)
       {
           driver.findElement(By.id("hrefIncAdt")).click();
           i++;
       }
            driver.findElement(By.id("btnclosepaxoption")).click();
       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"6 Adult");
             System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }

}
