package Exemplos;

import java.util.Scanner;

public class Times {
	
		public static void main(String[] args) {
			
		
	
		Scanner leia = new Scanner (System.in);
        String times[]= {"SPFC","SANTOS","GUARANI"," TIMÃO "};
        int pontos[] = new int [4];
        char resultado;

        for (int rodada= 0;rodada<4;rodada++){
            System.out.println("Rodada : "+(rodada+1)+"\n");
            
            for(int t=0;t<4;t++)
            {
            	System.out.println("O time " +times[t]+" ganhou? ");
                resultado = leia.next().charAt(0);
                		
                		
                if(resultado=='g' || resultado=='G')
                {
                    pontos[t]+=3;
                }
                else if(resultado=='e'|| resultado=='E')
                {
                    pontos[t]+=1;
                }
                else if(resultado=='p'|| resultado=='P')
                {
                    pontos[t]+=0;  
                }
            }
            
        }
        System.out.println("FIM DO CAMPEONATO");
	}
}