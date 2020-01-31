package com.java.interview;

public class Student8 {
	 int rollno;  
	   String name;  
	   static String college ="ITS";  
	     
	   Student8(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	 public static void main(String args[]){  
	 Student8 s1 = new Student8(111,"Karan");  
	 Student8 s2 = new Student8(222,"Aryan");  
	   
	 s1.display();  
	 s2.display(); 
	Student8.changeValue("Mn");
	Student8.college="jj";
	 s2.display(); 
	 s1.display();
	 s1.changeValue2();
	 }
	private static void changeValue(String i) {
	
		college=i;	
		changeValue3(college);
	
	}
	private  void changeValue2() {
		
		this.display();	
	
	}
private static void changeValue3(String college2) {
		
		
	
	}
}
