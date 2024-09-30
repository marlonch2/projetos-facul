package sistemabancario;

public class ContaPoupança extends ContaBancaria {

	private double taxaRendimento;
	public ContaPoupança(String numeroConta, double saldo, double taxaRendimento) {
		super(numeroConta, saldo);
		this.taxaRendimento = taxaRendimento;
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public double calcularRendimento() {
		return this.getSaldo() * (this.taxaRendimento / 100);
	}
	
	public void mostrarRendimento() {
		System.out.println(calcularRendimento());
	}
	private double mostrarSaldoComRendimento() {
		return calcularRendimento() + this.getSaldo();
	}
	
	
	public void mostrarValores() {
		System.out.println("Conta: " + this.getNumeroConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Valor do saldo adicionado com o rendimento: " + mostrarSaldoComRendimento());
	}
}
