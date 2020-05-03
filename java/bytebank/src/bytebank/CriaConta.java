package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.89;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100.25;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 200.25;
		System.out.println("\n"+segundaConta.saldo);
	}
}
