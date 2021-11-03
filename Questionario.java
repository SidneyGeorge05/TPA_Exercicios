import java.util.Scanner;
public class Questionario {
	 public static void main(String[] args){
	       int TAM=10;
	       int i=1, ii;
		double acm=0, ma=0;
		Scanner ler = new Scanner(System.in);
		
		do{
		   System.out.println("Entre com o valor:");
			ii = ler.nextInt();
			acm +=ii;
			i++;
		}while(i<=TAM);
		ma = acm / TAM;
	      System.out.println("O resultado e: "+ma);
	      ler.close();
	 }
	}