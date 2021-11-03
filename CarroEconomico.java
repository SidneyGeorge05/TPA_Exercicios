import java.util.Scanner;
public class CarroEconomico {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double km, com, conMed;
		System.out.println("Insira a distância percorrida em quilômetros:");
		km = ler.nextFloat();
		System.out.println("\n Insira a capacidade do combustivel em litros:");
		com = ler.nextFloat();
		conMed = km/com;
		System.out.println("O seu Consumo Médio em Quilometros por Litro é de: "+conMed);
		if(conMed>=10){
		System.out.println("O seu carro é Econômico");
		}else{
		System.out.println("O seu carro não é Econômico");
		}
        ler.close();
	}
}