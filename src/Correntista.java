
public class Correntista {
	String id;
	String nome;
	double saldo;
	
	Correntista(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	void Sacar(double quantia) {
		this.saldo -= quantia;
		if (this.saldo>0) {
			//System.out.println("Cuidado: Saldo Negativo!");
		}
	}
	
	void Depositar(double quantia) {
		this.saldo += quantia;
	}
	
	void VisualizarSaldo() {
		System.out.println("Saldo na Conta Corrente: R$" + this.saldo);
	}
}
