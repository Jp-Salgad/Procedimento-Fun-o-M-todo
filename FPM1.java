import java.util.Scanner;

public class FPM1 {
	
	public static void main(String[] args) {


		Scanner leitor = new Scanner (System.in);


	int x;
	int y;
	System.out.println("M�todo de c�lculo: Multiplica��o");
	System.out.println("Escreva o primeiro n�mero:");
	x = leitor.nextInt();
	System.out.println("Escreva o segundo n�mero");
	y = leitor.nextInt();
	
	int resultado = multiplica��o(x, y);
	System.out.println("Resultado:"+resultado);
	}
	public static int multiplica��o (int x, int y) {
		
		
		
		
		int c = y * x;
		return c;
		
		
		
		
		
		

		
		
		


}
}