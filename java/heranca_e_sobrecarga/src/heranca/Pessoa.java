package heranca;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	private boolean estaAposentado = false;
	
	public void seApresentar(String nome) {
		System.out.println(this.nome + " se apresentou!");
	}
	
	public void dizerSeEstaAposentado() {
		System.out.println("Está aposentado? " + estaAposentado);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
