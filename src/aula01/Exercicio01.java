package aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String nome, sexo, estadoCivil;
	        
	        System.out.print("Digite o seu nome: ");
	        nome = scan.next();
	        System.out.print("Digite o seu sexo [F] ou [M]: ");
	        sexo = scan.next();
	        System.out.println("Digite o seu estado civil [CASADO] ou [SOLTEIRO]");
	        estadoCivil = scan.next();
	               
	        
	        if(sexo.equals("F") && estadoCivil.equals("CASADO")){
	            System.out.println(scan.next());            
	        }
	      scan.close();
	}

}
