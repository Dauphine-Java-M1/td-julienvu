package fr.dauphine.ja.vujulien.generics;

public class Melange
{

	private Random rnd;
	//question 1
	public static <T> void swap(List<T> list,int entier1,int entier2){
		final List<T> l=list;
		l.set(i,l.set(j,l.get(i)));
	}

	//question 2
	public static <T> void shuffle(List<T>liste){
		if(rand==null){
			rand=new Random();
		}
		int size=list.size();
		if(list instanceof RandomAccess ){
			for(int i=size;i>1;i--){
				swap(list,i-1,rand.nextInt(i));
			}
		}else{
			Object arr[]=list.toArray();

			for(int ind=size;ind>1;ind--){
				swap(arr,ind-1,rand.nextInt(ind));
			}
			ListIterator<T> it=list.ListIterator();
			int i=0;
			while(it.hasNext()){
				it.next();
				it.set((T)arr[i++]);
			}
		}
	}
	//question 2
	public static <T> List<T> shuffled(List<T> liste){

		this.shuffle(liste);
		return liste;
	}

	//question 3

	//	Collections.shuffle(list,this.rnd);

	public static void main(String[] args ){

		List<T> l1={5,3,9,23,67657};
		l1.swap();
		this.shuffle(l1);
		l1.shuffled();
	}

	
}
