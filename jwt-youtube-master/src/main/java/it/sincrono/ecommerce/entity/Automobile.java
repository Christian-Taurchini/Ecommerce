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
	private int numeroPosti;
	private double potenza;
	private int numeroPorte;
	private double potenzaCv;
	private int cilindri;
	private double peso;
	private double lunghezza;
	private double altezza;
	private double larghezza;
	private String linkImmagineAuto;
	private String colore;
	private double prezzo;
	
	@OneToOne
	@JoinColumn(name = "idModello")
	private Modello modello;
	
	@OneToOne
	@JoinColumn(name = "idMotore")
	private Motore motore;
	
	@OneToOne
	@JoinColumn(name = "idTrazione")
	private Trazione trazione;
	
	@OneToOne
	@JoinColumn(name = "idCambio")
	private Cambio cambio;
	
	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public double getPotenza() {
		return potenza;
	}

	public void setPotenza(double potenza) {
		this.potenza = potenza;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	public double getPotenzaCv() {
		return potenzaCv;
	}

	public void setPotenzaCv(double potenzaCv) {
		this.potenzaCv = potenzaCv;
	}

	public int getCilindri() {
		return cilindri;
	}

	public void setCilindri(int cilindri) {
		this.cilindri = cilindri;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public String getLinkImmagineAuto() {
		return linkImmagineAuto;
	}

	public void setLinkImmagineAuto(String linkImmagineAuto) {
		this.linkImmagineAuto = linkImmagineAuto;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

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

	public Motore getMotore() {
		return motore;
	}

	public void setMotore(Motore motore) {
		this.motore = motore;
	}

	public Trazione getTrazione() {
		return trazione;
	}

	public void setTrazione(Trazione trazione) {
		this.trazione = trazione;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
}
