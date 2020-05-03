public class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;				//Cliente titular = new Cliente();
	private static int totalContasAbertas = 0;	//Vari�vel Geral da Classe (compartilhada)
	
	public Conta(int agencia, int numero){
		
		if (agencia <= 0 && numero <= 0) {
			System.out.println("Ag�ncia ou Conta inv�lida");
			return;
		} else {
			Conta.totalContasAbertas++;
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("Conta criada com sucesso!");
			System.out.println("Ag�ncia: "+getAgencia());
			System.out.println("Conta: "+getNumero());
		}
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inv�lido");
			return;
		} else {
			this.saldo += valor;
			System.out.println("Dep�sito: "+getSaldo());
		}
	}	

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, 
			Conta origem,Conta destino) {
		if (this.saldo >= valor) {
			origem.saca(valor); //this.saldo -= valor;
			
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public static int getTotalContasAbertas() {
		return Conta.totalContasAbertas;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}