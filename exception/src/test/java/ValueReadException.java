import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ValueReadException extends RuntimeException {
    private String message;
    private Throwable cause;

    public ValueReadException(String message) {

        //TODO: change the code to pass the test
        this.message = message;
    }

    public ValueReadException(String message, Throwable cause) {
        //TODO: change the code to pass the test
        this.message = message;
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
