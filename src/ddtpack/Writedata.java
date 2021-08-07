package ddtpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Desktop\\testdata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet1").getRow(4).createCell(4).setCellValue("ddt testing 9am");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kiran\\Desktop\\testdata.xlsx");
		wb.write(fos);
		fos.close();
		
		
		
	}

}
