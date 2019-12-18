package fr.dauphine.ja.vujulien.threads;

import java.util.ArrayList;
import java.util.List;

public class MySafeList {
	public static ArrayList<Double>l;
	private static int n;
	
	public MySafeList(int n1) {
		l=new ArrayList<Double>();
		this.n=n1;
	}
	public synchronized void add (Double d) {
		l.add(d);
	}
	public synchronized int size() {
		return l.size();
	}
	public synchronized Double get(int position) {
		return l.get(position);
	}
	
	public static int scalar(MySafeList v1,MySafeList v2) {
		if(v1.size()!=v2.size()) {
			throw new IllegalArgumentException("v1 et v2 de même dimension");
		}
		int prod=0;
		for(int i=0;i<n;i++) {
			
			prod+=v1.get(i)*v2.get(i);
			
		}
		return prod;
		
	}
	
	//question 2
	public synchronized  boolean stressTest(int n,int m) {
			List<Thread>t=new ArrayList<Thread>();
			try {
				synchronized(t) {
				for(int i=0;i<n;i++) {
					Thread t1=new Thread();
					t.add(t1);
					t1.start();
					t1.join();
				}
				for(int j=0;j<m;j++) {
					l.add((double) j);
				}
				if(l.size()!=n*m) {
					return false;
				}
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			return true;
			
			
	}
	public static void main(String []args) {
		MySafeList l=new MySafeList(3);
		l.add(2.1);
		l.add(234.23);
		l.add(15.1);
		System.out.println("résultat de stressTest: "+l.stressTest(2,3));//true
		System.out.println("résultat de stressTest: "+l.stressTest(2,6));//true
		System.out.println("résultat de stressTest: "+l.stressTest(2,1));//false
		MySafeList v1=new MySafeList(3);
		MySafeList v2=new MySafeList(3);
		v1.add(3.0);
		v1.add(1.0);
		v1.add(2.0);
		v2.add(1.0);
		v2.add(1.0);
		v2.add(1.0);
		System.out.println(MySafeList.scalar(v1, v2));
		
		
		
	}
	
	
	
	
}
