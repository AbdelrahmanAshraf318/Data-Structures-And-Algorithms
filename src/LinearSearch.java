public class LinearSearch
{
    private int[] arr;

    public LinearSearch(int[] arr)
    {
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
