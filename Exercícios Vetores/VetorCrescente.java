import java.util.Scanner;
public class VetorCrescente {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 3;
			int i, j, x, menor, maior;
			int a[];
			int b[];
			b = new int[TAM];
			a = new int[TAM];

			  for (i=0; i<TAM; i++) {
				  System.out.println("Digite o "+(i+1)+" valor de A");  
			      x = in.nextInt();
			      a[i] = x;
			      b[i] = x;
			  }
			  
			  for (i=0; i<TAM; i++) {
				  menor = i;
				  
				  for(j =(i+1); j<TAM ; j++) {
					  if(a[j] < a[menor]) {
						  menor = j;
					  }
					  
					  maior = b[i];
					  b[i] = b[menor];
					  b[menor] = maior;
				  }
			  }
				  System.out.print("Vetor A ordenado no vetor B: \n");
				  for (i=0; i<TAM; i++) {
				        System.out.print("B["+ i +"] =  " + b[i] + "\n");
				      }
		}
	      
	      
	}

}
/**10.	  Ler um vetor A com dez elementos inteiros.
 *  Criar um vetor B que tenha os 10 elementos de A em ordem crescente.
 */