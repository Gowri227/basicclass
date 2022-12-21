package PROJECT_1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactinhotel_project {

public static void main(String[] args) throws IOException  {

System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\ADMIN\\eclipse-workspace\\SELENIUM_PROJECTS\\DRIVER\\chromedriver.exe");	
	
WebDriver driver = new ChromeDriver();

driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();

// LOGIN registertion-------------------------------------
WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
username.sendKeys("Gowri0123");
WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("123456");
WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
login.click();

TakesScreenshot ts = (TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SELENIUM_PROJECTS\\SCREENSHOTS\\login.png");		
FileUtils.copyFile(src, des);

//selecting places by select methods----------------------------------
WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
location.click();
Select loc = new Select(location);
loc.selectByVisibleText("Adelaide");

WebElement hotels = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
hotels.click();
Select hote = new Select(hotels);
hote.selectByVisibleText("Hotel Sunshine");

WebElement roomtype = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
roomtype.click();
Select rt = new Select(roomtype);
rt.selectByVisibleText("Super Deluxe");

WebElement no_of_room = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
no_of_room.click();
Select nr = new Select(no_of_room);
nr.selectByVisibleText("1 - One");

WebElement checkin = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
checkin.sendKeys("01/12/2022");
WebElement checkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
checkout.sendKeys("12/12/2022");

WebElement Adults_room = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
Adults_room.click();
Select ar = new Select(Adults_room);
ar.selectByVisibleText("3 - Three");

WebElement child_room = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
child_room.click();
Select cr = new Select(child_room);
cr.selectByVisibleText("2 - Two");

WebElement search = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
search.click();

//-----------------------
//select hotel 

WebElement selecthotel = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));	
selecthotel.click();

WebElement continue_bttn = driver.findElement(By.xpath("//input[@id='continue']"));
continue_bttn.click();

//details--------------------------------------------------

WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
firstname.sendKeys("Gowri");
WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
lastname.sendKeys("Shankar");
WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
address.sendKeys("coimbatore");
WebElement creditcard = driver.findElement(By.xpath("//input[@id='cc_num']"));
creditcard.sendKeys("7894561231469456");

WebElement credittype = driver.findElement(By.xpath("//select[@id='cc_type']"));
credittype.click();
Select ctt = new Select(credittype);
ctt.selectByVisibleText("American Express");

WebElement expirymonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
expirymonth.click();
Select exm = new Select(expirymonth);
exm.selectByVisibleText("December");

WebElement expiryyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
expiryyear.click();
Select exy = new Select(expiryyear);
exy.selectByVisibleText("2022");

WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
cvv.sendKeys("789");

WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
booknow.click();

//search hotel-------------------------------------------
WebElement myltineary = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
myltineary.click();

//--------------------------------------------------------

WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
checkbox.click();

WebElement cancel = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
cancel.click();

Alert alert = driver.switchTo().alert();
alert.accept();

WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
logout.click();

System.out.println("successfully logged out");
















}

}
