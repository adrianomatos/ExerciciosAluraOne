public class Teste {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(2000);
		if (gerente.autentica(1234)) {
			System.out.println("Login com sucesso!\n");
		} else {
			System.out.println("Falha no login!\n");
		}
		
		Designer designer = new Designer();
		designer.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registraBonificacao(gerente);
		controle.registraBonificacao(designer);
		System.out.println("Total bonificacao: " + controle.getSomaBonificacao());
		
	}
}