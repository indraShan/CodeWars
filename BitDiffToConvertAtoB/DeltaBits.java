public class DeltaBits {
    public static int convertBits(int a, int b) {
      // XOR a and b.
	  // This will produce a number where only the diff of the two numbers would be set.
	  int diff = a ^ b;
	  
	  // Count the set bits in this number - because thats exactly the difference between a and b.
	  int count = 0;
	  while (diff != 0) {
		  count++;
		  diff = diff & (diff - 1);
	  }
	  
	  return count;
    }
	
	public static void main(String[] args) {
		DeltaBits delta = new DeltaBits();
		int ans = delta.convertBits(10, 20);
		System.out.println(ans);
	}
}