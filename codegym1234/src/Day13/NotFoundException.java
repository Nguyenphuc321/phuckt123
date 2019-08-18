package Day13;

public class NotFoundException extends Exception{

    public NotFoundException(String message) {
        System.out.println(message);
        System.exit(0);
    }
}
