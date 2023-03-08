class Main {
  public static void main(String[] args) {
    Node myNode = new Node(13);
    myNode.display();
    int[] data = { 13, 7, 19, 68, 8 };
    LinkedList myList = new LinkedList(data);
    myList.display();
    myList.addNode(99);
    myList.display();
    //myList.addFirst(11);
    //myList.display();
    System.out.println("Size = " + myList.getSize());
  }
}