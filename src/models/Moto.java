package models;

public class Moto {
	float caballos;
	String matricula;
	boolean giroLlave;
	float gradosAcelerador;
	int ruedas;

	public Moto(int ruedas, float caballos, String matricula, boolean giroLlave, float gradosAcelerador) {
		super();
		this.ruedas = ruedas;
		this.caballos = caballos;
		this.matricula = matricula;
		this.giroLlave = giroLlave;
		this.gradosAcelerador = gradosAcelerador;
	}

	public void Arrancar() {
		System.out.println("Brum Brum" + ruedas);

	}

	public void Acelerar() {
		System.out.println("Acelero" + caballos + " " + matricula);
	}

	public void Frenar() {
		System.out.println("Freno" + giroLlave);
	}

	public void Parar() {
		System.out.println("Silencio" + gradosAcelerador);
	}
}
