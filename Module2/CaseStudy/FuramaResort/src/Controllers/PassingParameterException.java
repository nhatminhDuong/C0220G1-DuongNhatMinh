package Controllers;

public class PassingParameterException extends Exception{
    public PassingParameterException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when pass a parameter: " + super.getMessage();
    }
}
