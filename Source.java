class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
      while(head!=null){
          if(head.val.equals(target))
              return true;
          head = head.next;
      }
      return false;
    }
    
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(42);

// 42

        System.out.println(Source.linkedListFind(node1, 100)); // false
    }
  }