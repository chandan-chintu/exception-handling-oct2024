package excpetionexamples;

public class NestedTryExample {
    public static void main(String[] args) {
        try{
            System.out.println("inside 1st try block");
            int a=10;
            int res = a/10;
            System.out.println("res is "+res);
            try{
                System.out.println("inside 2nd try block");
                String msg1="hi";
                System.out.println("legth of msg1 is "+msg1.length());
                try{
                    System.out.println("inside 3rd try block");
                    int arr[]={1,4,5};
                    System.out.println("6th ondex element is "+arr[6]);
                }catch (ArrayIndexOutOfBoundsException e3){
                    System.out.println("3rd catch block");
                    System.out.println("Exception occured : "+e3.getMessage());
                }
            } catch (NullPointerException e2){
                System.out.println("2nd catch block");
                System.out.println("Exception occured : "+e2.getMessage());
            }
        } catch (ArithmeticException e1){
            System.out.println("1st catch block");
            System.out.println("Exception occured : "+e1.getMessage());
        }
    }
}
