package perferctNumbers;

public class Main {

	public static void main(String[] args) {
		/*
		 *Perfect number finder
		 * Perfect Numbers are; 6-> 1 + 2 + 3 = 6 
		 * 28-> 1 + 2 + 4 + 7 + 14 = 28
		 */
		
		int number = -8;
		
		int total = 0;
		if (number <= 0) {
			System.out.println("0 veya da küçük bir sayı girdiniz. Mükkemmel sayı tanımına uymaz.");
			return;
		}
		
		for (int i = 1; i<number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		
		if (total == number) {
			System.out.println(number + " Mükkemmel sayıdır.");
		} else {
			System.out.println(number + " Mükkemmel sayı değildir.");
		}
	}

}
