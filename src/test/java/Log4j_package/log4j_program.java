package Log4j_package;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j_program {

    public static void main(String[] args) {
        Logger log = LogManager.getLogger(log4j_program.class);
        log.info("Test case is executed");
        System.out.println("test executed");
    }
}
