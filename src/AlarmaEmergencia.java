
public class AlarmaEmergencia extends Timbre{
	//Se crea el objeto tipo alarma para poder utilizar sus métodos.
	Alarma alarmaTemp= new Alarma();
	//Este metodo imprime emergencia 1, sobreescribe el metodo m1 de la clase timbre
	//@param
	public void m1() {
		System.out.println("emergencia 1");
	}
	
	//Este metodo utiliza los metodos de la clase Alarma para poder imprimir
	//alarma 1 y timbre 1
	//@param:
	public void m2() {
		alarmaTemp.m1();
		alarmaTemp.m2();
	}
	
	//Este metodo utiliza la herencia para utilizar su metodo to string, se repite dos veces
	//para que pueda imprimir dos veces "ring..ring" y la palabra emergencia.
	
	public String toString () {
	return "Emergencia " + super.toString() + "..." + super.toString();
}
}
