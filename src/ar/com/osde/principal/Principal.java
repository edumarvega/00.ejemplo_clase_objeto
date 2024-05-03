package ar.com.osde.principal;

import ar.com.osde.modelo.Cubetera;

public class Principal {
	
	
	//metodo principal para ejecturar un programa java
	public static void main(String[] args) {
		
		//Aqui estoy creando un objeto hielo de tipo Cubetera
		Cubetera hielo = new Cubetera();
				
		//si el objeto tiene valor null, es decir que no se un new Cubetera
		//al querer acceder a cualquier metodo del objeto producira una NullPointerException
		//tener en cuenta esto es muy importante para evitar esta exception.
		
		//hielo = null;
		
		System.out.println("Largo: "+hielo.getLargo());
		
		System.out.println("Algo: "+hielo.getAlto());
		
	}

}
