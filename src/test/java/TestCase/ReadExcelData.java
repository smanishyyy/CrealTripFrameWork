package TestCase;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	List<HashMap<String, String>> ls = new ArrayList<>();
	public HashMap<String, String> currentRowMap;

	public static void main(String arg[]) throws Exception {
		// FileInputStream fin = new
		// FileInputStream("D://Software//CITS//TestData.xlsx");
		// System.out.println(fin);
		String xpath = "D://Software//CITS//TestData.xlsx";
		ReadExcelData rd = new ReadExcelData();
		rd.rdexcelData(xpath);

	}

	private void rdexcelData(String xpath) {
		try {
			FileInputStream fin = new FileInputStream("D://Software//CITS//TestData.xlsx");
			XSSFWorkbook xsf = new XSSFWorkbook(fin);
			XSSFSheet xsht = xsf.getSheet("Sheet1");
			Row hdr = xsht.getRow(0);
			System.out.println(hdr);

			System.out.println("Number of physical cells : " + hdr.getPhysicalNumberOfCells());
			for (int i = 1; i <= hdr.getPhysicalNumberOfCells(); i++) {
				Row currentRow = xsht.getRow(i);
				currentRowMap = new HashMap<>();
				for (int j = 0; j < currentRow.getLastCellNum(); j++) {
					System.out.println("row[" + i + "]" + "Col[" + j + "]");

					Cell currentCellval = currentRow.getCell(j);
					if (currentCellval == null) {
						currentRowMap.put(hdr.getCell(j).getStringCellValue(), " " + "\n");

					} else {
						switch (currentCellval.getCellType()) {
						case STRING:
							String c3 = currentCellval.getStringCellValue().toString();
							currentRowMap.put(hdr.getCell(j).getStringCellValue(), c3 + "\n");
							break;
						case NUMERIC:

							String c4 = NumberToTextConverter.toText(currentCellval.getNumericCellValue());
							currentRowMap.put(hdr.getCell(j).getStringCellValue(), c4 + "\n");
							break;
						case BOOLEAN:
							Boolean b = currentCellval.getBooleanCellValue();
							String c5 = b.toString();
							currentRowMap.put(hdr.getCell(j).getStringCellValue(), c5 + "\n");
							break;

						}

					}

				}

				ls.add(currentRowMap);
			}
			System.out.println("mmm: " + currentRowMap.entrySet());

		} catch (Exception e) {

		}

		System.out.println("Ls : " + ls.get(0));
		// Map mp = ls.get(0);
		for (HashMap<String, String> mt : ls) {
			for (Entry<String, String> entry : mt.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

		// xsf.close();
		//
		// fin.close();
	}
}
