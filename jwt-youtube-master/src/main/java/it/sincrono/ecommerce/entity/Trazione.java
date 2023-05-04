package it.sincrono.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTrazione;
	private String tipoTrazione;
	private String descrizione;
	
	
	public Integer getIdTrazione() {
		return idTrazione;
	}
	public void setIdTrazione(Integer idTrazione) {
		this.idTrazione = idTrazione;
	}
	public String getTipoTrazione() {
		return tipoTrazione;
	}
	public void setTipoTrazione(String tipoTrazione) {
		this.tipoTrazione = tipoTrazione;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
}
