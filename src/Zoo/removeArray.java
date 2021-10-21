package Zoo;

import java.util.Arrays;

public class removeArray {
    public static void main(String[] args) {
        int[] arr = {23,45,67,232,4,5,21,35,56,53,900};
        int removeIndex = 2;

//        for(int i = removeIndex; i<arr.length-1; i++){
//            arr[i] = arr[i+1];
//        }

        //System.out.println("After removal " + Arrays.toString(arr) );
        System.out.println("Max value is " + getMax(arr));
    }

    public static int getMax(int[]arr){
        int max=0;
        for(int i =0; i < arr.length; i++){
                if(arr[i]> max){
                     max = arr[i];
            }
        }
        return max;
    }
}
