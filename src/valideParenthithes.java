package src;

import java.util.Scanner;
import java.util.Stack;

public class valideParenthithes {

    //case:1 only one type
    public static boolean isvalide(String pattern){

        int len=pattern.length();
        //base case
        if(len==0) return true;
        Stack<Character> ch=new Stack<>();

        for(int i=0; i<len; i++){
            if(pattern.charAt(i)=='('){
                ch.push('(');
            }else {
                if(ch.isEmpty()) return false;
                if(ch.peek()=='(') ch.pop();
            }
        }
        if(ch.size()>0) return false;
        else return true;
    }

    //-----case:2 all type braces "(){}[]"
    public static boolean isvalidealltype(String pattern){
        int len=pattern.length();
        Stack<Character> ch=new Stack<>();

        for(int i=0; i<len; i++){
            char c=pattern.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                ch.push(c);
            }else if(c==')') {
                if(ch.isEmpty()) return false;
                if(ch.peek()=='(') ch.pop();
            } else if (c=='}') {
                if(ch.isEmpty()) return false;
                if(ch.peek()=='{') ch.pop();
            }
            else if (c==']') {
                if(ch.isEmpty()) return false;
                if(ch.peek()=='[') ch.pop();
            }
        }

        if(!ch.isEmpty())
            return false;
        else return true;
    }

//    //How much braces delete to make valid pattern?
//    public static int NoOpationToMakevalide(String pattern){
//
//        int len=pattern.length();
//        //base case
//        if(len==0) return 0;
//        Stack<Character> ch=new Stack<>();
//
//        for(int i=0; i<len; i++){
//            if(pattern.charAt(i)=='('){
//                ch.push('(');
//            }else {
////                if(ch.isEmpty()) return false;
//                if(ch.peek()=='(') ch.pop();
//            }
//        }
//        return ch.size();
//    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello from stack");
        for (int i=0; i<3; i++) {
            System.out.println("Enter the bracket pattern: ");
            String str = sc.nextLine();

//            System.out.println("This pattern is valid : " + isvalide(str));
            System.out.println("This pattern is valid : " + isvalidealltype(str));
//            System.out.println("This pattern is valid : " + NoOpationToMakevalide(str));
        }

    }

}
