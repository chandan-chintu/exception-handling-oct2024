package excpetionexamples;

public class ThrowExample {

    public void sample(){
        System.out.println("inside sample method before thrwoing exception");
        int a=10;
        if(a==10){
            throw new RuntimeException("some random exception occured");
        }
        System.out.println("a is :" +a);
    }

    public static void main(String[] args) {
        try {
            ThrowExample throwExample = new ThrowExample();
            throwExample.sample();
        }catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
