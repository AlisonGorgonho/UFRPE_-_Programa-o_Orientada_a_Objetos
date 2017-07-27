package principal;

public class CEP {
	
	private String logradouro;
	private String UF;
	private String bairro;
	private String cidade;

	public CEP(String logradouro, String UF, String bairro, String cidade){
		
		this.logradouro = logradouro;
		this.UF = UF;
		this.bairro = bairro;
		this.cidade = cidade;
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
	
	
}
