package com.alekotra;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Sample Main class for sbt-based pure Java projects
 *
 * Created by alboko on 9/23/15.
 */
public class Main {

    /**
     * Main is always Main ;)
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("put you code here!");
    }

    /**
     *  Sample int function that returns argument value
     *
     * @param num any number
     * @return argument value
     */
    public int intFunction(int num) {
        return num;
    }

    /**
     *  Sample generic function that returns its parameter
     *
     * @param param any object of type T
     * @param <T> type
     * @return param value
     */
    public <T> T typeFunction(T param) {
        return param;
    }

    /**
     * Sample method to read resource file content to String
     *
     * @param resourceName resource file name in /resources
     * @return resource as String
     * @throws IOException
     */
    public String readResource(String resourceName) throws Exception {

        URL resourceUrl = getClass().getResource(resourceName);
        if (resourceUrl == null)
            throw new FileNotFoundException("resource " + resourceName + " is not found");
        else {
            Path resourcePath = Paths.get(resourceUrl.toURI());
            return Files.lines(resourcePath).reduce("", String::concat);
        }
    }

    /**
     * Sample method to read data file content to String
     *
     * @param dataFileName data file name from "<project-root>/data"
     * @return data as String
     * @throws IOException
     */
    public String readData(String dataFileName) throws IOException {
        Path dataPath = Paths.get(dataFileName);
        return Files.lines(dataPath).reduce("", String::concat);
    }
}
