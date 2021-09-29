package readExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultiCellExcel {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File SF= new File("D:\\Data\\NewToursTestData.xlsx");
		FileInputStream fis= new FileInputStream(SF);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		for (int i=1;i<rowcount;i++)
		{
			int columncount=sheet1.getRow(i).getLastCellNum();
			for (int j=0;j<columncount;j++)
			{
				System.out.println(" value stored at "+i+" row & "+j+" column is "+sheet1.getRow(i).getCell(j).getStringCellValue());
			}
		}
		wb.close();
		

	}

}
