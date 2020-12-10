import java.util.Scanner;
public class VetorPalindromo {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 10;
			  int i, x;
			  boolean check;
			  int a[];
			  a = new int[TAM];
			  
			  x = (TAM-1);
			  
			  for (i=0; i<TAM; i++) {
				  System.out.println("Digite o "+(i+1)+" valor de A");
				  a[i] = in.nextInt();
			  }
			  
			  i = 0;
			  check = true;
			  while((i < x) && (check == true)) {
				  
				  if(a[i] != a[x]) {
					  check = false;
					  
				  } else {
					  i++;
					  x--;
				  }
				  
			  }
			  
			  if(check == true) {
				  System.out.println("\n Os elementos dentro do Vetor A formam um palíndromo \n");
			  } else {
				  System.out.println("\n Os elementos dentro do Vetor A não formam um palindromo \n");
			  }
		}
	      
	}
}
	    
/** 9.	Números palíndromos são aqueles que escritos da direita para a esquerda
 *  têm o mesmo valor quando escritos da esquerda para a direita. 
 *  Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique
 *  se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, 
 *  se o primeiro elemento do vetor e igual ao último, se o segundo elemento do 
 *  vetor é igual ao penúltimo e assim por diante até verificar todos os elementos 
 *  ou chegar a conclusão que o vetor não é um palíndromo.	
* 
*/
	


	
		
	

