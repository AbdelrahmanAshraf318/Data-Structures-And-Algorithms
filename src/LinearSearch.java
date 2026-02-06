public class LinearSearch
{
    private int element;
    private int[] arr;

    public LinearSearch(int element, int[] arr)
    {
        this.element = element;
        this.arr = arr;
    }

    public int searchForElement(int searchingElement)
    {
        for(int i=0; i<this.arr.length; i++)
        {
            if(this.arr[i] == searchingElement)
                return i;
        }
        return -1;
    }
}
