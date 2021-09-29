package readExcelData;

import java.io.File;
import java.io.FileInputStream;






import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursMultipleData {

	public static void main(String[] args) throws Exception {
		// To launch the browser and to open the URL
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// To open and read my Excel file
		File SF= new File("D:\\data\\NewToursTestData.xlsx");
		FileInputStream fis= new FileInputStream(SF);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		for (int i=0;i<=rowcount;i++)
		{
			// To fetch the data from my excel sheet row1
			String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			// To enter the username and password
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			  driver.findElement(By.id("txtPassword")).sendKeys(password);
			  driver.findElement(By.id("btnLogin")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.id("welcome")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			
			
		}
		wb.close();
	}

}
