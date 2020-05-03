package polimorfismo;

public abstract class Conta {
	
	private double saldo;	
	
	public void imprimirSaldo(Conta conta) {//STATIC ???
		System.out.println("Saldo: "+conta.getSaldo());
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}