package ddtpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Desktop\\testdata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		/*
		 * XSSFSheet sheet=wb.getSheet("Sheet1"); XSSFRow row=sheet.getRow(2); XSSFCell
		 * cell=row.getCell(4);
		 * 
		 * String val1=cell.getStringCellValue(); System.out.println(val1);
		 */
		
		//String val2=wb.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		//System.out.println(val2);
		
		//int rcount=wb.getSheet("Sheet1").getLastRowNum();
		
		//System.out.println(rcount);
		
	//		int celcount=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		//	System.out.println(celcount);
	
	
		int rcount=wb.getSheet("Sheet1").getLastRowNum();

		
		for(int i = 0;i<=rcount;i++){
			
			int celcount=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
			System.out.println(i +"  index row contains = "+celcount+"  clms");
			
		}
		
		
		
	
	
	}

}
