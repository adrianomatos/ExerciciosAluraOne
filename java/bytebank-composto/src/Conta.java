

public class Conta {
	int agencia;
	int numero;
	private double saldo;
	Cliente titular;
	//Cliente titular = new Cliente();

	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}

	
	public boolean transfere(double valor, 
			Conta origem,Conta destino) {
		if (this.saldo >= valor) {
			origem.saca(valor); //this.saldo -= valor;
			
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}