public class Fogueto {
	public static void main(String[] args) throws InterruptedException {
		int i = 10;
		
		System.out.println("Aten��o para a contagem regressiva!");
		Thread.sleep(2000);
		
		do {
		System.out.println(i);
		i = i - 1;
		Thread.sleep(2000);
	
		}while (i>=1);
		
		System.out.println("DECOLAR!");
		Thread.sleep(2000);
		System.out.println("FFFFFFFSSSSSHhhhhhhhhh....");
		Thread.sleep(2000);
		System.out.println("\nParab�ns! O seu foguete est� decolando para Marte! :D");
	}

}
