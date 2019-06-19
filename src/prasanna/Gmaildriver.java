package prasanna;

import java.io.File;
import java.lang.reflect.Method;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Gmaildriver 
{
	public static void main(String[] args) throws Exception
	{
		//Create collection object to Methods class
		GmailMethods gm=new GmailMethods();
		Method m[]=gm.getClass().getMethods();
		//Open excel file for read and write
		File f=new File("gmailexcel.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh1=rwb.getSheet(0);//Scenarios
		int nos=rsh1.getRows();
		Sheet rsh2=rwb.getSheet(1);//cases
		int noc=rsh2.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f, rwb);
		WritableSheet wsh2=wwb.getSheet(1);
		//Keyword driven from 1st(2nd row)
		//to last scenario
		for(int i=1; i<nos; i++)
		{
			String tid=rsh1.getCell(0, i).getContents();
			String mode=rsh1.getCell(2, i).getContents();
			if(mode.equalsIgnoreCase("yes"))
			{
				//Keyword driven from 1st(2nd row)
				//to last case of scenario
				for(int j=1; j<noc; j++)
				{
					String sid=rsh2.getCell(0, i).getContents();
					if(tid.equalsIgnoreCase(sid))
					{
						String mn=rsh2.getCell(2, j).getContents();
						String l=rsh2.getCell(3, j).getContents();
						String d=rsh2.getCell(4, j).getContents();
						String c=rsh2.getCell(5, j).getContents();
						System.out.println(mn+" "+l+" "+d+" "+c);
						for(int k=0; k<m.length; k++)
						{
							if(mn.equals(m[k].getName()))
							{
								String res=(String)m[k].invoke(gm, l, d, c);
								Label la=new Label(6, j, res);
								wsh2.addCell(la);
							}
						}
					}
				}
			}
		}
		wwb.write();//Save changes in excel file
		wwb.close();
		rwb.close();
	}
}
