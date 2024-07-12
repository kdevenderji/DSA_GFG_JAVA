package ArrayApnaclg;

public class Array04LargestNo {



    // public static int linearSearch(int numbers[], int key) {
    // for (int i = 0; i< numbers.length; i++) {
    // if (numbers[i] == key) {
    // return i;
    // }

    // }
    // return -1;

    // }

    // public static void main(String args[]) {
    // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    // int key = 10;
    // int index = linearSearch(numbers, key);

    // if (index == -1) {
    // System.out.println("NoT Found");
    // } else {
    // System.out.println("Key is at index: " + index);

    // }

    // }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest= numbers[i];

            } if(smallest>numbers[i]){
                smallest= numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={1, 2, 6, 3, 5};
        System.out.println("largest value is : " + getLargest(number)) ;
    }
}
