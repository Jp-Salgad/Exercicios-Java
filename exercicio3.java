import java.util.Scanner;


public class exercicio3 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		double num;
		double num1,r1, rp = 0, r2;
		
		System.out.println("Ol�, a empresa ir� fazer um aumento no seu sal�rio.");
		System.out.println("Ent�o, por favor, digite o seu sal�rio, que eu irei mostrar o seu aumento:");
		num = leitor.nextDouble();	

		
		if (num >=0 && num <= 1000) {
			
			num1 = (double) (num * 15)/100;
		    r1 = (double) (num + num1);
		    System.out.println("Muito bem, o seu sal�rio atual agora � de: "+r1);
	
		
		} else if (num >=1000 && num <= 2500) {	
		rp = (double) (num * 7)/100;
		r2 = (double) (num + rp);
	System.out.println("Muito bem, o seu sal�rio atual agora � de: "+r2);
		
		
	} else {
		System.out.println("O seu sal�rio � "+num+", ent�o, voc� n�o receber� o aumento. ");	
	
			
			 
	   
				 
				 
	
			
				 
			 
			 	
	 		 
			 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	}
}
