import java.util.Scanner;

public class FPM2 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
    
		int x, y;
		double ss = 0;
		
		System.out.println("Por favor, digite dois números.");
		System.out.println("Por favor, digite o primeiro:");
		x=leitor.nextInt();
		System.out.println("Por favor, digite o segundo:");
		y=leitor.nextInt();

if (x<y) {
			
			do {
			
			ss=x+ss;
			x++;
		}
		
		while (x<y);
		
		
		System.out.println("A soma de todos os números, de X até Y, é:: "+(ss+y));}
		
		
		if(x>y) {
		
			do {
				
				ss=y+ss;
				y++;
			}
			
			while (y<x);
		
			System.out.println("A soma de todos os números, de X até Y, é:: "+(ss+x));}
		
		
		
		
		
		
		
		
		
		
		
		
}
}