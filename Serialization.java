package assignment;  // here i am showing package name as assignment


import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectOutputStream;

public class Serialization {  // creating a class name as serialization
	
public static void main (String[]args){ //creating the main method 
		
		EmployeeName employee = new EmployeeName();  
		
		employee.firstName  = "Bujji"; //assigning the  employee first name
		
		employee.lastName = "Komali";    //and second name
		
		    try {
		    	
		    	   /*the code is prone to exceptions is placed in the try block
		    	 *when exception occurs that exception occurred is handled by the 
		    	 *catch block associated with it
		    	 */
		      
FileOutputStream fileOut = new FileOutputStream("D:/employee.txt");   //creating an object of fileOut and assigning the path of text file
		      
		     
		      ObjectOutputStream out = new ObjectOutputStream(fileOut);
		      
		      out.writeObject(employee);  //here we are passing the object of the employee
		      
		      out.close();   //here closing the object output stream
		     
		      fileOut.close();  // and here file of output stream
		      
 System.out.println("Serialized data is saved in D:/employee.txt file");//gives the output as the  serialization file saved successfully
		      
		     
 System.out.println("First Name:"+employee.firstName);  //gives the output as the  serialization file saved successfully
                                                        //displays the second name of the employee  
			  
 System.out.println("Last Name:"+employee.lastName);
		      
		    }
		    catch (IOException i) 
		    {
		      i.printStackTrace();   //prints stack trace for this throwable object
		    }
		  }
		}
 

