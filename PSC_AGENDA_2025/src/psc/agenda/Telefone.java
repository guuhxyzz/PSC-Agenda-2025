package psc.agenda;

public class Telefone {
	private int ddd;
	private int numero;
	
	public Telefone(int ddd, int numero) {
		this.setDdd(ddd);
		this.setNumero(numero);
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "(" + ddd + ") " + numero;
	}
	
}
