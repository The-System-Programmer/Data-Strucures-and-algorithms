class SequentialSearch
{
    public static void main(String args[])
    {
        int[] arr = {23,43,12,53,56,74,29};
        int target = 53;

        Search s1 = new Search();
        int result = s1.Seq(arr, target);

        if (result != -1)
        {
            System.out.println("Found at index: " + result);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}

class Search
{
    int Seq(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
