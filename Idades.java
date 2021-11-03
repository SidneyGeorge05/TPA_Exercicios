import java.util.Scanner;
public class Idades {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		int i = 1;
		int id, idMenor = 0, idMaior = 0;
		
		while(i<=10) {
			System.out.println("Insira a Idade do "+i+"º Aluno: ");
			id = ler.nextInt();
			if (id<18) {
				id = idMenor;
				idMenor = idMenor+1;
			}else {
				id= idMaior;
				idMaior = idMaior+1;
			}
			i = i+1;
	    }
		System.out.println("Existem "+idMenor+" alunos menores de idade.");
		System.out.println("Existem "+idMaior+" alunos maiores de idade.");
		ler.close();
	}
}
