package String;


/**
 * Print the all SubSet of a string
 * Using recursion method
 */
public class PowerSetOfString {
    public static void subString(String str,String curr,int index){
        if(index==str.length()){
            System.out.println(curr);
            return;
        }
        subString(str,curr+str.charAt(index),index+1);
        subString(str,curr,index+1);
    }
    public static void main(String[] args) {
        String s="kamal";
        subString(s,"",0);

    }
}
