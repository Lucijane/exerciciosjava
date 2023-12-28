package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		 /*
        Faça um algoritmo para receber um número qualquer e informar 
        na tela se é par ou ímpar.
        */
		
		Scanner scan = new Scanner(System.in);
        int valor;
        
        System.out.print("Digite um valor: ");
        valor = scan.nextInt();
        
        if(valor % 2 == 0)
            System.out.println("PAR!");
        else
            System.out.println("ÍMPAR");
        
        scan.close();
	}
	
}
