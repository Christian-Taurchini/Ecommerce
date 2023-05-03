package it.sincrono.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Modello {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idModello;
	private String nomeModello;
  
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
