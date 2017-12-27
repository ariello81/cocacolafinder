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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="faktury")
public class Faktura {
	
	@Id
	@Column(name = "f_numer_faktury")
	private String fNumerFaktury;
	
	@ManyToOne
	@JoinColumn(name ="f_matrix")
	private Pakiet pakiet;
	
	public String getfNumerFaktury() {
		return fNumerFaktury;
	}

	public void setfNumerFaktury(String fNumerFaktury) {
		this.fNumerFaktury = fNumerFaktury;
	}


	public Pakiet getPakiet() {
		return pakiet;
	}

	public void setPakiet(Pakiet pakiet) {
		this.pakiet = pakiet;
	}

	@Override
	public String toString() {
		return "Faktura [fNumerFaktury=" + fNumerFaktury + "]";
	}

}
