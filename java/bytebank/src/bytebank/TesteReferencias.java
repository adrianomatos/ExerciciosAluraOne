package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.89;
		System.out.println("1� conta: "+primeiraConta.saldo);
		
		Conta segundaConta  = primeiraConta;
		System.out.println("2� conta: "+segundaConta.saldo);
		segundaConta.saldo += 100;
		System.out.println("2� conta: "+segundaConta.saldo);
		
		System.out.println("1� conta: "+primeiraConta.saldo);
	}

}
