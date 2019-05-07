package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private static Properties properties;
    private static final String propertyFilePath = "configs/Configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader ( new FileReader ( propertyFilePath ) );
            properties = new Properties ();
            try {
                properties.load ( reader );
                reader.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
            throw new RuntimeException ( "Configuration.properties not found at " + propertyFilePath );
        }
    }

    public static String getDriverPath() {
        String driverPath = properties.getProperty ( "driverPath" );
        if (driverPath != null) return driverPath;
        else throw new RuntimeException ( "driverPath not specified in the Configuration.properties file" );
    }

    public static String getDriverString() {
        String driverString = properties.getProperty ( "driverString" );
        if (driverString != null) return driverString;
        else throw new RuntimeException ( "driverPath not specified in the Configuration.properties file" );
    }


}
