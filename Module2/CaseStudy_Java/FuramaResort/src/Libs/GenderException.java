package Libs;

public class GenderException extends Exception{
    public GenderException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when enter gender: " + super.getMessage();
    }
}