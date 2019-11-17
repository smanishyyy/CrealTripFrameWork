package com.java.switchh;

public class SimpleSwitch {
public static void main(String arg[])
{
int day=2;
String dayString;
switch(day)
{
case 1:
	dayString="Sunday";
	break;
case 2: 
    dayString = "Tuesday"; 
    break; 
case 3: 
    dayString = "Wednesday"; 
    break; 
case 4: 
    dayString = "Thursday"; 
    break; 
case 5: 
    dayString = "Friday"; 
    break; 
case 6: 
    dayString = "Saturday"; 
    break; 
case 7: 
    dayString = "Sunday"; 
    break; 
default: 
    dayString = "Invalid day"; 
    break; 
}
System.out.println(dayString); 
}
}
