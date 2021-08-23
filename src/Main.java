
public class Main {

	public static void main(String[] args) {
		Correntista correntista1 = new Correntista("2345678","João da Silva");
		correntista1.saldo = 100;
		correntista1.Sacar(12.5);
		correntista1.Sacar(7.25);
		correntista1.Depositar(51.76);
		correntista1.VisualizarSaldo();
	}

}
