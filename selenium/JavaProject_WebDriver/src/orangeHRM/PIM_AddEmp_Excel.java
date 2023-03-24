package orangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIM_AddEmp_Excel {

	public static void AddEmployeeExcel(WebDriver myChrome) throws IOException, InterruptedException
	{
		
		
		String excel_file=new File("External_Files/ExcelFiles/Emp.xlsx").getAbsolutePath();
		
		//System.out.println(excel_file);
		
		FileInputStream file=new FileInputStream(excel_file);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("orange_HRM");
		
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			String FName=row.getCell(0).getStringCellValue();
			System.out.println(FName);
			
			
			// Sometimes the cell data might be empty, so we used this logic,Mname is declared outside becoz we cannot declare variable in if loop
			String MName="";
			if(row.getCell(1) != null)
				 MName=row.getCell(1).getStringCellValue();
			     System.out.println(MName);
			
			String LName=row.getCell(2).getStringCellValue();
			System.out.println(LName);
			
			
			// if the cell in Excel is a number, we cannot read it with getStringCellValue() method.
			// so we must use getNumericCellValue() method
			int EmpId=(int) row.getCell(3).getNumericCellValue();
			
			// we must send String value to sendKeys method; for that reason, converting the number to string
			String EmpId_str = String.valueOf(EmpId);		
			System.out.println(EmpId_str);
			
			String UserName=row.getCell(4).getStringCellValue();
			System.out.println(UserName);
			String Status=row.getCell(5).getStringCellValue();
			System.out.println(Status);
			String password=row.getCell(6).getStringCellValue();
			System.out.println(password);
			
			System.out.println("    " );
			
			
			PIM_AddEmp.AddEmployee(myChrome, FName,MName,LName,EmpId_str, UserName,Status, password);
	    	
		}
	
	}

}
