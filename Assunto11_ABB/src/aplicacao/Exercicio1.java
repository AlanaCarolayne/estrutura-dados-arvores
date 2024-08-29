package aplicacao;

import java.util.Scanner;

import arvores.ABBInt;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ABBInt abb = new ABBInt();
		int opcao;
		do {
			System.out.println("0- sair");
			System.out.println("1-inserir");
			System.out.println("2-apresentar");
			System.out.println("3- apresentar quantidade de nos");
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrando o programa!");
				break;
			case 1:
				System.out.println("Dado a ser inserido na ABB");
				int valor = sc.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println(" ------------Apresentação da ABB ------------");
				abb.show(abb.root);
				System.out.println();
				break;
				
			case 3:
				System.out.println("Quantidade de nos na ABB " + abb.contaNos(abb.root, 0));
				
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);
		sc.close();

	}
}
