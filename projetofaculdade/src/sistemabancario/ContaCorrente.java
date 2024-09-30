package sistemabancario;

public class ContaCorrente extends ContaBancaria {

	private double limiteChequeEspecial;
	public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial) {
		super(numeroConta, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorTot = this.getSaldo() + this.limiteChequeEspecial;
		if(valorTot >= valor) {
			this.setSaldo(this.getSaldo() - valor);
		} else {
			throw new SaldoInsuficienteException("Não foi possível sacar o valor...");
		}
	}
	public void mostrarValores() {
		System.out.println("Conta: " + this.getNumeroConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Valor máximo do cheque especial: " + this.limiteChequeEspecial);
	}	
}