package it.sincrono.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCambio;
	private String tipoCambio;
	private String descrizione;
	
	public Integer getIdCambio() {
		return idCambio;
	}
	public void setIdCambio(Integer idCambio) {
		this.idCambio = idCambio;
	}
	public String getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
