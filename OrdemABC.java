import java.util.Scanner;
public class OrdemABC {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira o Valor de A: ");
		a = ler.nextInt();
		System.out.println("Insira o Valor de B: ");
		b = ler.nextInt();
		System.out.println("Insira o Valor de C: ");
		c = ler.nextInt();
		if(a<b && b<c){
		System.out.println("\nA Ordem ser�:" +a+ ", " +b+ ", " +c);
		}else if(a<c && c<b){
		System.out.println("\nA Ordem ser�:" +a+ ", " +c+ ", " +b);
		}else if(b<a && a<c){
		System.out.println("\nA Ordem ser�:" +b+ ", " +a+ ", " +c);
		}else if(b<c && c<a){
		System.out.println("\nA Ordem ser�:" +b+ ", " +c+ ", " +a);
		}else if(c<a && a<b){
		System.out.println("\nA Ordem ser�:" +c+ ", " +a+ ", " +b);
		}else{
		System.out.println("\nA Ordem ser�:" +c+ ", " +b+ ", " +a);
		}
		ler.close();
	}
}
