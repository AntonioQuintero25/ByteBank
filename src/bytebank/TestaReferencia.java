package bytebank;

public class TestaReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta);
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		//Primeira conta e segunda conta s�o os mesmo objeto
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o iguais");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
