package heranca;

public class HerancaTeste {
	public static void main(String[] args) {
		
		Jogador jogador = new Jogador();
		jogador.nome = "Robinho";
		jogador.idade = 33;
		System.out.println("Jogador " + jogador.nome + " tem " + jogador.idade + " anos!");
		jogador.seApresentar(jogador.nome);
		//jogador.seApresentar("Robinho"); // Redund�ncia
		
		Tecnico tecnico = new Tecnico();
		tecnico.nome = "Felip�o";
		tecnico.idade = 66;
		System.out.println("\nT�cnico " + tecnico.nome + " tem " + tecnico.idade + " anos!");
		tecnico.dizerSeEstaAposentado();
		tecnico.seApresentar(tecnico.nome);
		tecnico.cpf = 123;
		tecnico.rg = 456;
		tecnico.salario = 49000.90;
		
		/* 
		N�o funciona no sentido inverso, n�o existe pq a heran�a � somente em 01 sentido
		Pessoa pessoa = new Pessoa();
		pessoa.dizerSeEstaAposentado();
		*/		
	}
}
