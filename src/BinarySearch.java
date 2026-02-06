public class BinarySearch
{
    /** Must be sorted array **/
    private int [] arr;

    public BinarySearch(int[] arr)
    {
        this.arr = arr;
    }

    public int search(int element)
    {
        return searchHelper(0, this.arr.length-1, element);
    }

    private int searchHelper(int i, int j, int element)
    {
        if(i > j)
            return -1;

        int mid = i + (j - i) / 2;
        if(this.arr[mid] == element)
            return mid;

        if(element > this.arr[mid])
            return searchHelper(mid + 1, j, element);
        else
            return searchHelper(i, mid - 1, element);
    }

}
