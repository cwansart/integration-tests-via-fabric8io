package de.openknowledge.cwansart.integrationtests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestHelper {

    private static final String PATH = System.getProperty("java.io.tmpdir");

    private static final String FILENAME = "ports.properties";

    private static final Properties properties = new Properties();

    static {
        String propertiesFilename = String.format("%s%s", PATH, FILENAME);

        try (InputStream resourceAsStream = new FileInputStream(propertiesFilename)) {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getContainerUrl(String path) {
        return String.format("%s/%s", getContainerBaseUrl(), path);
    }

    private static String getContainerBaseUrl() {
        // TODO: replace context-root via microprofile-configuration
        return String.format("http://127.0.0.1:%s/integration-tests-via-fabric8io", getContainerPort());
    }

    private static String getContainerPort() {
        return properties.getProperty("host.port");
    }
}
