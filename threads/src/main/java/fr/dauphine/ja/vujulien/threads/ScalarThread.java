package fr.dauphine.ja.vujulien.threads;

public class ScalarThread extends Thread {
	
	MySafeList v1;
	MySafeList v2;
	private int begin;
	private int end;
	private double resultat;
	
	//constructeur ScalarThread
	public ScalarThread(MySafeList v1,MySafeList v2,int begin,int end) {
		this.begin=begin;
		this.end=end;
		this.v1=v1;
		this.v2=v2;
		
		
		
	}
	public double getResult() {
		return this.resultat;
	}
	@Override
	public void run() {
		this.resultat=MySafeList.scalarParallele(this.v1,this.v2,this.begin,this.end);
		
		//this.getResult();
	}
	
	
	
	
	

}	
