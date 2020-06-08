import java.util.Scanner;

public class FPM1 {
	
	public static void main(String[] args) {


		Scanner leitor = new Scanner (System.in);


	int x;
	int y;
	System.out.println("Método de cálculo: Multiplicação");
	System.out.println("Escreva o primeiro número:");
	x = leitor.nextInt();
	System.out.println("Escreva o segundo número");
	y = leitor.nextInt();
	
	int resultado = multiplicação(x, y);
	System.out.println("Resultado:"+resultado);
	}
	public static int multiplicação (int x, int y) {
		
		
		
		
		int c = y * x;
		return c;
		
		
		
		
		
		

		
		
		


}
}