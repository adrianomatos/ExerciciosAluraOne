package heranca;

public class Jogador extends Pessoa{
	
	//M�TODO SOBREPOSTO � SUPERCLASSE (sobreposi��o)
	public void seApresentar(String nome) {
		super.seApresentar(nome);  //m�todo da superclasse
		System.out.println(this.nome + " pronto o show!");
	}
}
