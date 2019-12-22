package fr.dauphine.ja.vujulien.threads;

public class ThreadTest1{
	
	private static  int n;
	 private final static Object monitor = new Object();//monitor
	 private static boolean flag;//drapeau
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
	public static Runnable createthreadsbis(final int id) {
		return new Runnable() {
			public void run() {
					while(ThreadTest1.n<10000) {
						synchronized(ThreadTest1.monitor) {
							if (ThreadTest1.n < 10000) {
	                            System.out.println("Je suis le thread " + id + " et j'effectue l'iteration " + ThreadTest1.n);
	                            ThreadTest1.n++;
	                        }
							
						}
					}
			}};
	}
	//questions 4  et 5 exercice 1 concurrence (mettre un drapeau)
	public static Runnable createthreads1(final int id) {
		return new Runnable () {
			

			public void run() {
				int limite=10000;
					while(n<10000) {
						synchronized(ThreadTest1.monitor) {
							
						//si je ne suis pas arrivé à 10000  itérations
						if(ThreadTest1.n<limite) {
							flag=true;
							
						}
						if(flag==true) {
							System.out.println("Je suis le thread " + id + " et j'effectue l'itération  "+ ThreadTest1.n++);
							flag=false;
						}
							
							
					}
							
				}
							
				
			}};
	}
	public static void main(String[] args) {
		//questions 1/2
		//Thread T11=new Thread(ThreadTest1.createthreads(1));
		//Thread T22=new Thread(ThreadTest1.createthreads(2));
		
		//T1.start();
		//T2.start();
		
		//questions 3 
		//Thread T13=new Thread(ThreadTest1.createthreadsbis(1));
		//Thread T23=new Thread(ThreadTest1.createthreadsbis(2));
				
		//T13.start();
		//T23.start();
		
		//tests question  4/5
		Thread T1=new Thread(ThreadTest1.createthreads1(1));
		Thread T2=new Thread(ThreadTest1.createthreads1(2));
		
		T1.start();
		T2.start();
		
	}
	
}
