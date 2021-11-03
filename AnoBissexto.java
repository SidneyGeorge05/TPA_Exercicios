import java.util.Scanner;
public class AnoBissexto {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoInicial, anoFinal;
		int ABqnt = 0; 
		
		  System.out.println("Insira um ano que termine em número par: ");
		  anoInicial = ler.nextInt();
		  System.out.println("Insira outro ano que termine em número par: ");
		  anoFinal = ler.nextInt();
		  
		  do {
			  anoInicial = anoInicial+4;
			  System.out.println("Foi ano bissexto:"+anoInicial);
			  ABqnt = ABqnt+1;
		  }while (anoInicial < anoFinal);
		  
		  System.out.println("\nForam apresentados "+ABqnt+" anos bissextos!");
		  ler.close();	  
}
}
