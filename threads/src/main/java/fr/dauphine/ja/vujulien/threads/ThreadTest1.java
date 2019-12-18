package fr.dauphine.ja.vujulien.threads;

public class ThreadTest1{
	
	private static  int n;
	//question 1 exercice 1 concurrence
	public static Runnable createthreads(final int id) {
		return new Runnable() {
			public void run() {
					for(int i=0;i<10000;i++) {
						System.out.println("Je suis le thread " + id);
					}
			}};
	}
	//question 3 exercice 1 concurrence
	public static Runnable createthreads1(final int id) {
		return new Runnable () {
			

			public void run() {
				synchronized(this) {
					while(n<10000) {
							n=n+1;
							System.out.println("Je suis le thread " + id + " et j'effectue l'itération  "+ n);
					}
							
				}
							
				
			}};
	}
	public static void main(String[] args) {
		
		//Thread T1=new Thread(ThreadTest1.createthreads(1));
		//Thread T2=new Thread(ThreadTest1.createthreads(2));
		
		//T1.start();
		//T2.start();
		
		//tests question  5
		Thread T1=new Thread(ThreadTest1.createthreads1(1));
		Thread T2=new Thread(ThreadTest1.createthreads1(2));
		
		T1.start();
		T2.start();
		
	}
	
}
