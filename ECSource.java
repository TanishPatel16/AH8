//class Node<T> {
//  T val;
//  Node<T> next;
//
//  public Node(T val) {
//    this.val = val;
//    this.next = null;
//  }
//}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it
    int cnt=0;
    while(head!=null){
      if(cnt==index){
        return (T) head.val;
      }
      head = head.next;
      cnt++;
    }
    return (T) "null";
  }
  
  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

// a -> b -> c -> d

    System.out.println(ECSource.getNodeValue(a, 2)); // null
  }
}