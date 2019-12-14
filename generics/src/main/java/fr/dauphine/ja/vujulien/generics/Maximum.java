package fr.dauphine.ja.vujulien.generics;


public class Maximum
{
	public static int myMax(int maximum1,int ...tableaumax) {
		int valeur=maximum1;
		for(int el:tableaumax) {
		
			if(valeur<el) {
				valeur=el;
			}
		}
		return valeur;
	}
	
	//public static <T extends Comparable<T>> T myMax(T maximum1,T ...tableaumax) {
	//		T valeur=maximum1;
	//	for(T el:tableaumax) {
	//	
	//		if(el.compareTo(valeur)>0) {
	//			valeur=el;
	//		}
	//	}
	//	return valeur;
	//}
	
	
    public static void main( String[] args )
    {
        System.out.println(myMax(234,2) ); //234
        //question 2 exercice 1
       // System.out.println(myMax() );
        //System.out.println(myMax(8.6,16.64) );//16.64
        //System.out.println(myMax("baa","aba") );//baa
        //System.out.println(myMax(8.6,"aba"));//bound mismatch:not applicable for the arguments(double,String)
        
        
        
    }
	
	
}
