package Seleniumjavapracticecode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pract05 {
	public static void main(String[] args) throws IOException ,FileNotFoundException {
		String file ="/home/iram/Desktop/username.xlsx";
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook xw = new XSSFWorkbook(fis);
	XSSFSheet xs = xw.getSheetAt(0);
	int rowno = xs.getLastRowNum();
	for(int i=0;i<=rowno;i++) {
		Row r = xs.getRow(i);
		Cell c = r.createCell(2);
		c.setCellValue("Hello");
	}
	FileOutputStream fos = new FileOutputStream(file);
xw.write(fos);
	
	
	}}
		
		

