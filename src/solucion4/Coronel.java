/*
 * *Esta clase es la madre que hereda a alarma y alarmaemergencia
 *@Authors: Mayra Silva 17276
 * @File name: Timbre.java
 * @Date and Project: Solucion 1 (12/10/2017)
 */
package solucion4;


	// CC2006, Lab 4
	// Una clase para representar a los Coroneles.

	public class Coronel extends Teniente {
	    public double getSalario() {
	        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
	    }
	    
	    public void ejecutaOrdenManiobra() {
	        System.out.println("Presenten Armas!");
	    }
	}


