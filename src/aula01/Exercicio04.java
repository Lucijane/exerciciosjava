package aula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		 /*
        Encontrar o dobro de um número caso ele seja positivo e o seu triplo 
        caso seja negativo, imprimindo o resultado.
    */
    Scanner scan = new Scanner(System.in);
    int valor;
    
    System.out.print("Digite um valor: ");
    valor = scan.nextInt();
    
    if(valor>0){
        System.out.println(valor * 2);
    }else{
        System.err.println(valor * 3);
    }

	}

}
