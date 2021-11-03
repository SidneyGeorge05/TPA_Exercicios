import java.util.Scanner;
public class Fatorial {
	public static void main (String[]args) {
	   Scanner ler = new Scanner(System.in);       
       int fat = 1, x = 0; 
       String s = "";
    		
	   System.out.println("Insira um número maior do que zero: ");
       x = ler.nextInt(); 
       while(x >= 1){ 
           if (x == 1) {
        	   System.out.println(s += x); 
           } else  {
        	   s += x + " x " ;
        	   fat = fat * x;
           }
           x = x - 1;
       }
       System.out.println(s + " = " + fat);
       ler.close();
	   }
	   }