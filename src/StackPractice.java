import java.util.Arrays;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        String myString = "hello";
        System.out.println(reverseWord(myString));





    }

    public static String reverseWord(String myString){

       Stack stk = new Stack();

       for(int i =0 ; i < myString.length(); i++){
           char indivChar = myString.charAt(i);
           stk.push(indivChar);
       }

       String result = "";
       while (!stk.isEmpty()){
           result = result + stk.pop();
       }

       return result;
    }
}

