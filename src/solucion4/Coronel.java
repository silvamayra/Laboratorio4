/*
 * *Esta clase que hereda de teniente y da la orden a seguir 
 *@Authors: Mayra Silva 17276
 * @File name: Coronel.java
 * @Date and Project: Solucion 1 (12/10/2017)
 */
package solucion4;


	// CC2006, Lab 4
	// Una clase para representar a los Coroneles.

	public class Coronel extends Teniente {
		
		//Metodo que calcula el salrio del coronel, heredando metodos de la clase madre
		//@return 45,000
	    public double getSalario() {
	        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
	    }
	    //Metodo que indica la orden del coronel
	    //@param:
	    
	    public void ejecutaOrdenManiobra() {
	        System.out.println("Presenten Armas!");
	    }
	}


