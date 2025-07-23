package Excel_Implementation;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public void writeFile() throws IOException {
        try(Workbook wb = WorkbookFactory.create(new File("C:/Users/michael.garnica/Desktop/ejemplo.xlsx"))){
            Sheet sheet = wb.getSheetAt(0);
            Row rows = sheet.getRow(0);

            rows.forEach(Cell::getStringCellValue);
            System.out.println(rows.getCell(0));


        }
    }
}
