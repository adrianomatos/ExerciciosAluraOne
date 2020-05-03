
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta novaConta = new Conta();
		novaConta.titular = new Cliente();			// OU ASSIM	
		novaConta.titular.nome = "Maria Consuelha";
		System.out.println(novaConta.titular.nome);
	}
}