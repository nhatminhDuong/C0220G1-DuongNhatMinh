package Libs;

public class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when enter email: " + super.getMessage();
    }
}