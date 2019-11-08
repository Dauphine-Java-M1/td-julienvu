package fr.dauphine.vujulien.td00;

import java.util.ArrayList;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionText 
    extends TestCase
{
	private ArrayList<Integer> numbers;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionText( String testName )
    {
        super(testName);
    }

    
    public void test0isPrime ()
    {
    	PrimeCollection p=new PrimeCollection(numbers);
    	boolean output=p.isPrime(0);
    	//assertTrue(p.isPrime(0));
    	assertEquals(output,true);
    }
    public void testTwoIsPrime ()
    {
    	PrimeCollection p=new PrimeCollection(numbers);
    	boolean output=p.isPrime(2);
    	//assertTrue(p.isPrime(2));
    	assertEquals(output,true);
    }
    public void test9IsNotPrime ()
    {
    	PrimeCollection p=new PrimeCollection(numbers);
    	boolean output=p.isPrime(9);
    	//assertTrue(p.isPrime(9));
    	assertEquals(output,false);
    	
    	
    	
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
