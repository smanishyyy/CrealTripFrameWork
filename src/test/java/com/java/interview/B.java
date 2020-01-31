package com.java.interview;

public class B extends A {
	public static final int b;
public static final int a;
public final int n;
public Integer a2;
	B()
	{
		n=90;
	}
	 public void run(int a)
	 {
		 System.out.println("running safely with 100kmph");
		
		 }  
	 
	 public static void runM()
	 {
		 System.out.println("complile22");
		
		 }  
	 public  float runMM()
	 {
		 float a=10;
		 System.out.println("complile2244");
		return  a;
		 } 
	 static 
	 {
		 b=10;
		
		 a=20;
		
	 }
     
	   public static  void main(String args[]){  
	
		
		  
		  
	   A honda= new B(); 
	   A honda2= new A(); 
	   System.out.println();
	   honda.run(1);  
	   honda.runM();
	   honda.runMM();
	

	   
	   B b=(B)honda;
	  
	   System.out.println(honda instanceof  A );
	   System.out.println(honda instanceof  B);
	   System.out.println(honda instanceof  C);
	   System.out.println(honda2 instanceof  B);
	   b.runM();
	   }  

}
