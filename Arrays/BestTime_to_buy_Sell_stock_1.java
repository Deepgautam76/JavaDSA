package Arrays;

/**
 * --- Famous problem ---
 * Best time to buy a stock
 * To gain the maximum profit
 */
public class BestTime_to_buy_stock {

    /**
     * First method
     * TimeComplexity:O(n)
     * SpaceComplexity:O(1)
     */
    public static int maxProfit_1(int[] arr){
        int sofar=arr[0];
        int maxgain=0;
        for (int i:arr){
            sofar=Math.min(sofar,i);
            maxgain=Math.max(maxgain,i-sofar);
        }
        return maxgain;
    }

    /**
     * Second method
     * TimeComplexity:O(n)
     * SpaceComplexity:O(n)
     */
    public  static int maxProfit_2(int[] arr){
        int len=arr.length;
        //Temp array
        int[] aux=new int[len];
        aux[len-1]=arr[len-1];
        for(int i=arr.length-2; i>=0; i--){
            aux[i]=Math.max(aux[i+1],arr[i]);
        }

        int maxgain=0;
        for (int i=0; i<len; i++){
            int diff=aux[i]-arr[i];
            maxgain=Math.max(diff,maxgain);
        }
        return maxgain;
    }
    public static void main(String[] args) {
        int[] stock={2,5,9,2,6,3};
        int maxProfit=maxProfit_1(stock);
        int maxProfit_1=maxProfit_2(stock);
        System.out.println("Max profit gain from first method:"+maxProfit);
        System.out.println("Max profit gain from second method:"+maxProfit_1);

    }
}
