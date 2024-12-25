package Arrays;

/***** Important question ******/
//Trapping water
public class RainTrappingWater {
    //TrapWater function
    public static int trapwater(int arr[]){
        int len=arr.length;
        //find the left highest wall
        int left[]=new int[len];
        left[0]=arr[0];

        for(int i=1; i<len; i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //find the right highest wall
        int right[]=new int[len];
        right[len-1]=arr[len-1];
        for(int i=len-2; i>=0; i--)
        {
            right[i]=Math.max(arr[i],right[i+1]);
        }

        //Formula for trapping the water between wall
        //finds the right wall and left wall min height
        //Subtract from arr value that index

        int water=0;
        for(int i=0; i<len; i++){
            water=water+Math.min(left[i],right[i])-arr[i];
        }

        return water;
    }


    public static void main(String [] args){
        int arr[]={3,1,2,4,0,1,3};
        int trapWater=trapwater(arr);
        System.out.println("Total trap Water:"+trapWater);
    }

}