package datadrivent;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class readdatafromexcel {
@Test
	public void readexcel() throws Exception{
		File src=new File("D:\\data files\\datadrivendata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel is "+data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data from excel is "+data1);
		wb.close();
	}
	
}


