package automation;

import org.testng.annotations.Test;



public class Logintest extends Basepage{
	@Test
	public void verifyLoginWithValidCred () throws Exception

	{
	           Homepage p1 = new Homepage(driver);

	// Reading the data from excel file by the specified path

	            String xl = "E:\\TestData\\Book1.xlsx";

	            String Sheet = "Sheet1";

	            int rowCount = Excelutils.getRowCount(xl, Sheet);

	            for (int i=1;i<=rowCount;i++)

	            {

	                        String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
                               System.out.println("username---"+UserName);
	                        String Pwd=Excelutils.getCellValue(xl, Sheet, i, 1);
                             System.out.println("password---"+Pwd);
	                       
	                        p1.setvalues(UserName, Pwd);
                         //Submitting the data by clicking on login button                   
                             p1.clickLoginBtn();
	                        
	                        
	                        
	                        String expectedurl="https://www.instagram.com/accounts/login/?next=%2Faccounts%2Fpassword%2Freset%2Fconfirm%2F&source=desktop_nav";
	          			  String actualurl= driver.getCurrentUrl();
	          			  
	          			     if(actualurl.equals(expectedurl))
	          			     {
	          			    	System.out.println("pass");
	          			     }else
	          			     {
	          			    	System.out.println("fail");
	          			     }
	                         

	          			 
	            }
	 }

}
