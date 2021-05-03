programa
{
	
	funcao inicio()
	{
		/*
		 * 1.Faça um programa que crie um vetor por leitura com 5 valores de 
		 * pontuação de uma atividade e o escreva em seguida. Encontre após a 
		 * maior pontuação e a apresente. 
		 */
		//Variantes
		real valor[5]
		real maiorValor= 0.00
		inteiro contador= 0
		
		//Entrada
		para(contador;contador<5;contador++)
		{
			escreva("Qual sua pontuação ??: ")
			leia(valor[contador])
			
			se(valor[contador]>maiorValor)
			{
				maiorValor=valor[contador]
			}
			limpa()
		}
		//Saida
		escreva("O maior valor é: "+maiorValor)
		para(contador=0;contador<5;contador++)
		{
			escreva("\na nota "+(contador+1)+" foi " +valor[contador])
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */