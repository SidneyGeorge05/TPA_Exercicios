import java.util.Scanner;
public class Sal�rioIRPF {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float sal�rio, al�quota, parcela, irpf;
        System.out.println("Insira o seu Sal�rio: ");
        sal�rio = ler.nextFloat();
        if (sal�rio <= 1434.59) {
        	System.out.println("\nO seu sal�rio � de: R$"+sal�rio+"\nPortanto, nada est� de diferente!");
        }else if (sal�rio <= 2100.50) {
        	System.out.println("Insira o valor da Al�quota: ");
        	al�quota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = sal�rio*al�quota/100 - parcela;
        	System.out.println("\nO seu IRPF � de: R$ "+irpf+"!");
        }else if (sal�rio <= 2866.70) {
        	System.out.println("Insira o valor da Al�quota: ");
        	al�quota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = sal�rio*al�quota/100 - parcela;
        	System.out.println("\nO seu IRPF � de: R$ "+irpf+"!");
        }else if (sal�rio <= 3582.00) {
        	System.out.println("Insira o valor da Al�quota: ");
        	al�quota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = sal�rio*al�quota/100 - parcela;
        	System.out.println("\nO seu IRPF � de: R$ "+irpf+"!");
        }else {
        	System.out.println("Insira o valor da Al�quota: ");
        	al�quota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = sal�rio*al�quota/100 - parcela;
        	System.out.println("\nO seu IRPF � de: R$ "+irpf+"!");
	}
        ler.close();

}
}