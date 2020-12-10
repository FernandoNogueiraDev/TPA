import java.util.Scanner; 
public class VetorPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,restozero = 0, j;
		int a[];
		a = new int [TAM];
		
		for(j=0;j<TAM; j++) {
			System.out.println("Entre com o número para ver se ele é primo: ");
			a[j] = in.nextInt();
			
			for(i=1; i<=a[j]; i++) {
				if (a[j] % i == 0) {
					restozero++;
				}
			}
			
			if(a[j] == 1) {
				System.out.println(a[j] + " Não é primo");
			} else if (restozero <=2) {
				System.out.println(a[j] + " É primo");
			} else {
				System.out.println(a[j] + " Não é primo");
			}
			restozero = 0;
		}
			
	}

}


/***3.	Criar um vetor A com 10 elementos inteiros
 * . Escreva um programa que imprima cada elemento do vetor A e 
 * uma mensagem indicando se o respectivo elemento é um número primo ou não.
 */