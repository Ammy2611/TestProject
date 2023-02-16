package UtilityPK;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Utility02 {
	
public static String getDatafromExcelSheet(String Sheet, int row ,int colume) throws EncryptedDocumentException, IOException {
	
	String path = "C:\\Users\\PSPL\\Desktop\\Velocity.xlsx";
	
	FileInputStream file = new FileInputStream(path);
	String Data = WorkbookFactory.create(file).getSheet("HTMLT").getRow(row).getCell(colume).getStringCellValue();
		
			
			return Data;
}

public static void CaptureScreenshot (WebDriver driver,int testID)
{
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd HH-mm-ss");
	
//	File src=((TakeScreenshot)driver).get
	
	
	
	
}


}