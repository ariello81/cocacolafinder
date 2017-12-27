/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package pl.edcexpert.cocacola.finder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pakiety")
public class Pakiet {
	
	@Id
	@Column(name = "p_matrix")
	private String pMatrix;
	
	@Column(name = "p_nazwa")
	private String pNazwa;
	
	@Column(name = "p_nazwa2")
	private String pNazwa2;
	
	@Column(name = "p_ulica")
	private String pUlica;
	
	@Column(name = "p_kod")
	private String pKod;
	
	@Column(name = "p_miasto")
	private String pMiasto;
	
	@Column(name = "p_id_platnika")
	private String pIdPlatnika;
	
	@Column(name = "p_wysylka")
	private String pWysylka;
	
	@Column(name = "p_koperta")
	private String pKoperta;
	
	@Column(name = "p_operator")
	private String pOperator;
	
	@Column(name = "p_katalog")
	private String pKatalog;
	
	@Column(name = "p_ilosc_kartek")
	private int pIloscKartek;
	
	@Column(name = "p_data_nadania")
	private String pDataNadania;
	
	@Column(name = "p_data_przetwarzania")
	private String pDataPrzetwarzania;

	public String getpMatrix() {
		return pMatrix;
	}

	public void setpMatrix(String pMatrix) {
		this.pMatrix = pMatrix;
	}

	public String getpNazwa() {
		return pNazwa;
	}

	public void setpNazwa(String pNazwa) {
		this.pNazwa = pNazwa;
	}

	public String getpNazwa2() {
		return pNazwa2;
	}

	public void setpNazwa2(String pNazwa2) {
		this.pNazwa2 = pNazwa2;
	}

	public String getpUlica() {
		return pUlica;
	}

	public void setpUlica(String pUlica) {
		this.pUlica = pUlica;
	}

	public String getpKod() {
		return pKod;
	}

	public void setpKod(String pKod) {
		this.pKod = pKod;
	}

	public String getpMiasto() {
		return pMiasto;
	}

	public void setpMiasto(String pMiasto) {
		this.pMiasto = pMiasto;
	}

	public String getpIdPlatnika() {
		return pIdPlatnika;
	}

	public void setpIdPlatnika(String pIdPlatnika) {
		this.pIdPlatnika = pIdPlatnika;
	}

	public String getpWysylka() {
		return pWysylka;
	}

	public void setpWysylka(String pWysylka) {
		this.pWysylka = pWysylka;
	}

	public String getpKoperta() {
		return pKoperta;
	}

	public void setpKoperta(String pKoperta) {
		this.pKoperta = pKoperta;
	}

	public String getpOperator() {
		return pOperator;
	}

	public void setpOperator(String pOperator) {
		this.pOperator = pOperator;
	}

	public String getpKatalog() {
		return pKatalog;
	}

	public void setpKatalog(String pKatalog) {
		this.pKatalog = pKatalog;
	}

	public int getpIloscKartek() {
		return pIloscKartek;
	}

	public void setpIloscKartek(int pIloscKartek) {
		this.pIloscKartek = pIloscKartek;
	}

	public String getpDataNadania() {
		return pDataNadania;
	}

	public void setpDataNadania(String pDataNadania) {
		this.pDataNadania = pDataNadania;
	}

	public String getpDataPrzetwarzania() {
		return pDataPrzetwarzania;
	}

	public void setpDataPrzetwarzania(String pDataPrzetwarzania) {
		this.pDataPrzetwarzania = pDataPrzetwarzania;
	}


	@Override
	public String toString() {
		return "Pakiet [pMatrix=" + pMatrix + ", pNazwa=" + pNazwa + ", pNazwa2=" + pNazwa2 + ", pUlica=" + pUlica
				+ ", pKod=" + pKod + ", pMiasto=" + pMiasto + ", pIdPlatnika=" + pIdPlatnika + ", pWysylka=" + pWysylka
				+ ", pKoperta=" + pKoperta + ", pOperator=" + pOperator + ", pKatalog=" + pKatalog + ", pIloscKartek="
				+ pIloscKartek + ", pDataNadania=" + pDataNadania + ", pDataPrzetwarzania=" + pDataPrzetwarzania + "]";
	}

	

	
	

}
