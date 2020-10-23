package com.calculator;
import java.util.Scanner;


public class StringCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		Calculator c = new Calculator();
		int result  = c.add(a);
		System.out.println(result); 
		
		

	}

}
