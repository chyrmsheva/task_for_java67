import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

         int[] arr = {1,2, 3, 5, 6, 7, 8, 9,10, 11, 12};
         System.out.println(getMessingNumber(arr));


    }
    public static int getMessingNumber(int[] numbers){

        int n = numbers.length;
        int m = n+1;
        int total = m*(m+1)/2;
        int sum = Arrays.stream(numbers).sum();
        return total - sum;





    }




}
