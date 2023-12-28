package aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double media=0, nota1,nota2;
		int cont=1;
		
		do {
			System.out.println("Digite a nota 1 do "+cont+"º aluno");
			nota1 = scan.nextDouble();
			
			System.out.println("Digite a nota 2 do "+cont+"º aluno");
			nota2 = scan.nextDouble();
			
			media = (nota1+nota2)/2;
			
			System.out.println("A media do: "+(cont)+"º aluno é: "+media);
			cont++;
			
		}while(cont < 3);		
	}

}
