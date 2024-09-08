package ExceptionHandling.ReadPositiveNumber4;

public class PositiveException extends Exception{
    public static String message= "The Number is Positive";
    public PositiveException(String message){
        super(message);
    }
}
