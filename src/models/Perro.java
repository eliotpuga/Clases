package models;

public class Perro {
	String raza;
	int anios;
	float peso;

	public Perro(String raza, int anios, float peso) {
		super();
		this.raza = raza; // no se puede inicializar aquí
		this.anios = anios;
		this.peso = peso;
	}

	public void comida() {
		System.out.println("La raza " + raza + " debe comer mucho siempre que pese menos de " + peso + " kilos.");
	}

	public void veterinario() {
		System.out.println("Con la edad de " + anios + " ya deberia saber hablar.");
	}
}
