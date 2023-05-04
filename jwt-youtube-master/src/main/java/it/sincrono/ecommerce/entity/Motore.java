package it.sincrono.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMotore;
	private String tipoMotore;
	private String descrizione;
	
	public Integer getIdMotore() {
		return idMotore;
	}
	public void setIdMotore(Integer idMotore) {
		this.idMotore = idMotore;
	}
	public String getTipoMotore() {
		return tipoMotore;
	}
	public void setTipoMotore(String tipoMotore) {
		this.tipoMotore = tipoMotore;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
}
