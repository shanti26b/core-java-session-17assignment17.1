package assignment;    // here i am creating package name assignment

import java.io.Serializable;

public class EmployeeName implements Serializable  {
	
	
public String firstName;  //taken the variable as string type of first name 
	
	
	public String lastName; // taken the variable as string type of second name
	

	private static final long serialVersionUID = 5462223600l; //taken the serialversionUID 

	//a private member is only accessible within the same class as it is declared
	   //static is used for memory management
	   //final is used in several different contexts to define an entity that can only be assigned once
	   //long is used to store 64 bit integer/ it reserved words which have specified meaning relevant to a complier
	   //serialVersionUID is a static final field.We can assign any number of our choice to it. This is must in serialization

}
