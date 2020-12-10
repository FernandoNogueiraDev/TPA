import java.util.Scanner;
public class VetorDiferenca {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 3;
			int a[];
			  int b[];
			  int c[];
			  a = new int[TAM];
			  b = new int[TAM];
			  c = new int[TAM];
			  int i, j, k;
			  boolean Check;

			  for (i=0; i<TAM; i++) {
				  System.out.println("Digite o "+(i+1)+" valor de A");
				  a[i] = in.nextInt();
			  }

			  for (i=0; i<TAM; i++) {
				  System.out.println("Digite o "+(i+1)+" valor de B");
				  b[i] = in.nextInt();
			  }

			  k = 0; 
			  for (i=0; i<TAM; i++) {
			    Check = false;
			    for (j=0; j<TAM; j++) {
			      if (a[i] == b[j])
			         Check = true;
			    }

			    if (Check == false) {
			       c[k] = a[i];
			       k = k + 1;
			    }
			  }
			  System.out.println("Diferença entre os vetores A e B:");
			  System.out.printf(" A[]   B[]   C[]\n");
			  
			  for (i=0; i<TAM; i++) {
			    System.out.printf(" %1d   %4d", a[i], b[i]);
			    if (i < k)
			       System.out.printf("   %3d", c[i]);
			    System.out.printf("\n");
			  }
		}
	      
	    }

	}

/**7.	Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Desenvolver um programa que crie um vetor C que é a diferença dos conjuntos 
 * formados pelos elementos dos vetores A e B.
 * Diferença de conjuntos = todos os elementos do conjunto A que não existem no conjunto B.
 */