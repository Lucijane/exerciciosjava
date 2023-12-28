package aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
        Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
        somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
        atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
        */
		
		Scanner scan = new Scanner(System.in);
	      
	      int a, b, c;
	      
	        System.out.print("Digite um valor para a:");
	        a = scan.nextInt();
	        System.out.print("Digite um valor para b:");
	        b = scan.nextInt();
	                
	       if(a == b){
	           c = a + b;
	       }else{
	           c = a * b;
	       }
	       
	       System.out.println(c);

	}

}
