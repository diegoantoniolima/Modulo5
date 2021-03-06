package Models;

public class Mesa {

	private Double largura;
	private Double comprimento;
	private String cor;
	private Boolean cadeiras;

	public Mesa(Double largura, Double comprimento, String cor, Boolean cadeiras) {
		super();
		this.largura = largura;
		this.comprimento = comprimento;
		this.cor = cor;
		this.cadeiras = cadeiras;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(Boolean cadeiras) {
		this.cadeiras = cadeiras;
	}
}
