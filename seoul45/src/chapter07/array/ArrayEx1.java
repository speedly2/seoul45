package chapter07.array;

public class ArrayEx1 {

	public static void main(String[] args) {
		String pop = "Yesterday all my troubles seemed so far away" +
				"Now it looks as though they're here to stay" +
				"Oh, I believe in yesterday" +
				"Suddenly I'm not half the man I used to be";
		pop = pop.toLowerCase();
		int[] alpha = new int[26];
		
		for (int i = 0; i < pop.length(); i++) {
			char ch = pop.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				alpha[ch - 'a']++;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			char ch = (char)(i + 'a');
			System.out.println(ch + ":" + alpha[i]);
		}

	}

}
