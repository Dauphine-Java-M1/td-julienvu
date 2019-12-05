package fr.dauphine.ja.vujulien.generics;

public class Melange
{

	private Random rnd;
	//question 1
	public static <T> void swap(List<T> list,int entier1,int entier2){
		if(i >= list.size() || j >= list.size() || i < 0 || j < 0){
            throw new IndexOutOfBoundsException("i or j is out of bounds");
        }
        //utiliser méthodes get et set
        T t1=list.get(i);
        T t2=list.get(j);
		list.set(i,t2);
		list.set(j,t1);
	}

	//question 2
	public static <T> void shuffle(List<T>liste){
		Random rand=new Random();
		for(int ind=1;ind<list.size();ind++){
			int suivant=rand.nextInt(ind+1);
			swap(liste,i,suivant);
		}
		
	}
	
	//question 3

	//	Collections.shuffle(list,new Random());

	public static void main(String[] args ){

		List<T> l1={5,3,9,23,67657};
		l1.swap();
		this.shuffle(l1);
		l1.shuffled();
	}

	
}
