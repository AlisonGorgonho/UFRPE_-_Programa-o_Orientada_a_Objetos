package principal;

public class Pessoa {

	private String nome;
	private int idade;
	private CEP cep;
	private CPF cpf;
	
	public Pessoa(String nome, int idade, CEP cep, CPF cpf) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.cep = cep;
		this.cpf = cpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public CEP getCep() {
		return cep;
	}

	public void setCep(CEP cep) {
		this.cep = cep;
	}

	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
	
	
	
}