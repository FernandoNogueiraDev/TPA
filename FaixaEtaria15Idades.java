import java.util.Scanner;
public class FaixaEtaria15Idades {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float idade,med1,med2,med3,med4,med5;
		med1 = 0;
		med2 = 0;
		med3 = 0;
		med4 = 0;
		med5 = 0;
		for(int i=1; i <=15 ; i++) {
			System.out.println("Digite a idade da " +i+ "ª pessoa: ");
			idade = leia.nextFloat();
			
	        if(idade>=0&&idade<=15){
	        	med1 = med1+1;
               

        }else if(idade>=16 && idade<=30) {
        		med2 = med2+1; 
	        
	        	
        }else if(idade>=31 && idade<=45){
        		med3 = med3+1;
        
        
        }else if(idade>=46 && idade<=60){
	        	med4 = med4+1;

	    }else if(idade>=61) {
	        	med5 = med5+1;

        }

}
		
	     System.out.println("A media das pessoas até 15 anos : " +(med1 * 100 / 15));
	     System.out.println("A media das pessoas entre 16 e 30 anos : " +(+med2 * 100 / 15));
	     System.out.println("A media das pessoas entre 31 e 45 anos : " +(+med3 * 100 / 15));
	     System.out.println("A media das pessoas entre 46 e 60 anos : " +(+med4 * 100 / 15));
	     System.out.println("A media das pessoas acima 61 de anos : " +(med5 * 100 / 15));
	        
		leia.close();
}

	
        }
      
