package logger;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerConfig {
    public Logger log;


    public LoggerConfig(){
        log = Logger.getLogger(this.getClass().getName());
        DOMConfigurator.configure("C:\\Inna\\Final_Project_BGO\\BGO_Internship_Project\\src\\test\\resources\\configs\\logging.xml");
    }



}
