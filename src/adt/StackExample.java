package adt;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        String name = "Elena";
        for(int i =name.length()-1; i >= 0; i--){
            char ch = name.charAt(i);
            myStack.push(ch);


        }

        System.out.println(myStack);


    }
}
