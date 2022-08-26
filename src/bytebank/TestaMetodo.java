package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaSuelen = new Conta();
		contaDaSuelen.depositar(100);
		System.out.println(contaDaSuelen.saldo);
		contaDaSuelen.depositar(5);
		System.out.println(contaDaSuelen.saldo);
		
		contaDaSuelen.sacar(50);
		System.out.println(contaDaSuelen.saldo);
		
		Conta contaAntonio = new Conta();
		
		contaDaSuelen.transferencia(50, contaAntonio);
		
		System.out.println(contaAntonio.saldo);
		
	}
}
