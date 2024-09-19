package aplicacao;

import java.util.Scanner;

import arvores.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar");
			System.out.println("3 - Apresentar quantidade de nos");
			System.out.println("4 - Pesquisa a existencia de um valor na ABB");
			System.out.println("5-apresenta a quantidade de comparacoes para mostarr um valor");
			System.out.println("6- Remover um valor");
			System.out.println("7- MAXIMO VALOR");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa!");
				break;
			case 1:
				System.out.print("Dado a ser inserido na ABB: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n*** Apresentacao da ABB ***");
				abb.show(abb.root);
				System.out.println();
				break;
			case 3:
				System.out.println("Quantidade de nos na ABB: " + abb.contaNos(abb.root, 0));
				break;
			case 4:
				System.out.print("Dado a ser pesquisado na ABB: ");
				valor = le.nextInt();
				if (abb.consulta(abb.root, valor))
					System.out.println("Valor foi encontrado na ABB");
				else
					System.out.println("Valor NAO foi encontrado na ABB");
				break;
			case 5:
				System.out.println("Daddo a ser pesquisado na ABB");
				valor = le.nextInt();
				int contador = abb.contaConsulta(abb.root, valor, 0);
				System.out.println("Quantidade de comparacoes realizadas na abb" + contador);
				break;
			case 6: 
				System.out.println("Dado a ser removido");
				valor = le.nextInt();
				abb.root = abb.removeValor(abb.root, valor);
				
				break;
			case 7: 
				if(abb.root != null)
				System.out.println("Máximo valor" + abb.maximo());
				else
					System.out.println("abb vazia");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);
		le.close();

	}

}
