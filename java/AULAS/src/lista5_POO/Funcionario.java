package lista5_POO;

public class Funcionario {

	/*
	 * 4)Crie uma classe funcionário e apresente os atributos
	 * e métodos referentes esta classe, em seguida crie um
	 * objeto funcionário, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */
		
	public String nome;
	public String cpf;
	public char genero;
	public double salario;
	
	public Funcionario (String nome, String cpf, char genero, double salario) 
	{
		this.nome= nome;
		this.cpf= cpf;
		this.genero= genero;
		this.salario= salario;
	}
		public String getCompletos() 
		{
			String getCompletos= "Nome do funcionario: "+nome + "CPF: "+cpf + "Genero: "+genero + "Salario: "+salario;
			return getCompletos;
		}
		
	
	
	
	
	
	
}

