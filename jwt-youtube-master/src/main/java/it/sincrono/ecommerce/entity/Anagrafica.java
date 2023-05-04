package it.sincrono.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Anagrafica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAnagrafica;
	private String indirizzo;
	private int numeroCivico;
	private String citta;
	private String numeroTelefono;
	private int cap;
	
	@OneToOne
	@JoinColumn(name = "nickname")
	private User user;

	public Integer getIdAnagrafica() {
		return idAnagrafica;
	}

	public void setIdAnagrafica(Integer idAnagrafica) {
		this.idAnagrafica = idAnagrafica;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}
	
	
	
}
