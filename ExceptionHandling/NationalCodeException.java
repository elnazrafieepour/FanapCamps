package ExceptionHandling;

public class NationalCodeException extends Throwable {
    public static String mandatoryMessage = "National code is mandatory";
    public static String nationalCodeLengthMessage = "national code length must be 10";
    public static String nationalCodeDigitException = "national code must be digits";
    public NationalCodeException(String message) {
        super(message);
    }
}
