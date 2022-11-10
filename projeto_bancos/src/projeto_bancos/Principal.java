package projeto_bancos;

public class Principal {

	public static void main(String[] args) {
		
		
		Clientes cliente1 = new Clientes();
		
		cliente1.conta = new Conta(); // Liga a classe com o objeto
		cliente1.nome = "Matheus";
		cliente1.numeroCPF = 1234;
		cliente1.conta.numero = 9999;
		cliente1.conta.saldo = 1299.00;
		
		
		Conta conta1 = new Conta();
		conta1.numero = 8888;
		conta1.saldo = 999.00;
		
		//____________________________________________________________________
		
		Clientes cliente2 = new Clientes();
		cliente2.conta = conta1;
		cliente2.nome = "Guilherme";
		cliente2.numeroCPF = 1234;
		cliente2.conta.numero = 9090;
		cliente2.conta.saldo = 9000.00;
		
		
		Conta conta2 = new Conta();
		conta2.numero = 9999;
		conta2.saldo = 999.00;
		
		//_________________________________________________________________________
		
		
		
	
	}

}
