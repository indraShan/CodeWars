public class Kata {
  
  public static String stringify(Node list, String result) {
	  if (list == null) {
		  return result+" null"; 
	  }
	  return stringify(list.getNext(), (result.length() == 0? "": result+" ")+list.getData()+" ->");
  }
  
  public static String stringify(Node list) {
      if (list == null) {
        return "null";
      }
      return stringify(list, "");
  }
	
  public static void main(String[] args) {
	  Node root = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4)))));
  	  String result = Kata.stringify(root);
	  System.out.println(result);
  }

}

class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}