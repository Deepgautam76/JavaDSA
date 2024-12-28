package MathematicProblem;


//This problem has many names like(JosephusProblem, Winner of Circular game)


//This problem mainly solves it by recursion
public class JosephusProblem {
    public static void main(String [] args){

        //call the function pass man and next killing shot

        int winner=solution(5,3);
        System.out.println("Winner is:"+ winner);
    }

    public static int solution(int man,int k){
        if(man==1)
            return 0;

        return (solution(man-1,k)+k)%man;
    }
}
