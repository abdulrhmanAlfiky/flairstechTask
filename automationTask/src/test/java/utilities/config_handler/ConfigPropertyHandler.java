package utilities.config_handler;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertyHandler {

    private Properties properties;
    private String dataConfigPath = "resources/config/data-config.properties";
    public ConfigPropertyHandler() throws IOException {
        setConfigProperties();
    }
     private void setConfigProperties() throws IOException {
         properties = new Properties();
        properties.load(new FileInputStream(dataConfigPath));
     }

     public String getProperty(String key){
        return properties.getProperty(key);
     }
}
