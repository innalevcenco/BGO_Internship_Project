package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private String PROPERTY_FILE_PATH = "src/test/resources/configs/Configuration.properties";


    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader ( new FileReader ( PROPERTY_FILE_PATH ) );
            properties = new Properties ();
            try {
                properties.load ( reader );
                reader.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
            throw new RuntimeException ( "Configuration.properties not found at " + PROPERTY_FILE_PATH );
        }
    }

    public String getBrowserName() {
        String browserName = properties.getProperty ( "browserName" );
        if (browserName != null) return browserName;
        else {
            throw new RuntimeException ( "browserName is not specified in the Configuration.properties file" );
        }
    }
}
