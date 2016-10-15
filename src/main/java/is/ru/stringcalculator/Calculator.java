package is.ru.stringcalculator;

public class Calculator {

	public static int add(String input){
		if(input.equals("")){
			return 0;
		}
		else if (input.contains(",")) {
			return sum(splitNumbersByComma(input));
		}
		else if (input.contains("\n")){
			return sum(splitNumbersByNewLine(input));
		}
		else{
			return convertToInt(input);
		}
	}

	private static int convertToInt(String number){
		return Integer.parseInt(number);
	}

	private static int sum(String[] numbers){
 		int total = 0;
    	for(String number : numbers){
			total = total + convertToInt(number);
		}
		return total;
	}

	private static String[] splitNumbersByComma(String numbers){
	    return numbers.split(",");
	}

	private static String[] splitNumbersByNewLine(String numbers){
	    return numbers.split("\n");
	}
}

