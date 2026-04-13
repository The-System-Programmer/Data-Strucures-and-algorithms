class sort
{
    // Display method
    void dis(int[] arr)
    {
        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    // Algorithm method
    void algo(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            int lowestidx = i;
            for (int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[j]<arr[lowestidx])
                {
                    lowestidx = j;
                }
            }
            if (lowestidx != i)
            {
                int temp = arr[i];
                arr[i] = arr[lowestidx];
                arr[lowestidx] = temp;
            }
        }
    }
}

class SelectionSort
{
    public static void main(String args[])
    {
        int[] arr = {45,32,52,21,34,40,65};
        sort s1 = new sort();
        s1.algo(arr);
        s1.dis(arr);
    }
}
