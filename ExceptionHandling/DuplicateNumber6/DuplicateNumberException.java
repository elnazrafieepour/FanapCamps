package ExceptionHandling.DuplicateNumber6;

public class DuplicateNumberException extends Exception {
    public static String Message = "The Number is Duplicated";

    public DuplicateNumberException(String Message) {
        super(Message);
    }
}
