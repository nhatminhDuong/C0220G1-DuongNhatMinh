package Libs;

public class BirthdayException extends Exception{
    public BirthdayException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when enter birthday: " + super.getMessage();
    }
}
