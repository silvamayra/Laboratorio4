/*
 * *Esta clase es la clase madre, tiene los metodos que sirven en las otras clases creadas
 * inciso 4
 *@Authors: Mayra Silva 17276
 * @File name: Militar.java
 * @Date and Project: Solucion4 (12/10/2017)
 */
package solucion4;


	// CC2006, Lab 4
	// Una clase para representar a los militares en general.

	public class Militar {
		
		//Metodo para obtener la cantida de horas que trabaja
		//@Param
	    public int getHoras() {
	        return 40;           // trabaja 40 horas / semana
	    }
	    //Metodo para obtener el salario
	    //@param:
	    public double getSalario() {
	        return 40000.0;      // Q40,000.00 / anio
	    }
	    
	    //Metodo para obtener la cantidad de dias de vacaciones
	    //@param:
	    public int getDiasVacaciones() {
	        return 10;           // 2 semanas de vacaciones pagadas
	    }
	    //Metodo para obtener el tipo de formulario a utilizar
	    //@param:
	    public String getFormularioVacaciones() {
	        return "amarillo";     // use el formulario amarillo
	    }
	}


