programa
{
	inclua biblioteca Calendario
	funcao inicio()
	{
		/*
		 * Comparar sa a data informada pelo usuario é a mesma data do aniversario, 
		 * se sim for corrigir o a nota mais 10% pontos= (pontos * 0.1) + pontos.
		 */
		//Variaveis
		cadeia nome
		inteiro dataAtual=Calendario.dia_mes_atual()
		inteiro diaAniversario
		real nota= 0.00
		
		//Entradas
		escreva ("Seu nome: ")
		leia (nome)
		escreva ("Sua nota: ")
		leia (nota)
		escreva ("Dia do seu Aniversario: ")
		leia (diaAniversario)
			
		//Processos
		se (dataAtual == diaAniversario)
			{
				escreva ("Sua nota final é " ,((nota *0.1)+nota), " !!!")
			}
		senao
			escreva (nota)
		
		//Saidas
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */