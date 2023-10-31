package Generic_Script;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericReadExcel {
	public static String fetchData(String sheet,int row,int cell)
	{
		String value="";
		try
		{
			FileInputStream f=new FileInputStream("C:\\Users\\venug\\OneDrive\\Desktop\\testdata.xlsx");
			workbookfactory
			Sheet sh = book.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(cell);
			value=c.toString();
		}
		catch (Exception e) 
		{
			System.out.println("Unable to open");
		}
		return value;
	}
}
