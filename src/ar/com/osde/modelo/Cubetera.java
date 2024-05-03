package ar.com.osde.modelo;

// la palabra class se utiliza para definir una clase en java
public class Cubetera {
	
	//la visibilidad private sirve para encapzular los atributos de una clase
	private Double largo; // por default cualquier valor de un atributo de cualquier tipo de clase es valor null
	private double alto;  // por defaul la variable primitiva double vale 0.0
	private double profundida; // por defaul la variable primitiva double vale 0.0
	
	//Constructor vacio utilizado cuando se instancia un objeto de tipo Cubetera
	// ... new Cubetera()
	public Cubetera() {
		
	}

	
	//metodos getter y setters sirven para acceder a los atributos de una clase
	//atributos que estan encapsulados por la visibilidad private.
	
	public Double getLargo() {
		return largo;
	}

	public void setLargo(Double largo) {
		this.largo = largo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getProfundida() {
		return profundida;
	}

	public void setProfundida(double profundida) {
		this.profundida = profundida;
	}


}
