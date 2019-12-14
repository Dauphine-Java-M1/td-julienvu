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
  			int suivant=rnd.nextInt(ind+1);
  			swap(list,ind,suivant);
  		}
		
  		
  	}
    public static void main(String[] args) {
    	Random rnd=new Random();
		List liststring=new ArrayList();
		liststring.add("a");
		liststring.add("b");
		liststring.add("c");
		liststring.add("d");
		System.out.println("liststring  : " + liststring);
		//List listfinal=swap(liststring,1,2);
		this.shuffle(liststring);
		
		this.shufflebis(liststring,rnd);
		
		
	}
}
