package Xcelsheet.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicWriteData {

	public static void main(String[] args) throws IOException 
	{
FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\DataSheet\\Dynamicmyfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of rows :");
		int numOfrows=sc.nextInt();
		System.out.println("enter number of Cells :");
		int numOfcelss=sc.nextInt();
		
		for(int r=0; r<=numOfrows; r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0; c<=numOfcelss; c++)
			{
				XSSFCell currentcell=currentrow.createCell(c);
				currentcell.setCellValue(sc.next());
				
			}
		}
		
			
		workbook.write(fos);
			
		workbook.close();
			
		fos.close();
			
			
		System.out.print("file is created");


	}

}
