import java.util.Scanner;
public class MediaAluno {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, média, notaExame, novaMédia;
		System.out.println("Insira sua 1ª nota:");
		nota1 = ler.nextFloat();
		System.out.println("\n Insira sua 2ª nota:");
		nota2 = ler.nextFloat();
		média = (nota1+nota2)/2;
		System.out.println("A sua Média Final é de: "+média);
		if(média<3){
		System.out.println("\n Sinto Muito! Você está reprovado!");
		}else if(média>=6){
		System.out.println("\n Parabéns! Você está aprovado!");
		}else {
		System.out.println("Insira sua nota do Exame de Recuperação:");
		notaExame = ler.nextFloat();
		novaMédia = (notaExame+média)/2;
		if(novaMédia>=6){
		System.out.println("A sua Nova Média Final é de: "+novaMédia);
		System.out.println("\n Parabéns! Você está aprovado!");
		}else{
		System.out.println("\n Sinto Muito! Você está reprovado!");
		}
		ler.close();
	}
}
}
