import java.util.Scanner;
public class TrianguloABC {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float a, b, c;
		System.out.println("Insira o valor do Lado A:");
		a = ler.nextFloat();
		System.out.println("\n Insira o valor do Lado B:");
		b = ler.nextFloat();
		System.out.println("\n Insira o valor do Lado C");
		c = ler.nextFloat();
		if(a>b+c || b>a+c || c>a+b){
		System.out.println("\n Não é possível formar um Triângulo!");
		}else if(a==b && b==c){
		System.out.println("\n É um Triângulo Equílatero!");
		}else if(a!=b && b!=c && a!=c) {
		System.out.println("\n É um Triângulo Escaleno!");
	    }else {
	    System.out.println("\n É um Triângulo Isóceles!");
	    }
		ler.close();
	}
}
