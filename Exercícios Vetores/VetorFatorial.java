import java.util.Scanner;
public class VetorFatorial {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 5;
			int i, fat,x, a[], b[];
			
			
			a = new int [TAM];
			b = new int [TAM];
			
			for(i = 0; i<TAM; i++) {
				System.out.println("Digite o "+(i+1)+" valor de A");
				a[i] = in.nextInt();
				
				fat = 1;
				x = 1;
				do {
				
					fat=fat*x;
					x++;
				}while (x<=a[i]);
				
				b[i] = fat;
			}

			System.out.print("A = ");
			for(i=0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}

			System.out.println("");
			System.out.print("B = ");
			for (i=0; i<TAM; i++) {
				System.out.print(b[i] + " ");
			}in.close();
		}

	}
}

/**5.	Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, 
 * sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A.
 * 
 * Calcular o fatorial N
 * Trocar N por a[i]
 */

