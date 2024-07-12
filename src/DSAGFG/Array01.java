

package DSAGFG;
public class Array01 {
    public static void main(String args[])
    {
        //declare an Array of Integer

        int[] arr;

        //Allocating memory for 5 Integer
        arr = new int[5];

        // Initialize the 1st element of the array
        arr[0]=10;

        // Initialize the 2nd element of the array
        arr[1]=20;

        //so on...

        arr[2] = 30;

        arr[3] = 40;
        arr[4] = 50;

        // accessing  the element of the specified array

        for(int i=0; i<arr.length ; i++)
            System.out.println("Element at index " + i + ":" + arr[i]);
    }

}
