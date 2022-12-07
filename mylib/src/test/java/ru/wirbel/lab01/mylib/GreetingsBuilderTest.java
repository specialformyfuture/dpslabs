package ru.wirbel.lab01.mylib;

import java.util.*;
import java.lang.*;
import java.io.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GreetingsBuilderTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GreetingsBuilderTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GreetingsBuilderTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGreetingsBuilder() throws FileNotFoundException, IOException
    {
		String a = "ru";
		String b = "unof";
		GreetingsBuilder greetingsBuilder = new GreetingsBuilder(a,b);
		String result = greetingsBuilder.GreetingsMethod();
        assertEquals(result,"Здарова братишка как сам э-мля?");
    }
	public void testGreetingsBuilderNotNull() throws FileNotFoundException, IOException
    {
		String a = "qwertyen";
		String b = "qwertyunof";
		GreetingsBuilder greetingsBuilder = new GreetingsBuilder(a,b);
		String result = greetingsBuilder.GreetingsMethod();
        assertNotNull(result);
		//assertNull(result);
    }
}
