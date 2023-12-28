package aula03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		 /*
        Desenvolva um algoritmo capaz de cadastrar o nome dos convidados para
        uma festa de Natal. A quantidade deverá ser informada pelo usuário. 
        Possibilite a exibição dos nomes cadastrados.
        
     */

    Scanner scan = new Scanner(System.in);
    int opcao, qtdConvidado;
    String[] bdConvidados = {""};

    do {
        System.out.println("**** Ceia de Natal ****");
        System.out.println("1- Cadastrar Convidados");
        System.out.println("2- Listar Convidados");
        System.out.println("3- Sair");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantos convidados deseja cadastrar?");
                qtdConvidado = scan.nextInt();

                bdConvidados = new String[qtdConvidado];

                for (int i = 0; i < bdConvidados.length; i++) {
                    System.out.printf("Nome do %dº Convidado: ", i+1);
                    bdConvidados[i] = scan.next();
                }
                break;
            case 2:
                if (bdConvidados[0].equals("")) {
                    System.out.println("Nenhum convidado cadastrado!");
                } else {
                    System.out.println("**** Lista de Convidados ****");
                    for (String nome : bdConvidados) {
                        System.out.println(nome);
                    }
                }
            case 3:
                System.out.println("Ate logo!");                    
                break;
            default: System.out.println("Opção Inválida!");
        }
    } while (opcao != 3);

	}

}
