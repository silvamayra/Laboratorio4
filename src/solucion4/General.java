/*
 * *Esta clase hereda a la clase militar y contiene la informacion de los generales
 * inciso 4
 *@Authors: Mayra Silva 17276
 * @File name: General.java
 * @Date and Project: Solucion4 (12/10/2017)
 */
package solucion4;


	// CC2006, Lab 4
	// Una clase para representar a los Generales.

	public class General extends Militar {
		
		//Metodo para determinar la cantidad de dias de vacaciones
		//@return: 15 dias
	    public int getDiasVacaciones() {
	        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
	    }
	    //Metodo para indicar el color de formulario a utilizar
	    //@return rosado
	    public String getFormularioVacaciones() {
	        return "rosado";
	    }
	    //Metodo para indicar la estrategia del general
	    //@param: 
	    
	    public void planificaEstrategia() {
	        System.out.println("Llevaremos tres divisiones a la frontera!");
	    }
	}

