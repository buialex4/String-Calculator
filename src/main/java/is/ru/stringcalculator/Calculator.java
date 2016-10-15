package is.ru.stringcalculator;

public class Calculator {

	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else if (input.contains(",") || (input.contains("\n"))) {
			return sum(splitNumbers(input));
		}
		else{
			return convertToInt(input);
		}
	}

	private static int convertToInt(String number){
		int finalnumber = Integer.parseInt(number);
		finalnumber = checkNumberIfTooLarge(finalnumber);
		return finalnumber;
	}

	private static int sum(String[] numbers){
 		int total = 0;
    	for(String number : numbers){
			total = total + convertToInt(number);
		}
		return total;
	}

	private static String[] splitNumbers(String numbers){

	    return numbers.split(",|\n");
	}

	private static int checkNumberIfTooLarge(int number){
		if (number > 1000){
			number = 0;
		}
		return number;
	}
}

