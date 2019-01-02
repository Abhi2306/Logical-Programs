package Logic_Programs;

public class NewNumeralSystem {

	public static void main(String[] args) {
		
		String b[] = NewNumeralSystem.newNumeralSys('z');
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+", ");
		}
	}
	
	public static String[] newNumeralSys(char Number) {
		
		int ascii_number = Number;
		int ascii_number_A = 'a';
		int Loop_Iteration_Count = ascii_number - ascii_number_A;
		String a[] = new String[Loop_Iteration_Count/2];
		
		for(int i=0;i<Loop_Iteration_Count/2;i++) {

			a[i] = (char)(ascii_number_A+i)+" + "+(char)(ascii_number-i);
		}
		
		System.out.println(18/5);
		
		//System.out.println((char)ascii_number_A);
		//System.out.println(Loop_Iteration_Count);
		//System.out.println("ascii number of "+Number+" is :"+ascii_number);
		//System.out.println("ascii number of A is :"+ascii_number_A);
		
		return a;
	} 

}
