package co.simplon.algorythmes;

public class Converters {
	public static int[] stringToInts(String input) {
		String[] tokens = input.split(",");
		int[]result= new int[tokens.length];
		for (int i = 0;  i< tokens.length; i++) {
			String token= tokens[i];
			int converted = Integer.valueOf(token);
			result[i] = converted;
		}
		return result;
	};

}
