package com.ust.global.interview;

public class Test1 {
	public static void main(String[] args) {  
		  Integer i = new Integer(111);  
		  Integer j = new Integer(111); 
		  System.out.println(i.hashCode());
		  System.out.println(j.hashCode());
		  
		  if(i == j)  
		  {  
		    System.out.println("hello");  
		  }  
		  else   
		  {  
		    System.out.println("bye");  
		  }  
		  }
}
