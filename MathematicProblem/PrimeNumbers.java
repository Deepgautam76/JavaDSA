package MathematicProblem;
import java.util.*;

//Important Problem
public class PrimeNumbers {
    public static void main(String [] args){
        System.out.println("All prime number from 0 to 20");
        boolean[] prime=seiveOfEratoSthenes(20);
        for(int i=0; i<20; i++){
            System.out.println(i+" "+prime[i]);
        }
    }


    //Most efficient way to find prime number O(Sqrt(n))
    public static boolean[] seiveOfEratoSthenes(int n){
        boolean[] isprime=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;

        for(int i=2; i*i<n; i++){
            for(int j=2*i; j<n; j+=i){
                isprime[j]=false;
            }
        }
        return isprime;
    }


}
