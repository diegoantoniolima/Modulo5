package Models;

public class Geladeira {

	public String modelo;
	public String cor;
	public Double peso;
	
	public Geladeira(String modelo, String cor, Double peso) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.peso = peso;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	
	
}
