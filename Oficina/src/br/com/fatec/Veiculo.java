package br.com.fatec;

// abstract - classe que não pode ser instanciada, que não posso cirar um objeto dela
// aplicada na herança e no polimorfismo

// Alt + shift + s + r = para gerar os gets e sets no projeto automaticamente


public  abstract class Veiculo {
	private String placa;
	private String modeloFabricacao;
	public String cor;
	
	public Veiculo(String placa, String modeloFabricacao) {
		//super();
		this.placa = placa;
		this.modeloFabricacao = modeloFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModeloFabricacao() {
		return modeloFabricacao;
	}
	
	

	
	
}
