package excpetionexamples;

public class GenericCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            int a =10;
            int res = a/10;
            int arr[] = {10,20,30};
            System.out.println("Array value at 5th index is "+arr[5]);
        } catch (Exception e1){
            System.out.println("Exception Occured : "+e1.getMessage());
        }
        System.out.println("After genric catch");
    }
}
