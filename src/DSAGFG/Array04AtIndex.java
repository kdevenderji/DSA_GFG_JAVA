package DSAGFG;
import java.io.*;
import java.util.*;


public class Array04AtIndex {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int sizeOfArray = sc.nextInt();
            int arr[] = new int[sizeOfArray];
            for(int i=0; i<sizeOfArray-1; i++)
            {
                int x;
                x=sc.nextInt();
                arr[i]=x;

            }
            int index = sc.nextInt();
            int element = sc.nextInt();
            solution obj = new solution();
            obj.insertAtIndex(arr,sizeOfArray, index, element);
            for (int i=0; i<sizeOfArray; i++)
            {
                System.out.print(arr[i]+ " ");

            }
            System.out.println();
        }
     sc.close();
    }
}
class solution {
    public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }
}