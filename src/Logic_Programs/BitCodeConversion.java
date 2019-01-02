package Logic_Programs;

public class BitCodeConversion {

	public static void main(String[] args) {

		System.out.println(BitCodeConversion.killKthBit(37, 3));
		int[] a = new int[] { 23, 45, 39 };
		System.out.println(BitCodeConversion.arrayPacking(a));
		System.out.println(BitCodeConversion.rangeBitCount(2, 7));
	}

	static int killKthBit(int n, int k) {

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

	static int arrayPacking(int[] a) {

		int b, c, d;
		String x = "";
		for (int i = 0; i < a.length; i++) {

			b = a[i];
			//System.out.println("b : " + b);
			while (b > 0) {
				c = b % 2;
				x = c + "" + x;
				b = b / 2;
			}

			d = (8*(i+1)) - x.length();

			if (d > 0) {
				for (int j = 0; j < d; j++) {
					x = '0' + x;
				}
			}
			//System.out.println("x : " + x);
		}
		return Integer.parseInt(x, 2);
	}
	
	static int rangeBitCount(int a, int b) {
		
		int c, e=0;
	    int d[] = new int[Math.abs(b-a)+1];
	    String x = "";
	    
	    System.out.println(d.length);
	    
	    for(int i=0; i<=Math.abs(b-a)+1; i++){
	    
	    	int count=0; 
	        System.out.println(i+" : "+a+" : "+b);
	    	while(a > 0){
	          c = (a+i)%2;
	            if(c == 1){
	                count++;
	            }
	          x = c + "" + x;
	          a = (a+i)/2;
	        }
	        d[e] = count;
	        e++;
	        System.out.println(e+" : "+count);
	    }
	    
	    //for(int i=0;i<d.length;i++) {
	    	//System.out.println(d[i]);
	    //}
	    
		return 0;
	}

}
