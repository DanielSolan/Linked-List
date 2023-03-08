public class Node {
  private int value;
  private Node next;

  public Node(int v) {
    value = v;
    next = null;
  }

  public void remove(){
    value = null;
  }

  public Node getNext() {
    return next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int val) {
    value = val;
  }

  public void setNext(Node n) {
    next = n;
  }

  public void display() {
    System.out.println(value);
  }
}