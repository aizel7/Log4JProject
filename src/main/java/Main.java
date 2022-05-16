import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    private static OrderLogic logic;

    public static void main(String[] args) {
        BasicConfigurator.configure();
        int a = 50;
        int b = 60;
        int c = a + b;
        logger.info("Sum of a and b");
        logic = new OrderLogic();
        logic.doOrder();
    }
}