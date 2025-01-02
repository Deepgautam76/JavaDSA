package practiceQuestion;



/**
 * In Java, You can define only method in Interface
 * If you want to implement some method in java use "default" keyword in that method
 * And then after implement method
 */
interface phone{
    void call();
    default void message(){
        System.out.println("Message");
    }
}

class androidPhone implements phone{
    @Override
    public void call() {
        System.out.println("hello kaun");
    }
}
public class practiceJava8concept_1 {
    public static void main(String[] args) {
        phone p=new androidPhone();
        p.call();
        p.message();
    }
}
