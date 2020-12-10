import java.util.Scanner;
public class VetorParImpar {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 5;
			
			int i, a[],b[], par = 0;
			a = new int[TAM];
			b = new int[TAM];
			
			for(i = 0; i<TAM ; i++) {
				System.out.println("Entre com o " +(i+1)+" valor de A");
				a[i] = in.nextInt();
				if (a[i] % 2 == 0) {
					par++;
				} 
					
				
			}
			
			System.out.print("A = ");
			for(i=0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}
			
			int indPar = 0;
			int indImpar = par;
			
			for(i=0;i<TAM;i++) {
				if (a[i]%2 == 0) {
					b[indPar] = a[i];
					indPar++;
				} else {
					b[indImpar] = a[i];
					indImpar++;
				}
			}
			System.out.println("");
			System.out.print("B = ");
			for (i=0; i<TAM; i++) {
				System.out.print(b[i] + " ");
			}

in.close();
		}
	}



}

/***1.	Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B.
 *  Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B 
 *  armazene os elementos de A que são ímpares.
 */