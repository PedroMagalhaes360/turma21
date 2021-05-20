package agricultor;

public abstract class Agricultor {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private char tipoProducao;
	
	//Construtores
	public Agricultor(String nome, String cpf, String telefone, String endereco, char tipoProduto) 
	{
		this.nome= nome;
		this.cpf= cpf;
		this.telefone= telefone;
		this.endereco= endereco;
		this.tipoProducao= tipoProducao;
	}
	//Getters e Setters
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	public String getTelefone() 
	{
		return telefone;
	}
	
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	
	public char getTipoProducao() 
	{
		return tipoProducao;
	}
	
	public void setTipoProducao(char tipoProducao) 
	{
		this.tipoProducao = tipoProducao;
	}
	
	//Metodos
	public void mostrarProduto() 
	{
		System.out.println("O produto adicionado foi " +tipoProducao);
	}
	
}