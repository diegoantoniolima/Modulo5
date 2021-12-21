package Models;

public class ObjetosCasa {

	private Geladeira geladeira;
	private Mesa mesa;

	public ObjetosCasa(Geladeira geladeira, Mesa mesa) {
		super();
		this.geladeira = geladeira;
		this.mesa = mesa;
	}

	public Geladeira getGeladeira() {
		return geladeira;
	}

	public void setGeladeira(Geladeira geladeira) {
		this.geladeira = geladeira;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
