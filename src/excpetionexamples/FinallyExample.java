package excpetionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            int a= 10/10;
            System.out.println("a is "+a);
        } catch (Exception e1){
            System.out.println("exception occured :"+e1.getMessage());
        }
        finally {
            System.out.println("final block exceuting");
        }
    }
}
