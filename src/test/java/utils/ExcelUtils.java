package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String getCellData(int row, int col) throws Exception {

		 FileInputStream fis = new FileInputStream("src/test/resources/RegisterData.xlsx");

		 XSSFWorkbook workbook = new XSSFWorkbook(fis);

		 XSSFSheet sheet = workbook.getSheet("Sheet1");

		 return sheet.getRow(row).getCell(col).toString();
		}
}