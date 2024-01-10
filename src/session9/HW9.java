package session9;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class HW9 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "data/randomNumbers.xlsx";
		
		writeExcelFile(filePath);
		readExcelFile(filePath);
			
	}
	
	public static void writeExcelFile(String filePath) throws IOException {
	
		Set<Integer> mySet = new LinkedHashSet<>();
	
		Random random = new Random();
	
		while(mySet.size() != 500) {
			mySet.add(random.nextInt(1000));
		}	
	
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet();
	
		int i = 0;
		for(Integer item : mySet) {
			ws.createRow(i).createCell(0).setCellValue(item);
			i++;
		}
	
		
		File f = new File(filePath);
		FileOutputStream fo = new FileOutputStream(f);
	
		wb.write(fo);
		wb.close();
		
	}

	public static void readExcelFile(String filePath) throws IOException {
		
		File f = new File(filePath);
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheetAt(0);
		
		for (int i = 0; i < 500; i++) {
			System.out.println(ws.getRow(i).getCell(0));
		}
		
	}
		
}
