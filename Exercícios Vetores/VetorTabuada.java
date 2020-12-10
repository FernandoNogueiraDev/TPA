import java.util.Scanner;
public class VetorTabuada {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int NUM = 6;
			
			int i,j,r = 0, A[] ;
			
			A = new int[NUM];
			
			for(i=0; i<NUM; i++) { 
				System.out.println("Digite o "+(i+1)+"º valor de a: ");
				A[i] = in.nextInt();
}
			
			for(j = 1; j<5; j++) {
				
				for(i = 1; i <= 10; i++) {
				r = A[j]*i;
				System.out.println(j+" x "+i+"  =  "+r);
			
			
			
			
			
			
			in.close();

}

}
		}
	}
}







/**2.Criar um vetor A com 5 elementos inteiros. 
*Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.
*/