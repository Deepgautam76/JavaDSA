package practiceQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practiceJava8concept {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,1,1,2,3,3,4,4,5,5);
        Map<Integer,List<Integer>> map=nums.stream().collect(Collectors.groupingBy(Function.identity()));

        System.out.println(map);
        for(int i:map.keySet()){
            if(map.get(i).size()==1){
                System.out.println(i);
            }
        }
    }
}
