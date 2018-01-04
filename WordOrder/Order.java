import java.util.ArrayList;
public class Order {
  public static int wordPosition(String word) {
	  int number = 0;
	  for (char character: word.toCharArray()) {
		  number = (int)(character - '0');
		  if (number >= 1 && number <= 10) {
		  	  break;
		  }
	  }
	  return number-1;
  }	
  public static String order(String words) {
	  if (words.length() == 0) {
		  return words;
	  }
	  String[] result = new String[9];
	  
	  String currentWord = "";
	  for (char character: words.toCharArray()) {
		  if (character != ' ') {
		  	currentWord += character+""; 
			continue;
		  }
		  int position = wordPosition(currentWord);
		  result[position] = currentWord;
		  currentWord = "";
	  }
	  if (currentWord.length() != 0){
		  int position = wordPosition(currentWord);
		  result[position] = currentWord;
	  }

	  
	  String resultStirng = "";
	  for (int counter = 0; counter < result.length; counter++) {
		  String word = result[counter];
		  if (word == null) {
			  continue;
		  }
		  if (counter != 0) {
		  	word = " "+word;
		  }
		  resultStirng += word;
	  }
	  return resultStirng;
  }
  public static void main(String[] args) {
  	Order order = new Order();
	String result = order.order("is2 Thi1s T4est 3a");
	
	System.out.println("result = "+result);
	
  }
}