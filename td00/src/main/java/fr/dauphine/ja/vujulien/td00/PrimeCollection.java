package fr.dauphine.ja.vujulien.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;

    public PrimeCollection(ArrayList<Integer> numbers) {
	this.numbers = numbers;
	}
    
    public void initRandom(int n,int m) {
    	
    	Random r = new Random();
    	int low = 0;
    	int high = m;
    	int i;
    
    	for(i=0;i<n;i++) {
    		int res = r.nextInt(high-low) + low; ;	
    		this.numbers.add(res);	
    	}
    }
    
    private boolean isPrime(int p) {
        for(int i=2;2*i<p;i++) {
            if(p%i==0)
                return false;
        }
        return true;
    }
    
    public void printPrimes(ArrayList<Integer> list) {
    	  for(Integer n : list)
    		  if (isPrime(n))
    	   System.out.println(n);
     
    }
  
    public static void main(String[] args) {
    	
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	PrimeCollection pc = new PrimeCollection(numbers);
    
    	pc.initRandom(100,4000);
    	pc.printPrimes(numbers);
    	System.out.println(pc);
    
    }
}
