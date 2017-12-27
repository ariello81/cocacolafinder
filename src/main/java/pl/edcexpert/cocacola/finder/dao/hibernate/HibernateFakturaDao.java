package pl.edcexpert.cocacola.finder.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.edcexpert.cocacola.finder.dao.FakturaDao;
import pl.edcexpert.cocacola.finder.model.Faktura;


@Repository
@Transactional
public class HibernateFakturaDao implements FakturaDao {

    private SessionFactory sessionFactory;
    
    public HibernateFakturaDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public List<Faktura> getAllFaktura() throws Exception {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Faktura.class);
        return criteria.list();
	}

	@Override
	public List<Faktura> getByNrFaktury(String nrFaktury)  {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Faktura.class);
		criteria.add(Restrictions.eq("fNumerFaktury", nrFaktury));
		return criteria.list();
	}
	
}
