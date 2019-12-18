package fr.dauphine.ja.vujulien.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Melange 
{
    public static <T> void swap(List<T> liste,int indice1,int indice2) {
	if(indice1 >= list.size() || indice2 >= list.size() || indice1 < 0 || indice2 < 0){
            throw new IndexOutOfBoundsException("i or j is out of bounds");
        }
    	T element1=liste.get(indice1);
    	T element2=liste.get(indice2);
    	liste.set(indice1, element2);
    	liste.set(indice2, element1);
		
    	
    	
    }
  //question 2
  	public static <T> void shuffle(List<T>liste){
  		Random rand=new Random();
  		for(int ind=1;ind<liste.size();ind++){
  			int suivant=rand.nextInt(ind+1);
  			swap(liste,ind,suivant);
  		}
		System.out.println(liste);
  		
  }
  	public static   void shufflebis(List<?> list,
  		    Random rnd) {
  		
  		for(int ind=1;ind<list.size();ind++){
        if (!(list instanceof RandomAccess)){
    			int suivant=rnd.nextInt(ind+1);
          list.toArray()
    			System.out.println(list.toArray());
          shuffle(list);


        }
  		}
		
  		
  	}
    public static void main(String[] args) {
    	Random rnd=new Random();
		List<String> liststring=new ArrayList();
		liststring.add("a");
		liststring.add("b");
		liststring.add("c");
		liststring.add("d");
		System.out.println("liststring  : " + liststring);
		//List listfinal=swap(liststring,1,2);
		Melange.shuffle(liststring);
		
		Melange.shufflebis(liststring,rnd);
		
		
	}
}
