import java.util.Scanner;
public class CarroEconomico {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double km, com, conMed;
		System.out.println("Insira a dist�ncia percorrida em quil�metros:");
		km = ler.nextFloat();
		System.out.println("\n Insira a capacidade do combustivel em litros:");
		com = ler.nextFloat();
		conMed = km/com;
		System.out.println("O seu Consumo M�dio em Quilometros por Litro � de: "+conMed);
		if(conMed>=10){
		System.out.println("O seu carro � Econ�mico");
		}else{
		System.out.println("O seu carro n�o � Econ�mico");
		}
        ler.close();
	}
}