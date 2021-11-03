import java.util.Scanner;
public class CalculoIMC {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float peso, altura, imc;
		System.out.println("Insira o seu peso: ");
		peso = ler.nextFloat();
		System.out.println("\n Insira a sua altura: ");
		altura = ler.nextFloat();
		imc = peso/(altura*altura);
		System.out.println("\nO seu IMC � de: "+imc);
		if(imc<18.5){
		System.out.println("\nVoc� est� com Excesso de Magreza");
		}else if(imc<25){
		System.out.println("\nVoc� est� com Peso Normal");
		}else if(imc<35){
		System.out.println("\nVoc� est� com Obesidade (Grau I)");
		}else if(imc<40){
		System.out.println("\nVoc� est� com Obesidade (Grau II)");
		}else{
		System.out.println("\nVoc� est� com Obesidade (Grau III)");
		}
		ler.close();
     }
}
