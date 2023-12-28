package aula02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
        Uma empresa de remédios deseja construir um programa para gerenciar
        seu estoque de produtos. No sistema deve ser possível cadastrar os 
        produtos(nome, valor, quantidade), listar os produtos cadastrados e 
        atualizá-los quando necessário.
    
    */
    Scanner scan = new Scanner(System.in);
    int opcao, opcao1, qtdProduto1=0;
    double vlrProduto1=0;
    String nomeProduto1="";
    
    do{
        System.out.println("**** EMPRESA DE REMÉDIOS ****\n"
                + "1- Cadastrar Produtos\n"
                + "2- Listar Produtos\n"
                + "3- Atualizar Produto\n"
                + "4- Sair");

        System.out.println("Escolha uma opção: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("*** CADASTRO DE PRODUTOS ***");
                System.out.println("Nome do Produto: ");
                nomeProduto1 = scan.next();  

                System.out.println("Valor do Produto: ");
                vlrProduto1 = scan.nextDouble();

                System.out.println("Quantidade: ");
                qtdProduto1 = scan.nextInt();
                break;
            case 2:
                if(nomeProduto1.equals("")){
                    System.out.println("Nenhum produto cadastrado!");
                }else{
                    System.out.printf("*** PRODUTOS CADASTRADOS ***\n"   + "Nome do Produto: %s\nValor: R$ %.2f\nQuantidade: %d\n", nomeProduto1, vlrProduto1, qtdProduto1);
          
                }
                break;
            case 3:
                if(nomeProduto1.equals("")){
                  System.out.println("Nenhum produto cadastrado!");  
                }else{
                    System.out.println("*** ATUALIZAÇÃO DE PRODUTOS ***\n"
                            + "1- Nome\n"
                            + "2- Valor\n"
                            + "3- Quantidade\n");
                    System.out.println("Escolha uma opção para atualizar: ");
                    opcao1 = scan.nextInt();

                    switch (opcao1) {
                        case 1:
                            System.out.println("Novo nome do produto: ");
                            nomeProduto1 = scan.next();
                            break;
                        case 2:
                            System.out.println("Novo valor do produto: ");
                            vlrProduto1 = scan.nextDouble();
                            break;
                        case 3:
                            System.out.println("Nova quantidade: ");
                            qtdProduto1 = scan.nextInt();
                        default:
                            System.out.println("Opção Inválida!");
                    }  
                } 
                break;
            case 4:
                System.out.println("Bye :)");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }while(opcao!=4);  

	}

}
