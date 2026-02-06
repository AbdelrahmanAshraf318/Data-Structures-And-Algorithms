public class Queue<T>
{
    private Node<T> head;
    private Node<T> tail;
    private static int numOfElements;

    public Queue()
    {
        head = null;
        tail = null;
        numOfElements = 0;
    }
    
}
