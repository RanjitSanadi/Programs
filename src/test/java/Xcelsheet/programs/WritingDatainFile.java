package Xcelsheet.programs;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainFile {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\DataSheet\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("java");
			row1.createCell(1).setCellValue(14);
			row1.createCell(2).setCellValue("Automation");
			
		XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("python");
			row2.createCell(1).setCellValue(15);
			row2.createCell(2).setCellValue("Automation2");
			
		XSSFRow row3=sheet.createRow(2);
			row3.createCell(0).setCellValue("C hash");
			row3.createCell(1).setCellValue(16);
			row3.createCell(2).setCellValue("Automation3");
			
			workbook.write(fos);
			workbook.close();
			fos.close();
			
			System.out.print("file is created");

	}

}
