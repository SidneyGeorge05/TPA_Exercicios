import java.util.Scanner;
public class Ra�zes {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, delta, raizDelta, x1, x2;
        System.out.println("Insira o valor de A:");
        a = ler.nextDouble();
        System.out.println("Insira o valor de B:");
        b = ler.nextDouble();
        System.out.println("Insira o valor de C:");
        c = ler.nextDouble();
        delta = (b*b)-4*a*c;
        if (delta<0) {
        	System.out.println("\n Sinto muito, mas n�o existem ra�zes para essa equa��o!");
        }else if(delta==0) {
        	x1 = (-b) / (2*a);
        	System.out.println("\n Existe uma ra�z real!");
        	System.out.println("x1 =" +x1);
        }else {
        	raizDelta = Math.sqrt(delta);
        	x1 = (-b+raizDelta) / (2*a);
        	x2 = (-b - raizDelta) / (2*a);
        	System.out.println("\n Existem 2 ra�zes reais!");
        	System.out.println("x1 =" +x1+ "x2 = "+x2);
        }
        ler.close();
	}
}
