package BubbleSort;

import java.util.Arrays;

public class ArrayBub {
    private int[] a;
    private int nElems;

    public ArrayBub(int max){
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int j =0; j< nElems; j++){
            System.out.print(a[j] + " ");

        }
    }

    public void bubbleSort(){
        int temp =0;

        for(int i = 0; i < a.length-1; i++){
            for(int j = 0; j< a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
