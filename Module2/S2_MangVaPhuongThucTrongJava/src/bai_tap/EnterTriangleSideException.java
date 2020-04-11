package bai_tap;

class EnterTriangleSideException extends Exception {
    public EnterTriangleSideException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error when enter a triangle side: " + super.getMessage();
    }
}
