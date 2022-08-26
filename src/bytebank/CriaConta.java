package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 23.56;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		segundaConta.titular = "Antonio Quintero";
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.titular);
	}
}
