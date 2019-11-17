package com.java.string;

public class StrngBfrStrngBldrPer {
	public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println("String buffer: "+sb);
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
       long startTime2 = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("String builder: "+sb2);
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime2) + "ms");  
    }  
}
