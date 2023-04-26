package ExceptionsJava.Homework3.base.exeptions;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        super("Один из символов полного имени является цифрой!");
    }
    
}
