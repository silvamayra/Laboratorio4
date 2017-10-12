/*
 * *Esta clase prueba que funciona la clase soldado creada
 * inciso 4
 *@Authors: Mayra Silva 17276
 * @File name: Driver.java
 * @Date and Project: Solucion4 (12/10/2017)
 */
package solucion4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		
		
		//Se crea un objeto tipo soldado para acceder a sus metodos e imprimirlos en pantalla
		Soldado soldadoNew=new Soldado();
		//Creacion de los objetos
		Militar militar=new Militar();
		Teniente teniente=new Teniente();
		General general= new General();
		Coronel coronel= new Coronel();
		
		//--INFORMACION DEL MILITAR-----------
		//Se indica de quien se esta imrpimiendo la informacion
		System.out.println("Informacion del militar");
		//Se imprime la cantidad de horas que trabaja el general
		System.out.println("La cantidad de horas que trabaja un militar es de: " + militar.getHoras());
		//Se imprime el salario del militar
		System.out.println("El salario del militar es de: " + militar.getDiasVacaciones());
		// se imprime la cantidad de dias de vacaciones del militar
		System.out.println("La cantidad de dias de vacaciones del militar es de:" + militar.getDiasVacaciones());
		//Se describe el tipo de formulario a utilizar.
		System.out.println("El formulario de vacaciones que debe de usar con el militar es de color:  " + militar.getFormularioVacaciones()+ "\n");
		
		//----------TENIENTE---------
		//Se indica de quien se esta hablando
		System.out.println("Teniente entra en accion");
		//Se le solicita al usuario la orden del coronel
		System.out.println("Ingrese la orden del Coronel");
		//Se recibe la orden para luego imprimirla por el metodo toma orden coronel
		String texto=teclado.nextLine();
		teniente.tomaOrdenCoronel(texto);
		
		//-------------Coronel------------
		//Se indica de quien se esta hablando
		System.out.println("\n"+"Coronel entra en accion");
		//Se imprime el salario del teniente
		System.out.println("El salario del coronel es de: " + coronel.getSalario());
		System.out.println("El coronel dice: ");
		coronel.ejecutaOrdenManiobra();
		
		
		
		//-----GENERAL-------
		//Se indica de quien se imprimiran los datos
		System.out.println("\n"+"Informacion del general");
		//Se imprime la cantidad de vacaciones del general
		System.out.println("La cantidad de días de vacaciones del general es de: " + general.getDiasVacaciones());
		//Se imprime el tipo de formulario que hay que utilizar con el general
		System.out.println("El formulario de vacaciones que debe de utilizar  es de color " + general.getFormularioVacaciones());
		//se imprime el metodo planificaEstrategia del general
		System.out.println("La orden del general es: ");
		general.planificaEstrategia();
		
		
		//------INFORMACION DEL SOLDADO------
		System.out.println("\n"+"Informacion del soldado");
		//Se imprime la cantidad de horas que trabaja 
		System.out.println("La cantidad de horas que trabaja un soldado es de: " + soldadoNew.getHoras());
		//Se imprime la cantidad que devenga
		System.out.println("El salario del soldado es de: " + soldadoNew.getSalario());
		//Se imprime la cantidad de dias de vacaciones
		System.out.println("La cantidad de dias de vacaciones es de: "+ soldadoNew.getDiasVacaciones());
		//Se imprime la orden del soldado.
		soldadoNew.recibeOrden();
		
		
		
	}
}
