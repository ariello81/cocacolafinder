package pl.edcexpert.cocacola.finder.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.edcexpert.cocacola.finder.dao.PakietDao;
import pl.edcexpert.cocacola.finder.model.Pakiet;

@Repository
@Transactional
public class HibernatePakietDao implements PakietDao {

    private SessionFactory sessionFactory;
    
    public HibernatePakietDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public List<Pakiet> getAllPakiet() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Pakiet.class);
        return criteria.list();
	}

	@Override
	public Pakiet getByMatrix(String matrix) {
        return (Pakiet) sessionFactory.getCurrentSession().get(Pakiet.class, matrix);
	}

	@Override
	public List<String> getOperators() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Pakiet.class)
				.setProjection(Projections.distinct(Projections.property("pOperator")));
		System.out.println("hello");
		return criteria.list();
	}
	
}
