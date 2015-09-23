package com.alekotra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.io.IOException;

/**
 * Sample tests for Main class
 *
 * Created by alboko on 9/23/15.
 */
public class MainTest {

    @Test
    public void makeSureItWorks() {
        Main main = new Main();
        assertNotNull("should not be null", new Object());
    }

    @Test
    public void testIntFunction() {
        Main main = new Main();
        assertEquals(main.intFunction(123), 123);
    }

    @Test
    public void testTypeFunction() {
        Main main = new Main();
        assertEquals(main.typeFunction("content"), "content");
    }

    @Test
    public void testResourceReads() {
        Main main = new Main();
        try {
            String content = main.readResource("resource.txt");
            assertEquals(content, "sample resource file");
        } catch(IOException ioe) {
            fail(ioe.getMessage());
        }
    }


}
