package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        Calculator.calculator();
        Calculator.scanner.close();
        logger.info("This is a info logger.");
        System.out.println("\nGabriel Schrittwieser");
        logger.error("This is an error logger.");
    }
}
