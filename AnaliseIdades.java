import java.util.Scanner;
public class AnaliseIdades {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int id, anoNasc, anoAtual;
		System.out.println("Insira o seu Ano de Nascimento: ");
		anoNasc = ler.nextInt();
		System.out.println("\n Insira o Ano Atual: ");
		anoAtual = ler.nextInt();
		id = anoAtual - anoNasc;
		System.out.println("\n Sua idade � de " +id+ " anos!");
		if (id<10) {
			System.out.println("\n Voc� � uma Crian�a!");
		}else if (id<18) {
			System.out.println("\n Voc� � um Adolescente!");
		}else if (id<60) {
			System.out.println("\n Voc� � um Adulto!");
		}else {
			System.out.println("\n Voc� � um Idoso!");
		}
        ler.close();
	}
}
