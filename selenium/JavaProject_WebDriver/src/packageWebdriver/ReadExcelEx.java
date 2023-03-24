package packageWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEx {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file =new FileInputStream("/Users/karthik/Downloads/Professional/Reeth/git_repositories/coding/selenium/JavaProject_WebDriver/External_Files/ExcelFiles/Emp.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet s=wb.getSheet("emps");
		int rows=s.getLastRowNum();
		System.out.println(rows);
		int columns=s.getRow(0).getLastCellNum();
		System.out.println(columns);
		
		for(int i=0;i<=rows;i++)
		{
			XSSFRow currentrow=s.getRow(i);
			
			for(int j=0;j<columns;j++)
			{
			
			System.out.print(currentrow.getCell(j) + " ");
			}
			
			System.out.println("  ");  
		
		}
		
	

	}

}
