package hashCode_Equals.entidades;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private Double salario;
	private Date dataContratacao;
	private Long cpf;
	
	public Funcionario(String nome, Double salario, Date dataContratacao, Long cpf) {
		this.nome = nome;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public Long getCpf() {
		return cpf;
	}
	
	public void mudancaSalarial(Double novoSalario) {
		salario = novoSalario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
