package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao = -1;
		
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
				System.out.println(Cores.TEXT_WHITE + "Volte sempre!" );
				break;
				
				default: 
					System.out.println(Cores.TEXT_RED_BOLD + "Ops, opção incorreta. Tente novamente!" + Cores.TEXT_RESET);
			}
				
		}
		
		leia.close();
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Sara");
		System.out.println("Generation Brasil - sarac@genstudents.org");
		System.out.printf("Repositorio no GitHub: \nhttps://github.com/SaraCarlenis/conta_bancaria_Generation");
		System.out.println("*********************************************************");
	}

}
