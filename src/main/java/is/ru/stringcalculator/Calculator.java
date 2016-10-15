package is.ru.stringcalculator;

public class Calculator {

	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else{
			return convertToInt(input);
		}
	}

	private static int convertToInt(String number){
	return Integer.parseInt(number);

	}
}

