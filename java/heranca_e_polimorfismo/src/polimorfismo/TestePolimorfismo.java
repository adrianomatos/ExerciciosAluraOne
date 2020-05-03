package polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		ContaCorrente corrente = new ContaCorrente();
		corrente.setSaldo(1800);
		corrente.imprimirSaldo(corrente);
		System.out.println(corrente.getLimite());
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setSaldo(2000);
		poupanca.imprimirSaldo(poupanca);
		System.out.println(poupanca.getRendimentos());
		
		
	}

}
