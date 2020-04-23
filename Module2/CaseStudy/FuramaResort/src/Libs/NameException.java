package Libs;

public class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when enter customer name: " + super.getMessage();
    }
}
