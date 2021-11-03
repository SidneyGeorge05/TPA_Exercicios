import java.util.Scanner;
public class JoaoPedro {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		int ano = 1;
		double joaoCm, pedroCm;
		
		System.out.println("Insira a altura de João em Centimetros: ");
		joaoCm = ler.nextDouble();
		System.out.println("\nInsira a altura de Pedro em Centimetros: ");
		pedroCm = ler.nextDouble();
		while(ano<24) {
			if (joaoCm <= pedroCm) {
				joaoCm = joaoCm + 2.5;
		        pedroCm = pedroCm + 2;
			}
			ano = ano+1;
	    }
		System.out.println("\nAgora, João tem "+joaoCm+" Centimetros de Altura.");
		System.out.println("E agora, Pedro tem "+pedroCm+" Centimetros de Altura.");
		System.out.println("Demorou "+ano+" anos para João ficar mais alto que Pedro!");
		ler.close();

}
}