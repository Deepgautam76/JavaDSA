package String;

/**
   solve a palindrome problem by the recursion
 */
public class palindrome {
    public static boolean isPalindrome(String s,int f,int l){
        if(f>=l)
            return true;
        if(s.charAt(l)!=s.charAt(f))
            return false;
        return isPalindrome(s,f+1,l-1);
    }
    public static void main(String[] args) {
        String s="abaa";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
