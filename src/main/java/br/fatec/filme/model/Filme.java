package br.fatec.filme.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_filme")
public class Filme extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_titulo", length = 120)
	private String titulo;
	
	@Column(name = "ne_ano")
	private Integer ano;
	
	@ManyToMany
	private List<Ator> atores;

	public Filme() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
}
