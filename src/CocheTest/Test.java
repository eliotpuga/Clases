package CocheTest;

import models.Bicicleta;
import models.Coche;
import models.Moto;
import models.Perro;
import models.Transferencia_bancaria;

public class Test {

	public static void main(String argd[]) {
		/* Coche carro = new Coche(4, 120.5, "8995 fgg", true, 60);
		carro.Arrancar();
		carro.Acelerar();
		carro.Frenar();
		carro.Parar();
		
		Moto vespino=new Moto(0, 0, null, false, 0);
		vespino.Acelerar();
		vespino.Arrancar();
		vespino.Frenar();		
		vespino.Parar();
		
		Perro caniche =new Perro(null, 0, 0);
		caniche.comida();
		caniche.veterinario();
		
		Transferencia_bancaria alquiler = new Transferencia_bancaria(0, 0, 0, null);
	
		alquiler.transfe();	
		alquiler.catidad();
		alquiler.concepto();*/
		
		Bicicleta guay=new Bicicleta("buena",0,"azul",0); // marca, pasajeros, color, ruedas
		Bicicleta mala=new Bicicleta("mala", 0, "negro", 0);
		guay.tipo();
		guay.gente();
		guay.colorcillo();
		guay.locomocion(4);
		guay.extremidades();
		mala.colorcillo();
		mala.extremidades();
		mala.tipo();		
		mala.gente();
		
		
		
		
	}
}
