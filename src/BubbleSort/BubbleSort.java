package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {

        int maxSize= 100;
        ArrayBub arr = new ArrayBub(maxSize);

        arr.insert(20);
        arr.insert(45);
        arr.insert(46);
        arr.insert(34);
        arr.insert(65);
        arr.insert(2);
        arr.insert(31);

        arr.display();

        arr.bubbleSort();
        arr.display();
    }
}
