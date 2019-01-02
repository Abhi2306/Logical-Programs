package Logic_Programs;

public class returnProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(killKthBit(37,3));

	}

	public static int killKthBit(int n, int k) {
		return calc(n, k);
	}
	
	public static int calc(int n, int k) {
		String x = "";
		int b;
		while (n > 0) {

			b = n % 2;
			x = b + "" + x;
			n = n / 2;
		}
		System.out.println(x);
	    int bits_bef = x.length() - (k + 1);
		if (x.charAt(x.length() - k) == '1') {
			x = x.substring(0, bits_bef + 1) + '0' + x.substring(bits_bef + 2);
		}
		System.out.println(x);
	    return Integer.parseInt(x, 2);
	}
}


