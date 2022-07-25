package ReadDataFromExternalfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataFromxls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(".\\TestData\\EmpData_2.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);

		HSSFSheet Sheet = wb.getSheet("Sheet1");

		int rowcount = Sheet.getLastRowNum();
		int colunmcount = Sheet.getRow(0).getLastCellNum();

		System.out.println("rowcount: " + rowcount);
		System.out.println("column count : " + colunmcount);

		for (int i = 1; i <= rowcount; i++) {

//          String data = sheet.getRow(i).getCell(0).toString();
      

//          System.out.println(data);

			HSSFRow currentRow = Sheet.getRow(i);

			String EmpID = currentRow.getCell(0).toString();

			String EmpName = currentRow.getCell(1).toString();

			String Address = currentRow.getCell(2).toString();

			String Contactno = currentRow.getCell(3).toString();

//			String address = currentRow.getCell(4).toString();

			System.out.println("======================");

			System.out.println("FirstName: " + EmpID);

			System.out.println("Address: " + Address);

			System.out.println("--------------------------");

		}

	}

}
