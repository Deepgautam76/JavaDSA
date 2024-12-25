package Stack;
import java.util.Stack;

//Finding next greater element
public class nextGreaterElement {

    public static int[] greatestElement(int arr[]){
        int len=arr.length;
        if(len<=1){
            return arr;
        }
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[len];
        res[len-1]=-1;
        stack.push(arr[len-1]);

        for(int i=len-2; i>=0; i--){
            while (!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                res[i]=-1;
            else
                res[i]=stack.peek();

            stack.push(arr[i]);
        }
        return res;
    }


    public static void main(String[] args){

        int arr[]={1,3,4,2,8,7};

        //Brute force approach  O(n^2)
        int result[]=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i]=-1;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    result[i]=arr[j];
                    break;
                }
            }
        }
        System.out.println("form method 1");
        for(int i:result){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("from method 2");
        int ans[]= greatestElement(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
