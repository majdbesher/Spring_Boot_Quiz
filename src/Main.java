public class Main {
    // The Code of the Driver
    public static void main(String[] args)
    {
        int[] array = { 5,10,7,22,-3,4,-14,3,15 };
        int expectedSum = 1;
        checkSum(array, expectedSum);
    }

    static void checkSum(int[] arr, int expectedSum)
    {
        //first number
        for (int i = 0; i < arr.length; i++)
        {
            //second number
            for(int j = 0; j < arr.length; j++)
            {
               if(arr[i] + arr[j] == expectedSum) {
                   System.out.println("the array index of the two numbers whose sum equals the expected sum are: " + i + "," + j);
                   return;
               }
            }
        }
        System.out.println("there are no two numbers whose sum equals the expected sum");
    }
}
