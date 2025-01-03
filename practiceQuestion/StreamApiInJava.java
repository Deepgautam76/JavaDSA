package practiceQuestion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream api convert a simple data
 * Into the running stream
 */
public class StreamApiInJava {
    public static void main(String[] args) {

        List<Integer> num=Arrays.asList(1,2,3,4,5,6);
        num.stream().filter(i->{
            if(i%2==0)
            System.out.println(i);
            return true;
        });

        /**
         * Stream api only one time use
         * Another wise give the Exception
         */
        Stream<Integer> s=num.stream();
        System.out.println("From stream :"+s.count());


        //Print the date and time using this
        LocalDate d=LocalDate.now();
        System.out.println("Current Date: "+d);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Current Date and time: "+dt);
    }
}
