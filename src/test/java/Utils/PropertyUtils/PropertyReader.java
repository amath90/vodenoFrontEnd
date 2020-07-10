package Utils.PropertyUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static final Logger LOG = LogManager.getLogger(PropertyReader.class);
    private static Properties properties;

    static {
        try {
            propertyReader();
        } catch (final IOException e) {
            LOG.error("Error " + e + " during reading property");
        }
    }

    private static void propertyReader() throws IOException {
        properties = new Properties();
        final File f = new File("." + File.separator + "src" + File.separator + "Test" + File.separator + "Resources" + File.separator + "properties.properties");

        final FileReader obj = new FileReader(f);
        properties.load(obj);
    }

    public static String getPropertyData(final String Data) {
        return properties.getProperty(Data);
    }

}
