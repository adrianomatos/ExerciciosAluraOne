
public class ControleBonificacao {
	private double soma;
	
	public void registraBonificacao(Funcionario f) {
		this.soma = this.soma + f.bonificacao();
	}

	public double getSomaBonificacao() {
		System.out.println("--------------------------");
		return soma;
	}
	
}
