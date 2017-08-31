package ba.biggy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ba.biggy.model.Fault;

@Repository
public class FaultDAOImpl implements FaultDAO {
	
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	@Override
	public void addFault(Fault fault) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fault);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Fault> listToDoFaults() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Fault> toDoFaultList = (List<Fault>) session.createQuery("from Fault").list();
		return toDoFaultList;
	}


	@Override
	public void deleteFault(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Fault fault = (Fault) session.load(Fault.class, new Integer(id));
		if (fault != null) {
			session.delete(fault);
		}
	}


	@Override
	public Fault getFaultById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Fault.class);
		crit.add(Restrictions.eq("id", id));
		
		return (Fault) crit.uniqueResult();
	}


	@Override
	public void updateFault(Fault fault) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(fault);
	}

}
