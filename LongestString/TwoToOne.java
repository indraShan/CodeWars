import java.util.Arrays;
import java.util.HashMap;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        
        int first = 0;
        int second = 0;
        String result = "";
        int[] accountedChars = new int[27];
        while(first < ch1.length || second < ch2.length) {
          char currentChar;
		  if (first < ch1.length && second < ch2.length) {
		  	currentChar = ch1[first] > ch2[second] ? ch2[second] : ch1[first];
		  }
		  else if (first < ch1.length) {
		  	currentChar = ch1[first];
		  }
		  else {
		  	currentChar = ch2[second];
		  }
		  
          if (first < ch1.length && currentChar == ch1[first]) {
            first++;
          }
          else {
            second++;
          }
          if (accountedChars[currentChar - 'a'] != 0) {
            continue;
          }
          accountedChars[currentChar - 'a'] = 1;
          result += currentChar;
        }
		
		
		
        return result;
    }
	
	public static void main(String[] args) {
		TwoToOne object = new TwoToOne();
		String ans = object.longest("inmanylanguages", "theresapairoffunctions");
		System.out.println(ans);
	}
}