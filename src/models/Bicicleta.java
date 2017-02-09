package models;

public class Bicicleta {
	private String marca;
	private int pasajeros;
	private String color;
	private int ruedas;
	
	public Bicicleta(String marca, int pasajeros, String color, int ruedas) {		
		this.marca = marca;
		this.pasajeros = pasajeros;
		this.color = color;
		this.ruedas = ruedas;		
	}
	
	public void tipo() {
		System.out.println("Tengo una bicicleta "+marca+" ");		
	}
	public void gente(){
		int gente = pasajeros*2;
		
		System.out.println("Van montados "+gente+ " pasajeros en la bici "+marca);				
	}
	public void locomocion(int r){
		ruedas=ruedas+r;
		System.out.println("Además tiene "+ruedas+" ruedas la bici "+marca);
		
	}

	public void Bicicleta1 (String marca, int pasajeros, String color, int ruedas) {		
		this.marca = marca;
		this.pasajeros = pasajeros;
		this.color = color;
		this.ruedas = ruedas;
	}
	
	public void colorcillo(){
		System.out.println("La bici "+marca+ " es de un bonito color "+color);
	}

	public void extremidades() {
		int piernas=pasajeros*2;
		int brazos=pasajeros*2;
		System.out.println("Van montados "+piernas+" piernas y "+brazos+" brazos en la bici "+marca);
		
	}

	
	
	
	

}
