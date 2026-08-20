package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

    //DataProvider 1
    @DataProvider(name="LoginData")
    public String [][] getData() throws IOException
    {
        String path=".\\testData\\Opencart_LoginData.xlsx"; //taking xl file from testData

        ExcelUtility xlutil=new ExcelUtility(path); //creating an object for XLUtility

        int totalrows=xlutil.getRowCount("Sheet1");
        int totalcols=xlutil.getCellCount("Sheet1",1);

        String logindata[][]=new String[totalrows][totalcols]; //created for two dimension array which can store data

        for(int i=1;i<=totalrows;i++) //1  //read the data from xl storing in two dimensional array
        {
            for(int j=0;j<totalcols;j++) //0  i is rows j is col
            {
                logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j); //1,0
            }
        }
        return logindata; //returning two dimension array
    }
    
    //DataProvider 2
    @DataProvider(name="SearchProductData")
    public String[][] getData2() throws IOException 
    {
    	
    	String path = ".\\testData\\OpenCart_SearchProductData.xlsx";
    	
    	ExcelUtility xlutil=new ExcelUtility(path);
    	
    	int totalrows=xlutil.getRowCount("Sheet1");
    	int totalcols=xlutil.getCellCount("Sheet1",1);
    	
    	String searchproddata[][]= new String[totalrows][totalcols];
    	
    	for(int i=1; i<=totalrows; i++) {
    		
    		searchproddata[i-1][0]= xlutil.getCellData("Sheet1",i, 0);
       	}
    	
    	return searchproddata;
    	
    }
    
   
    
    /*
    //DataProvider 3
    @DataProvider(name="SearchLoginData")
    public String[][] getData3() throws IOException 
    {
    	
    	String path = ".\\testData\\OpenCart_SearchLoginData.xlsx";
    	
    	ExcelUtility xlutil=new ExcelUtility(path);
    	
    	int totalrows=xlutil.getRowCount("Sheet1");
    	int totalcols=xlutil.getCellCount("Sheet1",1);
    	
    	String searchlogindata[][]= new String[totalrows][totalcols];
    	
    	for(int i=1; i<=totalrows; i++) {
    		for(int j=0; j<totalcols; j++) {
    			searchlogindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);
    		}
       	}
    	
    	return searchlogindata;
*/
}
   
