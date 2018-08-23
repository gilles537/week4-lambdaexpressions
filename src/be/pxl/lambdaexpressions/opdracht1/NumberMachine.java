package be.pxl.lambdaexpressions.opdracht1;

import java.util.ArrayList;
import java.util.function.Function;

public class NumberMachine {
	private ArrayList<Integer> numbers = new ArrayList<>();
	
	public NumberMachine(int[] numbers) {
		for(int i=0;i<numbers.length;i++)
			this.numbers.add(numbers[i]);
	}
	
	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				result += numbers.get(i);
				if (i != numbers.size()-1 ) {
					result += "-";
				}
			}
		}
		return result;
	}
	
	public String covertNumbers(Function<Integer,String> converter) {
		String result = "";
		for (int i=0;i<numbers.size();i++) {
			result += converter.apply(numbers.get(i));
			if (i != numbers.size()-1 ) {
				result += "-";
			}
		}
		return result;
	}
	
}
