package fr.dauphine.ja.vujulien.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeWild {
	private static void print(List<?>list) {
		for(Object o:list) {
			System.out.println(o);
		}
	}
	//question 3 exercice 2
	public static void Charlength(List<? extends CharSequence> listseq) {
		//itérateur sur une collection
		for(CharSequence charind:listseq) {
			System.out.println(charind.length());
			
		}
		
		//boucle classique
		//for(int ind=0;ind<listseq.size();ind++) {
		//	System.out.println(listseq.get(ind).length());
		//}
		
		
	}
	
	//Exercice 3 tp generics
	
	//variable de type T
	public static <T> List<T> listLength(List<T> list) {
		ArrayList length=new ArrayList<T>();
		for(int i=0;i<list.size();i++) {
			CharSequence seq =(CharSequence )list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	//avec Wildcard
	public static   List listLength1(List<?> list) {
		ArrayList length=new ArrayList();
		for(int i=0;i<list.size();i++) {
			CharSequence seq =(CharSequence )list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	public static void main(String[] args) {
		List<String >list=Arrays.asList("foo","toto","julien");
		print(list);
		Charlength(list);
		
		
		List<String >l=Arrays.asList("colonel","reyel");
		System.out.println(listLength(l));//7 5
		System.out.println(listLength1(l));//7 5
		
	}
	
}
