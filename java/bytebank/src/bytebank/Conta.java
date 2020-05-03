package bytebank;

public class Conta {
	String titular;
	int agencia;
	int numero;
	double saldo;

	
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
}