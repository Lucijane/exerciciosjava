package aula01;

public class Aula01 {

	public static void main(String[] args) {
		double media = 5.0, frequencia = 80.0;
	     
	     
	     //ESTRUTURA CONDICIONAL SIMPLES
	     if(media>=7)
	        System.out.println("APROVADO!");
	    
	    //ESTRUTURA CONDICIONAL COMPOSTA
	     if(media>=7)
	        System.out.println("APROVADO!");
	     else
	        System.out.println("REPROVADO!");
	    
	    //ESTRUTURA CONDICIONAL ENCADEADA
	    if(media>=7 && frequencia>=75){
	        System.out.println("APROVADO!");
	        if(media>=9){
	            System.out.println("ALUNO DESTAQUE!");
	        }
	    }else{
	        if(media>=7 && frequencia>=60){
	           System.out.println("CONSELHO DE CLASSE!"); 
	        }else{
	            System.out.println("REPROVADO!");
	        }
	    }  

	}

}
