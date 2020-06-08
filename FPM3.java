import java.util.Scanner;

public class FPM3 {
	

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

		double x,y, k, l;
		double R;
		System.out.println("Quer descobrir se você foi aprovado?! Digite suas 4 notas então, por favor.");
		System.out.println("Digite a primeira nota:");
		x=leitor.nextDouble();
		System.out.println("Digite a segunda nota:");
		y=leitor.nextDouble();
		System.out.println("Digite a terceira nota:");
		k=leitor.nextDouble();
		System.out.println("Digite a quarta nota:");
		l=leitor.nextDouble();


		R = (x+y+k+l)/4;
		
		if((x+y+k+l)/4 >=7) {
			
			System.out.println("O resultado da média da suas notas é "+R+" , então, parabéns! você foi APROVADO!");
		}
		
		else {
			System.out.println("O resultado da média da suas notas é "+R+" , então, infelizmente você foi REPROVADO!");
		
		
		
		
		
		
		
		
		
		}
}
}