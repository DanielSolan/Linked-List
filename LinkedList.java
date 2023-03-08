public class LinkedList {
  private Node head;
  private int numNodes;

  public LinkedList() {
    // creates an empty list
    head = null;
    numNodes = 0;
  }

  public LinkedList(int[] values) {
    head = new Node(values[0]); // assuming the array has at leat one element.
    numNodes = values.length;
    Node adding;
    Node current = head;
    for (int i = 1; i < values.length; i++) {
      adding = new Node(values[i]);
      current.setNext(adding);
      current = current.getNext();
    }
  }

  public void display() {
    // display each element on the same line in the console.
    Node current = head;
    while (current != null) {
      System.out.print(current.getValue() + ",");
      current = current.getNext();
    }
    System.out.println();
  }

  public void addNode(int v) {
    Node newNode = new Node(v);
    Node current = head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(newNode);
    numNodes++;

  }

  public void addFirst(int n) {
    Node newNode = new Node(n);
    Node current = head;
    head = newNode;
    numNodes++;
  }

  public int getSize(){
    return numNodes;
  }

  public void remove(int index){
    int counter = 0;
    Node current = head;
    while(counter<index){
      current = current.getNext();
    }
    current.setValue(null);
  }
}