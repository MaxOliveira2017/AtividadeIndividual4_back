package model;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String nascimento;
	private String situa��o;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getSitua��o() {
		return situa��o;
	}
	public void setSitua��o(String situa��o) {
		this.situa��o = situa��o;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", situa��o="
				+ situa��o + "]";
	}
	
	
	
	
}
