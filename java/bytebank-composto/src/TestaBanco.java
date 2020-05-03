
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente adriano = new Cliente();	//ASSIM
		adriano.nome = "Adriano Matos";
		adriano.cpf = 12345;
		adriano.profissao = "Programador";
		
		Conta contaDoAdriano = new Conta(); 
		contaDoAdriano.deposita(100);
		
		//Associa o cliente à conta
		contaDoAdriano.titular = adriano;
		System.out.println(contaDoAdriano.titular.nome);
	}
}