import java.util.Scanner;
public class NomesIdades {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
        String nome, nomeVelho, nomeNovo;
        int id, idadeVelho, idadeNovo;
        System.out.println("Insira o 1� nome: ");
        nome = ler.next();
        System.out.println("Insira a 1� idade: ");
        id = ler.nextInt();
        nomeVelho = nome;
        idadeVelho = id;
        nomeNovo = nome;
        idadeNovo = id;
        System.out.println("\nInsira o 2� nome: ");
        nome = ler.next();
        System.out.println("Insira a 2� idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
        System.out.println("\nInsira o 3� nome: ");
        nome = ler.next();
        System.out.println("Insira a 3� idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
        System.out.println("\nInsira o 4� nome: ");
        nome = ler.next();
        System.out.println("Insira a 4� idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
        System.out.println("\nInsira o 5� nome: ");
        nome = ler.next();
        System.out.println("Insira a 5� idade: ");
        id = ler.nextInt();
        if (id > idadeVelho) {
            idadeVelho = id;
            nomeVelho = nome;
        }else if (id < idadeNovo) {
            idadeNovo = id;
            nomeNovo = nome;
                
        }
        ler.close();
        System.out.println("\n Logo, o Mais Velho(a) � "+nomeVelho+ " com " +idadeVelho+ " anos de idade!");
        System.out.println("\n E o Mais Novo(a) � "+nomeNovo+ " com " +idadeNovo+ " anos de idade!");
	
	}
	}
}
	}
}

