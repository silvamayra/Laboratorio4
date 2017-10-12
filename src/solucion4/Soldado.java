/*
 * *Esta clase hereda a la clase militar y es la que solicitan en el temario A, laboratorio 4
 * inciso 4
 *@Authors: Mayra Silva 17276
 * @File name: Soldado.java
 * @Date and Project: Solucion4 (12/10/2017)
 */
package solucion4;

public class Soldado extends Militar {

	
	//Este metodo hereda el metodo getHoras, lo multiplica por dos porque los soldados trabajan el doble
	//@return: 80 
	public int getHoras() {
		return super.getHoras()*2;
	}
	
	//Este metodo hereda el metodo getSalario de la clase militar, donde se le resta 10000
	//porque los soldados ganan 30,000
	//@return 30000
	public double getSalario() {
		return super.getSalario()-10000;
	}
	
	//Este metodo hereda el metodo getDiasVacaciones de la clase militar, donde se divide dentro de dos
	//porque los soldados tienen la mitad de dias de vacaciones.
	//@return 5
	
	public int getDiasVacaciones() {
		return super.getDiasVacaciones()/2;
	}
	
	//Este metodo recibe la orden del general, imprimiendo en pantalla "ordene mi general"
	//@param:
	
	public void recibeOrden() {
		System.out.println("Ordene mi General");
	}
	
}
