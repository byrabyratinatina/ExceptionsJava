package ExceptionsJava.Homework3.base.exeptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Не удается создать файл в CFileCreator: " + message);
    }
}