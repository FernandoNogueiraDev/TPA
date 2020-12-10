import java.util.Scanner;
public class VetorInterseccao {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM= 3;
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

			    if (Check == true) {
			       c[k] = a[i];
			       k = k + 1;
			    }
			  }
			  System.out.println("Intersecção entre os vetores A e B:");

			  System.out.printf(" a[i]   b[i]   c[i] \n");
			  for (i=0; i<TAM; i++) {
			    System.out.printf(" %3d   %3d",  a[i], b[i]);
			    if (i < k)
			       System.out.printf("   %4d", c[i]);
			    System.out.printf("\n");
			  }
		}
	      
	    }
	      
}
/**6.	Criar dois vetores A e B cada um com 10 elementos inteiros. 
 *Desenvolver um programa que realize a intersecção  dos vetores A e B para produzir um vetor C. Interseção de conjuntos = todos os elementos que existem em A e também existem em B.
A = [ 2 4 6 8 10]
B = [ 1 2 4 5 7 ] 

1)	Contar quantos elementos tem nos dois vetores para definir o tamanho de C

C é a intersecção de A e B = [ 2  4 ]
*/

	    

	