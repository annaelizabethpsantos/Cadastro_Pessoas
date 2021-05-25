package processoAgil.Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name="pessoaBean")

public class PessoaBean {
	
	public String nome;
	
	public long CPF;
	
	public String empresa;
	
	public String empresa1 = "Processo Ágil";
	
	public String empresa2 = "Extrato Jurídico";
	
	private String nomePessoa = "";
	
	private String cpfPessoa = "";
	
	public String adicionar() {
		nomePessoa = "Nome: " + nome;
		cpfPessoa = "CPF: " + String.valueOf(CPF);
		return "";
	}
	
	public String excluir() {
		nomePessoa = "";
		cpfPessoa = "";
		return "";
	}

	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getCpfPessoa() {
		return cpfPessoa;
	}

	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	public String getEmpresa1() {
		return empresa1;
	}

	public void setEmpresa1(String empresa1) {
		this.empresa1 = empresa1;
	}

	public String getEmpresa2() {
		return empresa2;
	}

	public void setEmpresa2(String empresa2) {
		this.empresa2 = empresa2;
	}	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
