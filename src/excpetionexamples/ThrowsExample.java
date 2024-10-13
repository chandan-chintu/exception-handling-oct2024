package excpetionexamples;

public class ThrowsExample {

    public void demo() throws InterruptedException, IllegalAccessException {
        System.out.println("inside demo method");
        int a=40;
        if(a==10){
            throw new RuntimeException("a value is 10 and unchecked exception");
        }
        if(a==20){
            throw new ArithmeticException("a value is 10 and unchecked exception");
        }
        if(a==30){
            throw new InterruptedException("a value is 10 and checked exception");
        }
        if(a==40){
            throw new IllegalAccessException("a value is 10 and checked exception");
        }
    }

    public static void main(String[] args) {
        try{
            ThrowsExample throwsExample = new ThrowsExample();
            throwsExample.demo();
        } catch (Exception e1){
            System.out.println("Exception occured : "+e1.getMessage());
        }

    }
}
