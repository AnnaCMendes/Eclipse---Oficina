package br.com.fatec.app;

import br.com.fatec.Cadastrador;
import br.com.fatec.Carro;
import br.com.fatec.Lambreta;
import br.com.fatec.processadores.Detalhador;

public class STRAT {
	public static void main(String[] args) {
		Lambreta lb = new Lambreta("ABC-1250", "scooter-1980");
		lb.cor = "Azul";
		
		
		Carro cr = new Carro("JWV-4029","ford-1970");
		cr.cor = "Vermelho";
		
		Cadastrador cd = new Cadastrador();
		cd.veiculos.add(lb); 
		cd.veiculos.add(cr);
		
		
		cd.detalharTodos(); 
	

	}
}
