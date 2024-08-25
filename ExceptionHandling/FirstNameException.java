package ExceptionHandling;

public class FirstNameException extends Throwable {
    public static String message = "Firstname is mandatory";
    public FirstNameException(String message) {
        super(message);
    }
}
