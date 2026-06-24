package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.controler.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();
	
	public static void main(String[] args) {
		
		sobre();
		 //Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(3, 001, 1, "Sara", 2000.00f, 2000.00f);
		cc1.visualizar();
		System.out.println("\nSacar R$ 5.000,00 da conta cc1: " + (cc1.sacar(50000.00f) ?
				"Saque efetuado com sucesso!" : "Saldo Insuficiente | Saldo disponível: " + cc1.getSaldo()));
		
		//Conta Poupanca
		ContaPoupanca cp1 = new ContaPoupanca(4, 001, 2, "Michell", 5000.00f, 30);
		cp1.visualizar();
		System.out.println("\nSacar R$ 3.000,00 da conta cp1: " + (cp1.sacar(3000.00f) ?
				"Saque efetuado com sucesso!" : "Saldo Insuficiente | Saldo disponível: " + cp1.getSaldo()));
		
		cp1.depositar(30000.00f);
		System.out.println("Atualizando valor do usuário: " + cp1.getTitular() + ": " + cp1.getSaldo());
		
		int opcao = -1;
		
		criarContasTestes();
		
		while(opcao != 0) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + 
					"*****************************************************");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1 :
				System.out.println("Criar conta!\n");		
				break;
			
			case 2: 
					System.out.println("Lista das as Contas:");
					listarContas();
				break;
				
			case 3:
				System.out.println("Buscar Conta por Numero\n\n");
				break;
				
			case 4:
				System.out.println("Atualizar Dados da Conta\n\n");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE  + "Sacar!\n\n");
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Sacar\n\n");
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferir valores entre Contas");
				break;
				
			case 0:
				System.out.println(Cores.TEXT_WHITE + "Volte sempre!");
				break;
				
				default: 
					System.out.println(Cores.TEXT_RED_BOLD + "Ops, opção incorreta. Tente novamente!" + Cores.TEXT_RESET);
			}
				
		}
		
		leia.close();
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************\n");
		System.out.println("Projeto Desenvolvido por: Sara Hurtado\n");
		System.out.println("Generation Brasil - sarac@genstudents.org\n");
		System.out.printf("Repositorio no GitHub: \nhttps://github.com/SaraCarlenis/conta_bancaria_Generation\n");
		System.out.println("\n*********************************************************");
	}
	
	public static void criarContasTestes() {
		contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
	
	public static void listarContas() {
		contaController.listarTodas();
	}

}
