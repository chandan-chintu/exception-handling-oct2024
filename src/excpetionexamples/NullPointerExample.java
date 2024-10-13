package excpetionexamples;

public class NullPointerExample {
    public static void main(String[] args) {
        try{
            String msg1 = "Hi hello";
            System.out.println("msg1 length is "+msg1.length());
            String msg2 = null;
            System.out.println("msg2 length is "+msg2.length());
        } catch (NullPointerException e){
            System.out.println("Exception ocuured : "+e.getMessage());
        }

    }
}
