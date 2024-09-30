package sistemabancario;

public class TesteBanco {

	public static void main(String[] args) throws SaldoInsuficienteException, MinhaExcecaoException {
		ContaCorrente a1 = new ContaCorrente("12253", 2552.2, 1000);
		ContaPoupança a2 = new ContaPoupança("12552", 3005.5, 10);
		
		
		a1.depositar(0);
		a1.sacar(4000);
		a1.mostrarValores();
		
		a2.mostrarValores();
	}
}
