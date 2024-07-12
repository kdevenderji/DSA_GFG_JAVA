package DSAGFG;
import java.util.*;

public class Array07secLarNaive {
    // Function to Print the 2nd Largest Element
    static void print2largest(int arr[], int arr_size)
    {
        int i, first, second;

        // There should be at least two elements

        if(arr_size<2)
        {
            System.out.printf("Invalid input ");
            return;
        }
        //sort the array
        Arrays.sort(arr);
        // Start form second last element as the largest element is at last
        for(i=arr_size -2; i>=0; i--)
        {
            //if the element is not equal to Largest  element
            if(arr[i]!=arr[arr_size-1])
            {
                System.out.printf(" The second Largest " + " Element is %d \n", arr[i]);
                return;
            }
        }
        System.out.printf(" There is no second" + " Largest element \n");

    }
     public static void main (String [] args){
        int arr[]={12, 35, 1, 10, 34, 1 };
        int n= arr.length;
        print2largest(arr,n);
     }
}
