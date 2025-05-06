package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



import static java.util.Currency.getInstance;

public class configReader {

    private static Properties prop;



    public static Properties configReader() throws IOException {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        if (prop == null) {
            prop = new Properties();
            try {
                InputStream inputStream = configReader.class.getClassLoader().getResourceAsStream("Global.properties");

                if (inputStream == null) {
                    throw new RuntimeException("Config file not found!");
                }

                prop.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load config file: " + e.getMessage());
            }
        }
        return prop;
    }

    public static String getProperty(String key) throws IOException {
        return configReader().getProperty(key); // Fetches property from loaded file
    }
}




