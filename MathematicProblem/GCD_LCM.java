package MathematicProblem;


//Find gcd in the most efficient way
public class GCD_LCM {
    public static void main(String [] args){
        System.out.println("GCD:");
        int a=2;
        int b=3;
        int gcd=GCD(a,b);
        int lcm=LCM(a,b);
        System.out.println("gcd of" +a+" and "+b+": "+gcd);
        System.out.println("lcm of" +a+" and "+b+": "+lcm);
    }

    /*
    GCD function
    formula of GCD(a,b)=gcd(a-b,b)  a>b
    until any one of them is zero return the non-zero is answered
    */
    public static int GCD(int a,int b){
        if(a==0 || b==0)
            return Math.max(a,b);
        return
                GCD(Math.max(a,b)-Math.min(a,b),Math.min(a,b));
    }


    /*
    most simple way to find the LCM
    formula of LCM(a,b)=a*b/gcd(a,b)
     */
    public static int LCM(int a,int b){
        return (a*b)/GCD(a,b);
    }
}
