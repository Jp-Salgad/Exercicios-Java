import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
       float num1, num2, num3, num4;
       float m1, m2;
       
       System.out.println("Ol�, eu irei fazer a sua m�dia de f�sica. Ent�o, por favor, digite as suas 4 notas.");
       System.out.println("Me d� a primeira nota:");
		num1 = leitor.nextFloat();	
		
		System.out.println("Me d� a segunda nota:");
		num2 = leitor.nextFloat();
		
		System.out.println("Me d� a terceira nota:");
		num3 = leitor.nextFloat();
		
		System.out.println("Me d� a quarta nota:");
		num4 = leitor.nextFloat();
		
		m1 = (float) (num1 + num2 + num3 + num4)/4;
		
		System.out.println("Sua m�dia �:" +m1);
		
if (m1 > 7 || m1 == 7) {
			
			System.out.println("Voc� est� aprovado!");
		
		
	} else if (m1 >= 3.5 || m1 < 7) {	
		
	System.out.println("Voc� est� de recupera��o! ");
		
		
	} else if (m1 < 3.5)  {
		System.out.println("Voc� est� reprovado!");
		
		

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}      
}
}