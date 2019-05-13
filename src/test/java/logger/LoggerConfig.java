package logger;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerConfig {
    public Logger log;

    public LoggerConfig(){
        log = Logger.getLogger(this.getClass().getName());
        DOMConfigurator.configure("C:\\Users\\alcastravet\\OneDrive - ENDAVA\\Desktop\\bgo2\\BGO_Internship_Project\\src\\test\\resources\\configs\\logging.xml");
    }

}