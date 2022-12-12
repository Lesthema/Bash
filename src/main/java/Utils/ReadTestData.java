package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTestData {

    String homeDir = System.getProperty("user.dir");
    String testDataDir = homeDir + "\\src\\main\\java\\TestData\\TestData.xlsx";
    FileInputStream fis = new FileInputStream(testDataDir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    public ReadTestData() throws IOException {
    }

    XSSFSheet sheet = workbook.getSheetAt(0);

    public String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public String password = sheet.getRow(1).getCell(1).getStringCellValue();

}


