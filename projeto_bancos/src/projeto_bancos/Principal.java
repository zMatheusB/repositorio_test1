package projeto_bancos;

public class Principal {

	public static void main(String[] args) {
		
		
		Clientes cliente1 = new Clientes("Matheus");
		
		cliente1.conta = new Conta(); // Liga a classe com o objeto
		cliente1.conta.numero = 9999;
		System.out.println(cliente1.nome);
		System.out.println(cliente1.numeroCPF);
		System.out.println(cliente1.conta.getSaldo());
		
		
		Conta conta1 = new Conta();
		conta1.numero = 8888;
		Clientes cliente2 = new Clientes("Guilherme");
		
		cliente2.conta = conta1;
		Clientes cliente3 = new Clientes("Juliano");
		
		//____________________________________________________________________
		
		System.out.println(cliente1.conta.getSaldo());
		cliente1.conta.setSaque(100); // Correta!
		System.out.println(cliente1.conta.getSaldo());
		
		//____________________________________________________________________
		Clientes clienteA = new Clientes("Victor");
		clienteA.numeroCPF = 1111;
		clienteA.conta = new Conta();
		System.out.println(clienteA.conta.numero);
		
		//____________________________________________________________________
		Clientes clienteB = new Clientes("Carlos");
		clienteB.numeroCPF = 2222;
		clienteB.conta = new Conta();
		System.out.println(clienteB.conta.numero);
		
		
	}

}
