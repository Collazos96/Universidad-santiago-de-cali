
package ACTIVIDADES;

public class Operaciones 
{

	public double calcularIMC(Persona p) {
	
	double operacion =  p.getPeso()/ Math.pow (p.getAltura(),2);
			System.out.println("el IMC de la persona " + p.getNombre()+"es:"+operacion);
			return operacion;

}

}
