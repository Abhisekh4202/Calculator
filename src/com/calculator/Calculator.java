package com.calculator;

public class Calculator {

	public static int add(String number){
		System.out.println("Inside the add");
		String seprator = ",";
		if(number.equals("")){
			return 0;
		}
		else{
			System.out.println("Inside the else");
			if(number.matches("//(.*)\n(.*)")){
				seprator = Character.toString(number.charAt(2));
				number = number.substring(4);
			}
		}
		String numList[] = splitNumbers(number, seprator + "|\n");
		return sum(numList);
	}
	
	private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}
	
	private static int sum(String[] numbers){
 	    int total = 0;
 	    String negString = "";

        for(String number : numbers){
        	if(toInt(number) < 0){
        		if(negString.equals(""))
        			negString = number;
        		else
        			negString += ("," + number);
        	}
        	if(toInt(number) < 1000)
		    	total += toInt(number);
		}

		if(!negString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negString);
		}

		return total;
    }
	
	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
}
