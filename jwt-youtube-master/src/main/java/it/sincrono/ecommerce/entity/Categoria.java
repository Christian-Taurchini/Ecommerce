package it.sincrono.ecommerce.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//Categoria = Marca della macchina

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategoria;
	private String nomeCategoria;
	private String descrizioneCategoria;
	private String linkImmagine;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    private Set<Modello> modello;
	
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public String getDescrizioneCategoria() {
		return descrizioneCategoria;
	}
	public void setDescrizioneCategoria(String descrizioneCategoria) {
		this.descrizioneCategoria = descrizioneCategoria;
	}
	public Set<Modello> getModello() {
		return modello;
	}
	public void setModello(Set<Modello> modello) {
		this.modello = modello;
	}
	public String getLinkImmagine() {
		return linkImmagine;
	}
	public void setLinkImmagine(String linkImmagine) {
		this.linkImmagine = linkImmagine;
	}

}
