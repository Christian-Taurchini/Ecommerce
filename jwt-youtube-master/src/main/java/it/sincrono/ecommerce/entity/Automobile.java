package it.sincrono.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Automobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAutomobile;
	
	public Integer getIdAutomobile() {
		return idAutomobile;
	}

	public void setIdAutomobile(Integer idAutomobile) {
		this.idAutomobile = idAutomobile;
	}

	public Modello getModello() {
		return modello;
	}

	public void setModello(Modello modello) {
		this.modello = modello;
	}

	@OneToOne
	@JoinColumn(name = "idModello")
	private Modello modello;

}
