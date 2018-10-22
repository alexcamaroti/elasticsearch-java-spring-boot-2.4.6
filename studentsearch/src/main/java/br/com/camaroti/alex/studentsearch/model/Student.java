package br.com.camaroti.alex.studentsearch.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "pessoas", type = "registros")
public class Student {

	@Id
	private String id;
	private String nome;
	private String cidade;
	private String formacao;
	private String estado;
	private String pais;
	private String[] interesses;

	
	public Student() {
		super();
	}

	public Student(String id, String nome, String cidade, String formacao, String estado, String pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.formacao = formacao;
		this.estado = estado;
		this.pais = pais;
	}

	public Student(String nome, String cidade, String formacao, String estado, String pais) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.formacao = formacao;
		this.estado = estado;
		this.pais = pais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String[] getInteresses() {
		return interesses;
	}

	public void setInteresses(String[] interesses) {
		this.interesses = interesses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", formacao=" + formacao + ", estado="
				+ estado + ", pais=" + pais + ", interesses=" + Arrays.toString(interesses) + "]";
	}

}
