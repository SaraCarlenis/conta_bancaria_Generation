package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		sobre();
		
		int opcao = -1;
		
		//Instanciar Objetos da Clsse Conta
		
		Conta c1 = new Conta(1, 123, 1, "Sara", 200000.00f);
		c1.visualizar();
		
		Conta c2 = new Conta(5, 456, 2, "Lenys", 1500.00f);
		c1.visualizar();
		

		System.out.println("\nSacar R$ 1.000,00 da conta C2: " + (c2.sacar(1000.00f) ?
				"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		
		System.out.println("\nSacar R$ 500.000,00 da conta C2: " + (c2.sacar(1000.00f) ?
				"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		c2.visualizar();
		c2.depositar(50000.00f);
		c2.visualizar();
		/**
		 * if ternário
		 * condição ? é como se fosse if
		 * : açao se for verdadeoro
		 * : açao se for falso
		 */
		
		
		
		/*System.out.println(c1.getTitular());
		System.out.println(c1.getSaldo());
		System.out.println(c1.getTipo());*/
		
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
				System.out.println("Criar conta!\n\\n");		
				break;
			
			case 2: 
					System.out.println("Lista das as Contas:");
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

}
