package Xcelsheet.programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelSheetP1 {

	public static void main(String[] args) throws IOException
	{
		//Excel file---->WorkBook---->Sheets---->Rows--->Cells
		//FileInputStream class is to read data
		//FileOutputStream class is to write data
		 
		String path=System.getProperty("user.dir")+"\\DataSheet\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("readData");
		
		int totalRows=sheet.getLastRowNum();
		int totalCell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total numer of rows :"+ totalRows); //4
		System.out.println("total numer of cells :"+ totalCell); //4
		
		for(int r=0;r<=totalRows; r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalCell; c++)
			{
				XSSFCell currentCell=currentRow.getCell(c);
				System.out.print(currentCell.toString()+ "\t");
				
			}
			System.out.println();
		}
		
		workbook.close();
		fis.close();



	}

}
