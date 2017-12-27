
package pl.edcexpert.cocacola.finder.dao;

import java.util.List;

import pl.edcexpert.cocacola.finder.model.Pakiet;

public interface PakietDao {
	
	List<Pakiet> getAllPakiet();	
	
	Pakiet getByMatrix(String matrix);
	
	List<String> getOperators();
	
}
