package sistemabancario;

public abstract class ContaBancaria implements MovimentacaoBancaria {

	private String numeroConta;
	private double saldo;
	
	public ContaBancaria(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(valor <= saldo) {
			valor -= saldo;
			} else {
				throw new SaldoInsuficienteException("Não foi possível sacar o valor...");
			}
		
	}
	public void mostrarValores() {
		System.out.println("Conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
	}
}

