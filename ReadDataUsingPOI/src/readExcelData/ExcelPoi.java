package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPoi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File SF= new File("D:\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(SF);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("value stored in 0th row & 0th column is "+data1);
		
		String data2=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("value stored in 0th row & 1st column is "+data2);
		
		wb.close();
		

	}

}
