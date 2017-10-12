/*
 * *Esta clase es el principal que imprime los resultados 
 *@Authors: Mayra Silva 17276
 * @File name: Main.java
 * @Date and Project: Solucion 1 (12/10/2017)
 */
// CC2006 Lab
// Este programa cliente prueba el comportamiento de su clase AlarmaEmergencia.

public class  Main {
	public static void main(String[] args) {
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		alarmaIncendio.m1();                  // emergencia 1
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		System.out.println(alarmaIncendio);   // emergencia Ring…Ring…Ring…Ring
	}
}