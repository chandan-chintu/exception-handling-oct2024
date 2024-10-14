package excpetionexamples;

public class MainClass {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            int a=10;
            if(a==10){
                throw new MyOwnException("some customzised exception occurred");
            }
        } catch (Exception e1){
            System.out.println("Exception occurred : "+e1.getMessage());
        }
    }
}
