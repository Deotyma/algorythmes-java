package co.simplon.algorythmes;

//import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		
		String input = args[0];
		int[] numbers = Converters.stringToInts(input);
		//System.out.println(Arrays.toString(numbers));
		//int sum = Arrays.stream(numbers).sum();
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
	}
}
