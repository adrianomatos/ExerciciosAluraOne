
public class TesteSacaNegativo {

	public static void main(String[] args) {

		Conta novaConta = new Conta();
		novaConta.deposita(100);
		System.out.println(novaConta.saca(101));
		System.out.println(novaConta.getSaldo());
		
		//PROIBIDO
		//novaConta.saldo -= 101;
		//System.out.println(novaConta.saldo);
	}
}