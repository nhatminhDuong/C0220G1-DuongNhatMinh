package Libs;

public class PhoneNumberException extends Exception {
    public PhoneNumberException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when enter phone number: " + super.getMessage();
    }
}