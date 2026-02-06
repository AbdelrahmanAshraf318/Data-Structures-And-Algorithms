import java.util.Objects;

public class Stack<T>
{
    private Node<T> head;
    private Node<T> tail;
    private static int numOfElements;

    public Stack()
    {
        head = null;
        tail = null;
        numOfElements = 0;
    }

    public void push(T element)
    {
        Node<T> temp = new Node<>(element, head);
        head = temp;

        if (tail == null) {
            tail = head;
        }

        numOfElements++;
    }

    public T pop()
    {
        if(head == null)
            throw new RuntimeException("Stack is Empty");
        T value = head.getValue();
        head = head.getNext();
        numOfElements--;
        if(head==null)
            tail = null;

        return value;
    }
}
