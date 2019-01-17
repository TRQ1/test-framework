package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class testProperties {
    public static void main(String[] args) {
        try {
            String filePath ="D:\\Projects\\test-framework\\test\\resource\\config.properteis";
            Properties properties = new Properties();
            FileInputStream fs = new FileInputStream(filePath);
            properties.load(new BufferedInputStream(fs));

            System.out.println("user.id: " + properties.getProperty("user.id"));
            System.out.println("user.name: " + properties.getProperty("user.name"));
            System.out.println("company.name: " + properties.getProperty("company.name"));
            System.out.println("company.address: " + properties.getProperty("company.address"));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
