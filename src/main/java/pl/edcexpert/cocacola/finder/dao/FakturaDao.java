/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package pl.edcexpert.cocacola.finder.dao;

import java.util.List;

import pl.edcexpert.cocacola.finder.model.Faktura;

public interface FakturaDao {
	
	List<Faktura> getAllFaktura() throws Exception;	
	
	List<Faktura> getByNrFaktury(String nrFaktury);
	
}
