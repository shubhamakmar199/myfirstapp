package Com.MVN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Get the FIle

		File src = new File("D:\\Shubham\\Book1.xlsx");
		FileInputStream f = new FileInputStream(src);

		// create object of workbook and sheet

		XSSFWorkbook workbook = new XSSFWorkbook(f);
		XSSFSheet sheet = null;

		// get the number of sheets in a workbook

		int numsheet = workbook.getNumberOfSheets();
		System.out.println(numsheet);

		// loop for number of sheets
		for (int i = 0; i < numsheet; i++) {
			// check sheet exists or not
			if (workbook.getSheetName(i).equalsIgnoreCase("Myfile")) {
				// get sheet if found
				sheet = workbook.getSheetAt(i);
			}

		}

		// fetch data from sheet using iterator

		// iterator row
		Iterator<Row> itrow = sheet.rowIterator();

		while (itrow.hasNext()) {
			// get rows
			Row row = itrow.next();

			// iterator cell
			Iterator itcell = row.cellIterator();

			while (itcell.hasNext()) {
				// get cells
				Cell c = (Cell) itcell.next();

				// check type of data
				if (c.getCellType() == CellType.STRING) {
					System.out.println(c.getStringCellValue());
				} else if (c.getCellType() == CellType.NUMERIC) {
					System.out.println(c.getNumericCellValue());
				}
			}
		}

	}

}
