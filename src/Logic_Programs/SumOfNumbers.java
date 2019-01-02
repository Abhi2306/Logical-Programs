package Logic_Programs;

public class SumOfNumbers {

	public static void main(String[] args) {

		System.out.println(SumOfNumbers.TicketNumber(2020));
	}

	public static boolean TicketNumber(int Number) {

		int count = 0, temp = 0, temp1 = 0;
		boolean result = false;
		String s = Integer.toString(Number);

		while (Number != 0) {

			Number = Number / 10;
			count++;
		}

		if (count % 2 == 0) {

			for (int i = 0; i < count / 2; i++) {
				System.out.println(s.charAt(i));
				temp = temp + s.charAt(i);
			}
			System.out.println(temp);

			for (int j = count - 1; j >= count / 2; j--) {
				System.out.println(s.charAt(j));
				temp1 = temp1 + s.charAt(j);
			}
			System.out.println(temp1);

			if (temp == temp1) {
				result = true;
			}
			
		} else {
			result = false;
		}

		return result;
	}
}
