import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

		int		numeroConta;
		String	agenciaConta;
		String	nomeUsuario;
		int		saldoConta;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Por favor, insira o número da conta");
		numeroConta = myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("Agora, digite a sua agência");
		agenciaConta = myScanner.nextLine();
		System.out.println("Digite seu nome completo");
		nomeUsuario = myScanner.nextLine();
		System.out.println("Pra finalizar, digite o saldo da conta");
		saldoConta = myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma" +
		" conta em nosso banco, sua agência é " + agenciaConta + ", conta " +
		numeroConta + " e seu saldo de R$" + saldoConta + ".00 já está disponível" +
		" para saque");
		myScanner.close();
	}
}
