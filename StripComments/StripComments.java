import java.util.HashMap;

public class StripComments {

	public static String trimWhiteSpaces(String input) {
		String result = input;
		int whiteSpaceCount = input.length();
		char[] inputCharArray = result.toCharArray();
		for (int index = input.length()-1; index >= 0; index--) {
			if (inputCharArray[index] == ' ' || inputCharArray[index] == '\n') {
				whiteSpaceCount--;
			}
			else {
				break;
			}
			
		}
		return result.substring(0, whiteSpaceCount);
	}

public static String stripComments(String text, String[] commentSymbols) {
		
    String result = "";
    boolean skip = false;

	HashMap<Character, Character> map = new HashMap<Character, Character>();
	for (String character: commentSymbols) {
		map.put(character.toCharArray()[0], character.toCharArray()[0]);
	}

    for (char character: text.toCharArray()) {
      if (skip == true && character != '\n') {
		  continue;
      }
	  skip = false;
	  char currentChar = character;
	  // If comment symbol.
	  if (map.containsKey(currentChar)) {
		  skip = true;
		  result = trimWhiteSpaces(result);
		  continue;
	  }

	  result += currentChar+"";
	
    }
	return trimWhiteSpaces(result);
}
	
	public static void main(String[] args) {
		StripComments sol = new StripComments();
		String ans = sol.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] {"#", "!"});
		System.out.println(ans);
	}
	
}
