package com.alekotra;

import java.io.IOException;

/**
 * Sample Main class for sbt-based pure Java projects
 *
 * Created by alboko on 9/23/15.
 */
public class Main {

    /**
     * Main is always Main ;)
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("put you code here!");
    }

    /**
     *  Sample int function that returns argument value
     *
     * @param num
     * @return argument value
     */
    public int intFunction(int num) {
        return num;
    }

    /**
     *  Sample generic function that returns its parameter
     *
     * @param param
     * @param <T>
     * @return param value
     */
    public <T> T typeFunction(T param) {
        return param;
    }

    /**
     * Sample method to read resource file content to String
     *
     * @param resourceName
     * @return resource as String
     * @throws IOException
     */
    public String readResource(String resourceName) throws IOException {
        return "@todo";
    }

    /**
     * Sample method to read data file content to String
     *
     * @param dataFileName
     * @return data as String
     * @throws IOException
     */
    public String readData(String dataFileName) throws IOException {
        return "@todo";
    }
}
