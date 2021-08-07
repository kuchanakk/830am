package ddtpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDTexampl1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//excelpath
		String excelpath ="C:\\Users\\kiran\\Desktop\\testdata.xlsx";
		
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//counting rows in excel
		int rcount=wb.getSheet("Sheet6").getLastRowNum();
		
		
		for(int i = 1;i<=rcount;i++){
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			// userrname
			String username=wb.getSheet("Sheet6").getRow(i).getCell(0).getStringCellValue();
			//password according to row and clm
			String password=wb.getSheet("Sheet6").getRow(i).getCell(1).getStringCellValue();
			driver.get("http://advantageonlineshopping.com/#/");
			Thread.sleep(5000);
			driver.findElement(By.id("menuUser")).click();
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined"))).click();
			Thread.sleep(2000);
			//getting username after login
			String actualusertext=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();
			
			
			if(username.equals(actualusertext)) {
				
				System.out.println(username + "***and** "+password +"  are valid data");
				wb.getSheet("Sheet6").getRow(i).createCell(2).setCellValue("valid data");
				
			}else {
				
				System.out.println(username + "***and** "+password +"  are invalid data");
				wb.getSheet("Sheet6").getRow(i).createCell(2).setCellValue("invalid data");
				
				
			}
			
			
			FileOutputStream fop = new FileOutputStream(excelpath);
			wb.write(fop);
			fop.close();
			
			driver.close();
			
			
	
		}
		
		
		
		

	}

}
