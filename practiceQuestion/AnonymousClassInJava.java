package practiceQuestion;

interface College{
    void student();
}

/**
 * first way to implement interface method
 * university
 */
//class University implements College{
//    @Override
//    public void student() {
//        System.out.println("Kamal");
//    }
//}
public class AnonymousClassInJava {
    public static void main(String[] args) {

        /**
         * Anonymous class
         * A class that doesn't have a name implement
         * By the reference of Interface
         * like blow
         * This is the second way
         */
        College c=new College() {
            @Override
            public void student() {
                System.out.println("Kamal");
            }
        };
        c.student();

        /**
         * Lambda function
         * If interface is a function interface then reduce the above
         * Anonymous method code
         * See the blow
         */
        College d=()-> System.out.println("from Lambda function kamal");
        d.student();
    }
}
