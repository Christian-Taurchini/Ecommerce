package it.sincrono.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Modello {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idModello;
	private String nomeModello;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Integer getIdModello() {
		return idModello;
	}
	public void setIdModello(Integer idModello) {
		this.idModello = idModello;
	}
	public String getNomeModello() {
		return nomeModello;
	}
	public void setNomeModello(String nomeModello) {
		this.nomeModello = nomeModello;
	}
	
	
	
}
