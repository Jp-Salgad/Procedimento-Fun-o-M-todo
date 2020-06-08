import java.util.Scanner;

public class FPM4 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

        double a, b;
        int ab;
        
        System.out.println("Por favor, escreva dois números.");
        System.out.println("Por favor, escreva o primeiro:");
		a=leitor.nextDouble();

        System.out.println("Por favor, escreva o segundo:");
		b=leitor.nextDouble();

        System.out.println("Por favor, agora escolha o tipo de operação:");
        
        System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Divisão");
		System.out.println("4- Multiplicação");
		ab=leitor.nextInt();
		
		switch (ab) {
		
		case 1:
			System.out.println("O resultado é: "+(a+b));
			break;
		case 2:
			System.out.println("O resultado é: "+(a-b));
			break;
		case 3 :
			System.out.println("O resultado é: "+(a/b));
			break;
		case 4 :	
			System.out.println("O resultado é: "+(a*b));
			break;
			
			default: System.out.println("Não é possível completar essa operação.");
		
		
		
		
		
		
		
		
		
		}
}
}