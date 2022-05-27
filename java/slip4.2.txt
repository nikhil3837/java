/*Write a program to implement simple arithmetic calculator. And Performed the appropriate 
validations.
Create a MOBILE table with fields Model_Number, Model_Name, Model_Color, 
Sim_Type, NetworkType, BatteryCapacity, InternalStorage, RAM and ProcessorType. 
Insert values in the table. Write a menu driven program to pass the input using Command 
line argument to perform the following operations on MOBILE table. 
1. Insert 2. Modify 3. Delete 4. Search 5. View All 6. Exit*/

import java.util.*;
import java.sql.*;
public class mobile_all 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/rbnb","postgres","root");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			int ch;
			boolean k;
			do
			{
				System.out.println("1-Insert\n2-Modify\n3-Delete\n4-Search\n5-View All\n6-Exit");
				System.out.println("Enter the choice:");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:System.out.println("Enter the ModelNumber:");
						   String mn=sc.next();
						   System.out.println("Enter the ModelName:");
						   String mname=sc.next();
						   System.out.println("Enter the ModelColor:");
						   String mcolor=sc.next();
						   System.out.println("Enter the SimType:");
						   String simtype=sc.next();
						   System.out.println("Enter the NetworkType:");
						   String ntype=sc.next();
						   System.out.println("Enter the BatteryCapacity:");
						   String battery=sc.next();
						   System.out.println("Enter the InternalStorage:");
						   String intstore=sc.next();
						   System.out.println("Enter the RAM:");
						   String ram=sc.next();
						   System.out.println("Enter the ProcessorType:");
						   String processor=sc.next();
						   k=st.execute("insert into mobile values('"+mn+"','"+mname+"','"+mcolor+"','"+simtype+"','"+ntype+"','"+battery+"','"+intstore+"','"+ram+"','"+processor+"')");
						   if(k==true)
							   System.out.println("Record Not Inserted");
						   else
							   System.out.println("Record Inserted");
						   break;
					
					case 2:System.out.println("Enter the ModelNumber:");
					       mn=sc.next();
						   System.out.println("Enter the RAM:");
						   String newram=sc.next();
						   st.executeUpdate("update mobile set ram='"+newram+"' where modelnumber='"+mn+"'");
						   break;
	
					case 3:System.out.println("Enter the ModelNumber:");
						   mn=sc.next();
						   st.executeUpdate("delete from mobile where modelnumber='"+mn+"'");
					       break;
					
					case 4:System.out.println("Enter the ModelNumber:");
				           mn=sc.next();
					       ResultSet rs=st.executeQuery("select * from mobile where modelnumber='"+mn+"'");
					       if(rs.next())
					       {
					    	   System.out.println("Record Found");
					    	   System.out.println("Model Number:"+rs.getString(1));
					    	   System.out.println("Model Name:"+rs.getString(2));
					    	   System.out.println("Model Color:"+rs.getString(3));
					    	   System.out.println("SimType:"+rs.getString(4));
					    	   System.out.println("NetworkType:"+rs.getString(5));
					    	   System.out.println("Battery:"+rs.getString(6));
					    	   System.out.println("Internal Storage:"+rs.getString(7));
					    	   System.out.println("RAM:"+rs.getString(8));
					    	   System.out.println("ProcessorType:"+rs.getString(9));
					       }
					       else
					    	   System.out.println("Record Not Found");
					       break;
					
					case 5:rs=st.executeQuery("select * from mobile");
				       	   while(rs.next())
				       	   {
				       		   System.out.println("Model Number:"+rs.getString(1));
				       		   System.out.println("Model Name:"+rs.getString(2));
				       		   System.out.println("Model Color:"+rs.getString(3));
				       		   System.out.println("SimType:"+rs.getString(4));
				       		   System.out.println("NetworkType:"+rs.getString(5));
				       		   System.out.println("Battery:"+rs.getString(6));
				       		   System.out.println("Internal Storage:"+rs.getString(7));
				       		   System.out.println("RAM:"+rs.getString(8));
				       		   System.out.println("ProcessorType:"+rs.getString(9));
				       	   }
				       	   break;
					case 6:System.exit(0);
						   break;
				}
			}while(ch<7);
		}
		catch(Exception e)
		{
			System.out.println("ERROR:"+e);
		}
	}
}
