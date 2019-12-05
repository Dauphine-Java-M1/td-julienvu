package fr.dauphine.ja.vujulien.generics;

/**
 * Hello world!
 * @param <T>
 * @param <T>
 *
 */
public class Maximums
{
	
	public static <T extends Comparable<T>> T myMax(T maximum1,T ...tableaumax) {
		T valeur=maximum1;
		for(T el:tableaumax) {
		
			if(el.compareTo(valeur)>0) {
				valeur=el;
			}
		}
		return valeur;
	}
	//redéfinition méthode equals
	@Override
	public boolean equals(Object T1){
		if(T1 instanceof Maximums<?>) {
			if(((Maximums<?>)T1).equals(this)){
				return true;
			}
		}
		return false;
		
		
	}
	//redéfinition méthode hashCode()
	@Override
	public int hashCode() {
		return this.hashCode()+31;
	}
    public static void main( String[] args )
    {
        System.out.println(myMax(234,2) ); //234
        //question 2 exercice 1
       // System.out.println(myMax() );
        System.out.println(myMax(8.6,16.64) );//16.64
        System.out.println(myMax("baa","aba") );//baa
        //System.out.println(myMax(8.6,"aba"));//bound mismatch:not applicable for the arguments(double,String)
        
        
        
    }
	
	
}
