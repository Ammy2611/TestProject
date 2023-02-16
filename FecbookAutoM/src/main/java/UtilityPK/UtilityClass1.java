package UtilityPK;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass1 {
	
public static String path = "C:\\Users\\PSPL\\Desktop\\Velocity.xlsx"; 
	
	public static  void captureScreenShot(WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot t = (TakesScreenshot) driver ;
		String dform = new SimpleDateFormat("- dd-mm-yyyy hh mm ss").format(Calendar.getInstance().getTime());
		File  x = t.getScreenshotAs(OutputType.FILE);
		File z = new File("D:\\selenium scrshot\\Test-filename"+dform+".jpg");
    	FileHandler.copy(x, z);
    	
	}

	public static String getDataFromExcel(String sheet,int lastrow,int lastcell ) throws EncryptedDocumentException, IOException {

		InputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);


		Sheet sheet1 = book.getSheet("HTMLT");

		int lastrow10 = sheet1.getLastRowNum();
		int v  = lastrow10;

		Row row = sheet1.getRow(v);



 
 int lastCell10 = row.getLastCellNum();
// 	Cell =lastCell10 ;
return sheet;

//DataFormatter formatter=new DataFormatter();

//String data="Amey";

// try {
//	 data= formatter.formatCellValue(Cell);
 }
// catch (Exception e){
//	double v = getNumericValue();
//		data= Double.toString(v)	;
// }
//return data;

    		}


//}
	


