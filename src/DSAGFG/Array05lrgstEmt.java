package DSAGFG;
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;


public class Array05lrgstEmt {
    static int getLargest(int arr [] , int n)
    {
        for (int i=0; i<n; ++i){
            boolean flag= true ;
            for(int j=i; j<n; ++j){
                if(arr[j]>arr[i]) {
                    flag = false;
                    break;


                }
            }
                  if(flag==true){
                return arr[i];
                 }

        }return -1;





}
public static void main (String [ ] args) throws IOException{
    int arr[]= {5,8,20,15};
    System.out.println("Largest in given array is "+getLargest(arr, 4));
}
}