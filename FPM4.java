import java.util.Scanner;

public class FPM4 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

        double a, b;
        int ab;
        
        System.out.println("Por favor, escreva dois n�meros.");
        System.out.println("Por favor, escreva o primeiro:");
		a=leitor.nextDouble();

        System.out.println("Por favor, escreva o segundo:");
		b=leitor.nextDouble();

        System.out.println("Por favor, agora escolha o tipo de opera��o:");
        
        System.out.println("1- Soma");
		System.out.println("2- Subtra��o");
		System.out.println("3- Divis�o");
		System.out.println("4- Multiplica��o");
		ab=leitor.nextInt();
		
		switch (ab) {
		
		case 1:
			System.out.println("O resultado �: "+(a+b));
			break;
		case 2:
			System.out.println("O resultado �: "+(a-b));
			break;
		case 3 :
			System.out.println("O resultado �: "+(a/b));
			break;
		case 4 :	
			System.out.println("O resultado �: "+(a*b));
			break;
			
			default: System.out.println("N�o � poss�vel completar essa opera��o.");
		
		
		
		
		
		
		
		
		
		}
}
}