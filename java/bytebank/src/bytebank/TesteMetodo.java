package bytebank;

public class TesteMetodo {

	public static void main(String[] args) {
		
		Conta contaAdriano = new Conta();
		contaAdriano.titular = "Adriano Matos";
		contaAdriano.saldo = 100;
		contaAdriano.deposita(50);
		System.out.println(contaAdriano.titular+" dep�sito realizado com sucesso");
		System.out.println("Seu novo saldo �: "+contaAdriano.saldo+"\n");
		
		if (contaAdriano.saca(70)) {
			System.out.println(contaAdriano.titular+" saque realizado com sucesso");
			System.out.println("Seu novo saldo �: "+contaAdriano.saldo+"\n");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		Conta contaRebeca = new Conta();
		contaRebeca.saldo = 500.5;

		if (contaRebeca.transfere(250, contaRebeca,contaAdriano)) {
			System.out.println("Transfer�ncia realizada para: "+contaAdriano.titular);
			System.out.println("Seu novo saldo �: "+contaRebeca.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

}
