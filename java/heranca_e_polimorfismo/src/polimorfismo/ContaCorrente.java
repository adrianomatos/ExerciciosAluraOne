package polimorfismo;

public class ContaCorrente extends Conta implements Tributavel{
	
	private double limite = 1000;

	public double getLimite() {
		return limite;
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
}