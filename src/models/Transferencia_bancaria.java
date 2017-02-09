package models;

public class Transferencia_bancaria {
	int numOrigen;
	int numDestino;
	float cantidad;
	String concepto;

	public Transferencia_bancaria(int numOrigen, int numDestino, float cantidad, String concepto) {
		super();
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.cantidad = cantidad;
		this.concepto = concepto;
	}

	public void transfe() {
		System.out.println("El dinerico va de " + numOrigen + " a " + numDestino);
	}

	public void catidad() {
		System.out.println("Y es " + cantidad);
	}

	public void concepto() {
		System.out.println("En concepto de " + concepto);
	}

}
