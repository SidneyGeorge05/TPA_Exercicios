import java.util.Scanner;
public class MediaAluno {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, m�dia, notaExame, novaM�dia;
		System.out.println("Insira sua 1� nota:");
		nota1 = ler.nextFloat();
		System.out.println("\n Insira sua 2� nota:");
		nota2 = ler.nextFloat();
		m�dia = (nota1+nota2)/2;
		System.out.println("A sua M�dia Final � de: "+m�dia);
		if(m�dia<3){
		System.out.println("\n Sinto Muito! Voc� est� reprovado!");
		}else if(m�dia>=6){
		System.out.println("\n Parab�ns! Voc� est� aprovado!");
		}else {
		System.out.println("Insira sua nota do Exame de Recupera��o:");
		notaExame = ler.nextFloat();
		novaM�dia = (notaExame+m�dia)/2;
		if(novaM�dia>=6){
		System.out.println("A sua Nova M�dia Final � de: "+novaM�dia);
		System.out.println("\n Parab�ns! Voc� est� aprovado!");
		}else{
		System.out.println("\n Sinto Muito! Voc� est� reprovado!");
		}
		ler.close();
	}
}
}
