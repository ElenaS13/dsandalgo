import java.util.Arrays;

public class InsertionSortPratice {
    public static void main(String[] args) {
        int[] arr = {25, 47, 3, 19, 8, 18};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        for(int i =1; i < arr.length; i++){
            int element = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >element){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
        return arr;
    }


}
