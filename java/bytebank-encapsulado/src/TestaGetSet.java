public class TestaGetSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(11550, 357863);
		
		/*Cliente cliente = new Cliente();	//ATRIBUI O CLIENTE À CONTA
		cliente.setNome("Teste");
		System.out.println(cliente.getNome());
		conta.setTitular(cliente);
		...........................*/

		conta.setTitular(new Cliente());	//ATRIBUI O CLIENTE À CONTA
		conta.getTitular().setNome("Adriano");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());

	}
}