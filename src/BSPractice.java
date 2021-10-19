public class BSPractice {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,233,23333,30000};
        System.out.println(binarySearch(arr, 7));

    }

    public static int binarySearch(int[] arr, int x){

        //define pointers
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid] < x){
                start= mid+1;
            } else if(arr[mid] >x){
                end = mid-1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}
