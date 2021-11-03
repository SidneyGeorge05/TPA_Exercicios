import java.util.Scanner;
public class SalárioIRPF {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float salário, alíquota, parcela, irpf;
        System.out.println("Insira o seu Salário: ");
        salário = ler.nextFloat();
        if (salário <= 1434.59) {
        	System.out.println("\nO seu salário é de: R$"+salário+"\nPortanto, nada está de diferente!");
        }else if (salário <= 2100.50) {
        	System.out.println("Insira o valor da Alíquota: ");
        	alíquota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = salário*alíquota/100 - parcela;
        	System.out.println("\nO seu IRPF é de: R$ "+irpf+"!");
        }else if (salário <= 2866.70) {
        	System.out.println("Insira o valor da Alíquota: ");
        	alíquota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = salário*alíquota/100 - parcela;
        	System.out.println("\nO seu IRPF é de: R$ "+irpf+"!");
        }else if (salário <= 3582.00) {
        	System.out.println("Insira o valor da Alíquota: ");
        	alíquota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = salário*alíquota/100 - parcela;
        	System.out.println("\nO seu IRPF é de: R$ "+irpf+"!");
        }else {
        	System.out.println("Insira o valor da Alíquota: ");
        	alíquota = ler.nextFloat();
        	System.out.println("Insira o valor da Parcela do Imposto: ");
        	parcela = ler.nextFloat();
        	irpf = salário*alíquota/100 - parcela;
        	System.out.println("\nO seu IRPF é de: R$ "+irpf+"!");
	}
        ler.close();

}
}