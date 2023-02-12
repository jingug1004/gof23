package A15Facade;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    public Database() {
    }

    public static Properties getProperties(String dbname) throws IOException {
        String filename = "C:\\Users\\A\\IdeaProjects\\untitled\\src\\A15Facade\\" + dbname + ".txt";
        Properties properties = new Properties();
        properties.load(new FileReader(filename));

        return properties;
    }
}