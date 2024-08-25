package ExceptionHandling;

public class LastNameException extends Exception {
    public static String message = "Last name is mandatory";
    public LastNameException(String message) {
        super(message);
    }
}
