import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
       int num1, num2, num3;
       
       System.out.println("Ol�, me d� 3 medidas de um triangulo, que eu irei classificar para voc� que tipo de tri�ngulo ele �");
       System.out.println("Me d� a primeira medida:");
		num1 = leitor.nextInt();	
		
		System.out.println("Me d� a segunda medida:");
		num2 = leitor.nextInt();
		
		System.out.println("Me d� a terceira medida:");
		num3 = leitor.nextInt();
		
		
		
		if (num1 == num2 & num2 == num3) {
			
			System.out.println("O seu tri�ngulo tem as tr�s medidas iguais, ent�o ele � um equil�tero");
		
		
	} else if (num1 == num2 || num1 == num3 || num2 == num3) {	
		
	System.out.println("O seu tri�ngulo tem dois lados iguais, ent�o ele � um is�sceles. ");
		
		
	} else if (num1 != num2 && num2 != num3)  {
		System.out.println("O seu tri�ngulo tem tr�s lados diferentes, ent�o ele � um escaleno. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
}