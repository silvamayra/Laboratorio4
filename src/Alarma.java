/*
 * *Esta clase hereda a la clase timbre
 *@Authors: Mayra Silva 17276
 * @File name: Alarma.java
 * @Date and Project: Solucion 1 (12/10/2017)
 */
public class Alarma extends Timbre {
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	public void m2() {
		super.m1();
	}
	 
	public String toString() {
		return super.toString() + "..." + super.toString();
	}
}
