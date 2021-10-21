public class BSPractice1 {
    public static void main(String[] args) {
        int[] arr = {1,4,56,78,90,99};
        int x = 56;

        System.out.println(binarySearch(arr, x));

    }

    public static int binarySearch(int[] arr, int x){
        //define pointers

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int middle = (start+end)/2;
            if(arr[middle] == x){
                return middle;
            } else if(arr[middle] < x){
                start = middle+1;
            } else if((arr[middle] > x)){
                end = middle-1;
            } else{
                return middle;
            }


        }

        return -1;
    }
}
