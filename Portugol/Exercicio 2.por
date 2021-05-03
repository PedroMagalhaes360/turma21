programa
{
	
	funcao inicio()
	{
		/*
		 * 2.Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um 
		 * programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, 
		 * contabilize e apresente também quantas foram as ocorrências da maior 
		 * pontuação.
		 */
		//Variavis
		const inteiro totalLancamentos=5
		inteiro dados[totalLancamentos]
		inteiro lancamento = 0
		real somaDados = 0.00
		real mediaDados = 0.00
		inteiro maiorPontuacao = 0
		inteiro vezesMaiorPontuacao = 0

		//Entradas
		para(lancamento;lancamento<totalLancamentos;lancamento++)
		{
			escreva("Qual foi o valor do dado? ")
			leia(dados[lancamento])

			somaDados+=dados[lancamento]
			se(dados[lancamento]>maiorPontuacao)
			{
				vezesMaiorPontuacao = 0
				maiorPontuacao= dados[lancamento]
				vezesMaiorPontuacao++
			}senao se(dados[lancamento]==maiorPontuacao)
			{
				vezesMaiorPontuacao++
			}
			limpa()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */