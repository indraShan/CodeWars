import java.text.DecimalFormat;
public class Suite {
	private static long[] factTable;
	

	public static double factorial(int n) {
    	for (int index = 2; index <= n; index++) {
      	  factTable[index] = index * factTable[index - 1];
    	}
		return factTable[n];
  }
  
  public static double going(double fraction, int n, int index) {
	  if (n == index) {
		  return 1;
	  }
	  return (fraction * factTable[index]) + going(fraction, n, index+1);
  }
  
	public static double going(int n) {
    	long[] fact = new long[n+1];
    	fact[0] = 1;
    	fact[1] = 1;
		factTable = fact;
		
		double factorial = factorial(n);
		double fraction = 1/factorial;
		
		
		return Math.floor(going(fraction, n, 1) * 1000000) / 1000000;
	}
	
	public static void main(String[] args) {
		double ans = Suite.going(7);
		System.out.println(ans);
	}
}