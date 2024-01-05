package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DataProviders 
{
    @DataProvider(name="data")
	public String[][] datas() throws IOException
	{
		String path="./ExcelDatas/Advertiserdata.xlsx";
		
		Xlxutility utility=new Xlxutility(path);
		
		int rowCount=utility.getRowCount("Sheet1");
		int cellCount=utility.getCellCount("Sheet1", 1);
		
	    String alldata[][] = new String[rowCount][cellCount];
	     
	    for(int i=1;i<=rowCount;i++)
	    {
	    	for(int j=0;j<cellCount;j++)
	    	{
	    		alldata[i-1][j]=utility.getCellData("Sheet1", i, j);
	    	}
	    }
	    
	    return alldata;
	}
	
	
}
