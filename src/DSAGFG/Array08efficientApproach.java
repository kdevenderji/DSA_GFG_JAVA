package DSAGFG;
import java.io.*;


public class Array08efficientApproach {
    // Function to print the nd Largest element
    static void print2largest( int arr[], int arr_size)
    {
        int i, first, second;
        // there should be at least 2 element;
        //if not it is invalid

        if(arr_size<2)
        {
            System.out.println(" Invalid Input ");
            return;

        }
        int largest = second = Integer.MIN_VALUE;

        //  Find the largest element
        for(i=0; i<arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        
    }
}
