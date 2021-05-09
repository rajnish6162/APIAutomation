//package Utils;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.*;
//
//public class ExcelReader {
//    public Void readExcel(String filePath, String fileName, String sheetName) throws IOException {
//
//
//        //Create an object of File class to open xlsx file
//
//        File file = new File(filePath + "\\" + fileName);
//
//        //Create an object of FileInputStream class to read excel file
//
//        FileInputStream inputStream = new FileInputStream(file);
//
//        Workbook book = new XSSFWorkbook(inputStream);
//        //Read sheet inside the workbook by its name
//
//        Sheet sheet = book.getSheet(sheetName);
//
//        //Find number of rows in excel file
//
//        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//
//        //Create a loop over all the rows of excel file to read it
//
//        for (int i = 0; i < rowCount + 1; i++) {
//
//            Row row = sheet.getRow(i);
//
//
//            //Create a loop to print cell values in a row
//
//            for (int j = 0; j < row.getLastCellNum(); j++) {
//
//                //Print Excel data in console
//
//                if (row.getCell(j).getCellType() == org.apache.poi.ss.usermodel.CellType.STRING) {
//                    row.getCell(j).getStringCellValue();
//
//                } else if (row.getCell(j).getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC) {
//                    row.getCell(j).getNumericCellValue();
//                }
//
////                if(row.getCell(j).getNumericCellValue()==Number){
////
////                }
////
////
//            }
//
//
//        }
//
//    }
//
//}
