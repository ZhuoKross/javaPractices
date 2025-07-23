package Excel_Implementation;


import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;
import java.io.*;
import java.util.stream.Stream;



public class ReadFile {
     String pathFile = "C:/Users/michael.garnica/Desktop/ejemplo.xlsx";

     public void readExcel (){
         try(InputStream is = new FileInputStream(pathFile);
             ReadableWorkbook wb = new ReadableWorkbook(is)){


             org.dhatim.fastexcel.reader.Sheet sheet = wb.getFirstSheet();

             try(Stream<Row> rows = sheet.openStream()){
                 rows.forEach(row -> {
                     String str = row.getCellAsString(0).orElse(null);
                     //System.out.println(row.getCell(1));
                     System.out.println(row.getCellText(1));
                     System.out.println(str);
                 });
             }

         }catch (Exception e){
             e.printStackTrace();
         }
     }




}
