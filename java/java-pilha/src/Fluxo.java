
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("*** Início do main");
		try {
			metodo1();
		} catch (ArithmeticException ex) {
			//Tratamento do erro
			String msg = ex.getMessage();
			System.out.println("\nErro do tipo: ArithmeticException");
			System.out.println("Mensagem do erro: " + msg);
			System.out.println("Fluxo do erro:");
			ex.printStackTrace();
		}
		System.out.println("*** Fim do main");
	}

	private static void metodo1() {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Início do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0; // ONDE OCORRE O ERRO
		}
		System.out.println("Fim do metodo2");
	}

}
