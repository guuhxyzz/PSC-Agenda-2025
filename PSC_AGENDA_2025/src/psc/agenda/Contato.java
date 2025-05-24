package psc.agenda;

public class Contato extends Pessoa {
	
	private Telefone numero;
	
	public Contato(String nome, String sobrenome, int ddd, int numero) {
		super(nome, sobrenome);
		this.numero = new Telefone(ddd, numero);
	}

	public Telefone getNumero() {
		return numero;
	}

	public void setNumero(Telefone numero) {
		this.numero = numero;
	}
	
	public String exibirContato() {
		return "Nome: " + this.getNome() + " " +this.getSobrenome() + "\nNúmero: (" + this.numero.getDdd() + ") " + this.numero.getNumero();
	}
	
}
