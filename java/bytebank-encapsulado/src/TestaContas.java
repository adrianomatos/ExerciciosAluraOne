public class TestaContas {
	public static void main(String[] args) {
		
		Conta conta = new Conta(11550, 357863);
		conta.deposita(1250);
		System.out.println();
		
		Conta outraConta = new Conta(11550, 357864);
		outraConta.deposita(250);	
		
		System.out.println("\nTotal de contas: "+Conta.getTotalContasAbertas());
	}
}