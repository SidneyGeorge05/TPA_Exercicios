import java.util.Scanner;
public class MaiorMenor {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
        int N, numero;
        int M = 0, m = 0;
        
        System.out.println("Insira um n�mero para um m�ximo de valores: ");
    	N = ler.nextInt();
    	
    	if (N == 0) {
    		System.out.println("\nO seu valor final � de: "+N);
    	}else {
    	
    		System.out.println("\nInsira um m�ximo de "+N+ " n�meros: ");
        do {
        	numero = ler.nextInt();
	        if(numero > M){
	        	M = numero;
	        }else if (numero <= m) {
	        	m = numero;
	        }
	        N = N-1;
	        }while (N != 0);
        System.out.println("\nO menor n�mero �: "+m);
        System.out.println("\nO maior n�mero �: "+M);
        ler.close();
	}
}
}