
public class Designer extends Funcionario{
	
	//POLIMORFISMO
	public double bonificacao() {
		System.out.println("Bonificação 25% Designer: " + super.getSalario() * 0.25);
		return super.getSalario() * 0.25;
	}
}
