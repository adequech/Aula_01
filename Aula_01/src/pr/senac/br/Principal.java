package pr.senac.br;

public class Principal {

	public static void main(String[] args) {
	    Cliente cliente_01 = new Cliente();
	    Cliente cliente_02 = new Cliente();
	    Cliente cliente_03 = new Cliente();
	    Cliente cliente_04 = new Cliente();

	    cliente_01.cpf = "028504359021";
	    cliente_01.anoNascimento = 1980;
	    cliente_01.nome = "Marcos da Rocha Souza";
	    cliente_01.email = "mr_souza@gmail.com";

	    cliente_02.cpf = "03510400902";
	    cliente_02.anoNascimento = 1985;
	    cliente_02.nome = "Ana Clara Marques";
	    cliente_02.email = "aninha@gmail.com";

	    cliente_03.cpf = "04564238906";
	    cliente_03.anoNascimento = 1975;
	    cliente_03.nome = "Pedro de Alcantara";
	    cliente_03.email = "pedro_75@gmail.com";

	    cliente_04.cpf = "05438698403";
	    cliente_04.anoNascimento = 1986;
	    cliente_04.nome = "Roseane Brito";
	    cliente_04.email = "brito@gmail.com";

	    Conta conta_01 = new Conta();
	    Conta conta_02 = new Conta();
	    Conta conta_03 = new Conta();
	    Conta conta_04 = new Conta();
	    Conta conta_05 = new Conta();
	    Conta conta_06 = new Conta();

	    conta_01.numero = 1520;
	    conta_01.saldo  = 750.63f;
	     
	    conta_02.numero = 1314;
	    conta_02.saldo  = 10.36f;

	    conta_03.numero = 2368;
	    conta_03.saldo  = 1523.00f;

	    conta_04.numero = 3568;
	    conta_04.saldo  = -50.45f;

	    conta_05.numero = 2224;
	    conta_05.saldo  = 91.23f;

	    conta_06.numero = 1019;
	    conta_06.saldo  = -70.35f;  

	}

}
