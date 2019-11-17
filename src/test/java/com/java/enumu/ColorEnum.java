package com.java.enumu;
//Every enum constant is always implicitly public static final. Since it is static, 
//we can access it by using enum Name. Since it is final, we can’t create child enums.
//We can declare main() method inside enum. Hence we can invoke enum directly from the 
//Command Prompt.
enum ColorEnum {
	 RED, GREEN, BLUE;
	public static void main(String arg[])
	{
		ColorEnum e1=ColorEnum.RED;
		System.out.println(e1);
	}
}
