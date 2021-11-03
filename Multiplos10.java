public class Multiplos10 {
	public static void main (String[] args) {
		int i = 1;
		
		do{
			System.out.println(i);
			i = i+1;	
			if(i % 10 == 0){
				System.out.println(i+" - Múltiplo de 10");
			}
		}while (i<=300);
}
}