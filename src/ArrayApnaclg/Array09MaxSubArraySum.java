package ArrayApnaclg;
import java.util.*;
public class Array09MaxSubArraySum {
    public static void maxSubArraySum(int number[]){
        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;
        for (int i= 0; i<number.length; i++){
            int start = i;
            for(int j=1; j<number.length; j++)
            {
                int end = j;
                currSum=0;
                for (int k=start; k<=end; k++)
                {
                    //print subarray number
                    currSum += number[k];

                }
                System.out.println(currSum);
                if(maxSum<currSum) {
                maxSum=currSum;
                }
                }System.out.println("max Sum= " + maxSum);

        }
    }
     public static void main(String args[]) {
         int numbers[] = {2, 4, 6, 8, 10};
         maxSubArraySum(numbers);

     }
}
