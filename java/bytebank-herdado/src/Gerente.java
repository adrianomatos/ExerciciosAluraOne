public class Gerente extends Funcionario {
	private int senha = 1234;

	//POLIMORFISMO
	public double bonificacao() {
		System.out.println("Bonificação 50% Gerente: " + super.getSalario() * 0.5);
		return super.getSalario() * 0.5;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}