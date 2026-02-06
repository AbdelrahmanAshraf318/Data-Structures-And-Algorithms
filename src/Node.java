public class Node<T>
{
     private T value;
     private Node<T> next;


     public Node()
     {

     }

     public Node(T value, Node<T> node)
     {
          this.value = value;
          this.next = node;
     }

     public T getValue()
     {
          return value;
     }

     public void setValue(T value)
     {
          this.value = value;
     }

     public Node<T> getNext()
     {
          return next;
     }

     public void setNext(Node<T> node)
     {
          this.next = node;
     }
}
