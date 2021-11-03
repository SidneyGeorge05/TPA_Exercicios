import java.util.Scanner;
public class NomesIdades {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
        String nome, nomeVelho, nomeNovo;
        int id, idadeVelho, idadeNovo;
        System.out.println("Insira o 1º nome: ");
        nome = ler.next();
        System.out.println("Insira a 1ª idade: ");
        id = ler.nextInt();
        nomeVelho = nome;
        idadeVelho = id;
        nomeNovo = nome;
        idadeNovo = id;
        System.out.println("\nInsira o 2º nome: ");
        nome = ler.next();
        System.out.println("Insira a 2ª idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
        System.out.println("\nInsira o 3º nome: ");
        nome = ler.next();
        System.out.println("Insira a 3ª idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
        System.out.println("\nInsira o 4º nome: ");
        nome = ler.next();
        System.out.println("Insira a 4ª idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
        System.out.println("\nInsira o 5º nome: ");
        nome = ler.next();
        System.out.println("Insira a 5ª idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
                
        }
        ler.close();
        System.out.println("\n Logo, o Mais Velho(a) é "+nomeVelho+ " com " +idadeVelho+ " anos de idade!");
        System.out.println("\n E o Mais Novo(a) é "+nomeNovo+ " com " +idadeNovo+ " anos de idade!");
	
	}
	}
}
	}
}

