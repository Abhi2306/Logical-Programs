package Logic_Programs;

public class ConstructArray {

	public static void main(String[] args) {
		
		int b[] = ConstructArray.constructArray_1(7);
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		
	}
	
	public static int[] constructArray_1(int size) {
		
		int a[] = new int[size];
		int count = 0, count_1=1;
		
	    for(int i=1;i<=size;i++){
	        
	        if(i==1) {
	        	a[i-1] = i;
	        } 
	        if(i%2==0) {
	        	a[i-1] = (size-count);
	        	++count;
	        }else if(i%2==1 & i!=1) {
	        	a[i-1] = (i-count_1);
	        	++count_1;
	        }
	    }
		return a;
	}

}
