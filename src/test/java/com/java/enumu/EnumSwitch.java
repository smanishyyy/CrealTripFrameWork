package com.java.enumu;
//Every enum constant represents an object of type enum.
//enum type can be passed as an argument to switch statement.
enum Day
{
	SUNDAY,MONDAY,TUESDAY, SATURDAY;
}
public class EnumSwitch {
Day day;
EnumSwitch(Day day)
{
	this.day=day;
}
public void dayIsLike()
{
	switch(day)
	{
	case MONDAY:
		System.out.println("Monday are bad");
		break;
	case TUESDAY:
		System.out.println("Tuesday are not so bad");
		break;	
	case SUNDAY:
	case SATURDAY:
		System.out.println("Monday are bad");
		break;
		default:
	
	            System.out.println("Midweek days are so-so."); 
	            break; 
	}
	

}
public static void main(String arg[])
{
	String str="SATURDAY";
	EnumSwitch en=new EnumSwitch(Day.valueOf(str));
	en.dayIsLike();
	
}
}
