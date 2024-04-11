package Seleniumjavapracticecode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddatafromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		String filepath = "/home/iram/Desktop/username.xlsx";
		Thread.sleep(4000);
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xs = xwb.getSheetAt(0);
		Row r = xs.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(xs.getRow(0).getCell(0));
		Cell c2 = r.getCell(1);
		System.out.println(xs.getRow(0).getCell(1));

	}

}
