package ACTIVIDADES;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
	
	Scanner se = new Scanner (System.in);
	System.out.println("Ingrese los datos de la persona");
	
	Persona p = new Persona();
	p.setNombre(se.next());
	
	System.out.println("Ingrese la altura");
	p.setAltura(se.nextDouble());
	
	System.out.println("Ingrese el peso");
	p.setPeso(se.nextDouble());
	
	Operaciones o=new Operaciones();
	o.calcularIMC(p);
	
	
}
}
