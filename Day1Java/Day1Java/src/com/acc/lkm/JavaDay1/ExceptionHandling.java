package com.acc.lkm.JavaDay1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] member = new int[5];
		try {
		int[] member = {3,4,9,6,8};
		System.out.println(member[5]);
		String str=null;
		System.out.println(str.length());
		String st = "abc";
		int b = Integer.parseInt(st);}
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exp");
		}
		catch(Exception ex) {
			System.out.println("Exception handled");
		}
		
		
		
		
	}

}
