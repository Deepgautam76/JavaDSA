package src;

import java.util.Stack;

public class removeConsecutiveSubsequenc {
    public static int[] remove(int[] arr){
        int len=arr.length;
        if(len<=1) return arr;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<len; i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==len-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] result=new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            result[i]=st.pop();
        }
        return result;
    }

    public  static void main(String[] args){
        int[] arr={1,1,1,1,4,5,5,6,6,6,1};
        int[] res=remove(arr);

        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
