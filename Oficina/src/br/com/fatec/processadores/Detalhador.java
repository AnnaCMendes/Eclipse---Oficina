package br.com.fatec.processadores;

import br.com.fatec.Veiculo;

public class Detalhador {
	//default - bloqueia o acesso a nivel de pacote
	// polimorfismo - posso aplicar nas minhas variaveis 
	// Estrutura para criar objeto - Tipo nome_variavel = new Contrutor(Parametros)
	
	
	
	
	public static void detalhar(Veiculo v) {
		
		System.out.println("Placa:" +v.getPlaca());
		System.out.println("Modelo de Fabricação:" +v.getModeloFabricacao());
		System.out.println("Cor:" +v.cor);
		
	}

}
