package excpetionexamples;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a = 10, res=10;
        try{
            // code to monitor the exception
            System.out.println("Inside the try block before exception occurs");
            res = a/0;
            System.out.println("after exception occurs Inside the try block");
        } catch (ArithmeticException e1){
            // handle the exception
            System.out.println("Exception occured : "+e1.getMessage());
        }
        System.out.println("a is "+a);
        System.out.println("res is "+res);
    }
}
