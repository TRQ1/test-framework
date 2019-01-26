package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class testProperties {

    private Properties properties;

    public testProperties() {
        properties = new Properties();
    }


    public Properties getProperties() {
        return properties;
    }

    /**
     * Properties 파일을 Inputstream으로 Load하여 맴버 변수의 Properties에 저장한다.
     *
     * @param path
     * @throws IOException
     */
    public void loadProperties(String path) throws IOException {
        InputStream propPath = getClass().getClassLoader().getResourceAsStream(path);
        properties.load(propPath);
        propPath.close();
    }

    public static Properties loadPropertiesStatic(String path) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = testProperties.class.getClassLoader().getResourceAsStream(path);
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    public static void main(String[] args) throws IOException {
        testProperties testProperties = new testProperties();
        testProperties.loadProperties("/config.properteis");

        Properties properties = testProperties.getProperties();

        System.out.println("user.id: " + properties.getProperty("user.id"));
        System.out.println("user.name: " + properties.getProperty("user.name"));
        System.out.println("company.name: " + properties.getProperty("company.name"));
        System.out.println("company.address: " + properties.getProperty("company.address"));

    }

}
