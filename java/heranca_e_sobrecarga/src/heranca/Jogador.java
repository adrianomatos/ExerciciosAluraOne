package heranca;

public class Jogador extends Pessoa{
	
	//MÉTODO SOBREPOSTO À SUPERCLASSE (sobreposição)
	public void seApresentar(String nome) {
		super.seApresentar(nome);  //método da superclasse
		System.out.println(this.nome + " pronto o show!");
	}
}
