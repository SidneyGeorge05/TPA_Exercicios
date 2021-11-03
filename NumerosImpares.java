import java.util.Scanner;
public class NumerosImpares {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
        int i = 1;
        int n;
    
    System.out.println("Insira um número impar de sua escolha: ");
	n = ler.nextInt();
	
	do{
		System.out.println(i);
		i = i+2;
		}while (i<=n);
ler.close();
	}	
	{
		
}
}
