package MathematicProblem;

public class Modules {
    public static void main(String [] args){
        System.out.println("Modules");
        // find the power of any number
        System.out.println(fastPower(3,4));
        System.out.println(fastPowerModulo(312556789,5,10000007));
    }

    //Case:1
    static int fastPower(int a,int b){
        //A is number
        //B is power
        int res=1;

        while (b>0){
            if((b&1)!=0){
                res=res*a;
            }
            a=a*a;
            b=b>>1;
        }
        return res;
    }

    //Case:1
    static long fastPowerModulo(long a,long b,long n){
        //A is number
        //B is power
        long res=1;

        while (b>0){
            if((b&1)!=0){
                res=(res*a%n)%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return res;
    }


}
