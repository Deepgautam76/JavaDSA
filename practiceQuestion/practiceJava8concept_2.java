package practiceQuestion;

import java.util.Arrays;
import java.util.List;

/**
 * Internal loops
 * That loop those are present in the Collection Interface (they are faster as compare to external loop)
 * "forEach" is the internal loop (it's faster)
 */
public class practiceJava8concept_2 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        list.forEach(i-> System.out.println(i));
    }
}
