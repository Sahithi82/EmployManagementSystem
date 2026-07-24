class ReverseAndSumArray
{
    public static void main(String args[])
    {
       
        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        // Print array elements in reverse order
        System.out.println("Array elements in reverse order:");
        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }


        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("\n\nSum of array elements = " + sum);
    }
}