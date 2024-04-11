package Seleniumjavapracticecode;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice04 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		//String filepath = "/home/iram/Desktop/username.xlsx";
		File file = new File("/home/iram/Desktop/username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xw = new XSSFWorkbook(fis);
	/*	XSSFSheet xs = xw.getSheetAt(0);
		Row r = xs.getRow(0);
		Cell c = r.getCell(0);
		System.out.print(xs.getRow(0).getCell(0));*/
		if(file.isFile() && file.exists()) {
			System.out.println("/home/iram/Desktop/username.xlsx  open" );
			
		}
		else {
			System.out.println("/home/iram/Desktop/username.xlsx either not exist");
		}
		
		

	}

}
