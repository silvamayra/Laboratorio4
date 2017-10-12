
/*
 * *Esta clase hereda a la clase militar y recibe la orden del coronel
 *@Authors: Mayra Silva 17276
 * @File name: Teniente.java
 * @Date and Project: Solucion4 (12/10/2017)
 */package solucion4;


	// CC2006, Lab 4
	// Una clase para representar a los Tenientes.

	public class Teniente extends Militar {
		//Metodo para tomar la orden del coronel
		//@param: String texto
	    public void tomaOrdenCoronel(String texto) {
	        System.out.println("Tomando orden del Coronel: " + texto);
	    }

}
