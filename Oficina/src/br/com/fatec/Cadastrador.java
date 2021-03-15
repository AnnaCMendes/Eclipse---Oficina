package br.com.fatec;

import java.util.ArrayList;

import br.com.fatec.processadores.Detalhador;

public class Cadastrador {
	public ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	private Detalhador detalhe = new Detalhador();
	
	public void detalharTodos() {
		if (veiculos.isEmpty()) {
			System.out.println("Não há veículos cadastrados");
		}else {	
			System.out.println("Imprimindo detalhes:");
			System.out.println("---------------------");
			// foreach - para cada
			// para cada veiculo dentro de veiculos
			for (Veiculo v : veiculos) {
				detalhe.detalhar(v);
				System.out.println("---------------------");
			}
			
		}
	}

}
