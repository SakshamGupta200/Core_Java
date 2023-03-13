package ExceptionalHandling;

public class EH2 {
    public static void main(String[] args) {
        dummy obj=new dummy();
        try {
            obj.validate(13);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class dummy
{
    public void validate(int age) throws ArithmeticException{
        if(age<18)
        {
            throw new ArithmeticException("Invalid age,Age must be greater than 18");
        }
        else
        {
            System.out.println("valid for vote");
        }
    }
}