package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testFound() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("4Fun", "Just", "Bil481"));
        assertTrue(new App().search(array, 4,"4Fun"));
    }

    public void testNotFound() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("4Fun", "Just", "Bil481"));
        assertTrue(new App().search(array, 1,"Just"));
    }

    public void testEmptyArray() {
        ArrayList<String> array = new ArrayList<>();
        assertFalse(new App().search(array, 3,"Just4Fun"));
    }

    public void testNull() {
        assertFalse(new App().search(null, 2,"4"));
    }

    public void noneZero(){
        ArrayList<String> array = new ArrayList<>(Arrays.asList("4Fun", "Just", "Bil481"));
        assertFalse(new App().search(array, 0,""));
    }
}
