package br.com.fatec;

// abstract - classe que n�o pode ser instanciada, que n�o posso cirar um objeto dela
// aplicada na heran�a e no polimorfismo

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
