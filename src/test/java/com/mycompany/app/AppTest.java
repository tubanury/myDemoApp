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
    public void testIsEqual()
    {
    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 4, 3, 4));
    	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        assertTrue(new App().isEqualSum(array,array2, 10, 2));
   }
    public void testIsNotEqual()
    {
    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 9, 3, 4));
    	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        assertFalse(new App().isEqualSum(array,array2, 5, 2));
   }
    public void testKsmallerThanZero()
    {
    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 4, 3, 4));
    	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        assertFalse(new App().isEqualSum(array,array2, 5, -1));
   }
    public void testSumSmallerThanZero()
    {
    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 4, 3, 4));
    	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        assertFalse(new App().isEqualSum(array,array2, -5, 2));
   }
    public void testArray1SizeEqualsZero()
    {
    	ArrayList<Integer> array = new ArrayList<>();
    	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        assertFalse(new App().isEqualSum(array,array2, 5, 2));
   }
    public void testArray2SizeEqualsZero()
    {
    	ArrayList<Integer> array2 = new ArrayList<>();
    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 2, 5, 6));
        assertFalse(new App().isEqualSum(array,array2, 5, 2));
   }
}
