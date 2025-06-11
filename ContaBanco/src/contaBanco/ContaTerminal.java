package contaBanco;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {		
		var scanner = new Scanner(System.in);

		System.out.println("Por favor, digite o número da conta!");
		int numConta = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da agência!");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite seu nome!");
		scanner.nextLine();
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o valor do saldo!");
		double saldo = scanner.nextFloat();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numConta, saldo);
		scanner.close();
	}

}
