import java.util.Scanner;
public class VetorRotinaDeBusca {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 10;
			  int i, x;
			  boolean check;
			  int a[];
			  a = new int[TAM];


			  for (i=0; i<TAM; i++) {
				  System.out.println("Digite o "+(i+1)+" valor de A");  
			      a[i] = in.nextInt();
			  }

			  while (true) {
			    for (i=0; i<TAM; i++) {
			      System.out.printf(" a[%d] = %2d \n", i, a[i]);
			    }

			    System.out.printf("\n Digite um número \n");
			    x = in.nextInt();
			   
			    i = 0; check = false;
			    while ((i < TAM) && (check == false)) {
			      if (a[i] == x) {
			         check = true;
			    }else { i = i + 1;
			    }

			    if (check == true){
			       System.out.printf("\n O número %d foi encontrado na posicao %d.", x, i);
			    }else{ System.out.printf("\n O número %d não foi encontrado.", x);

			    System.out.printf("\n \n");
			    
			  }
			  }in.close();
}
		}
	}
}
	    
/**8.	Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, 
 * 		para pesquisar se um dado elemento X está armazenado em A.
 * 
 */
	

