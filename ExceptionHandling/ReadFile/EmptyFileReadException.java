package ExceptionHandling.ReadFile;

public class EmptyFileReadException extends Exception{
    public static String massage= "File is Null";
    public EmptyFileReadException(String massage){
        super(massage);
    }
}
