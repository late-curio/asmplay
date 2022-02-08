import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        logger.log(Level.FINEST, "Hello");
        Integer i = 100;
        System.out.println(i);
    }
}
