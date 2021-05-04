package reviewclass12.fileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingNewFiles {


    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+"/Files/myFile.xlsx";
        System.out.println(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
       Sheet sheet= xssfWorkbook.createSheet("Sheet1");
        Sheet sheet2= xssfWorkbook.createSheet("Sheet2");
       Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue(10);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);


    }
}
