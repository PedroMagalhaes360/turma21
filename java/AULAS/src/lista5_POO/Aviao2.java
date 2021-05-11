package lista5_POO;

public class Aviao2 {
		
	
	/*
	 * 2) Crie uma classe avião e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto avião,
	 * defina as instancias deste objeto e apresente as informações
	 * deste objeto no console.
	 */
	
	public String modelo;
	public String color;
	public double velocMax;
	public int capcidadePassageiros;

	public Aviao2 (String modelo, String color, double velocMax, int capcidadePassageiros) 
	{
		this.modelo = modelo;
		this.color = color;
		this.velocMax=velocMax;
		this.capcidadePassageiros=capcidadePassageiros;
	}
	
	//pegar todos os dados
	public String getdadosCompletos() 
	{
		String dadosCompletos = "modelo do aviao: "+modelo+"cor:"+color+""
		+"velocidade maxima ktchau:"+velocMax+" KM/h\n"+"capacidade passageiros:"+capcidadePassageiros;
		return dadosCompletos;
	}
	
	
}
