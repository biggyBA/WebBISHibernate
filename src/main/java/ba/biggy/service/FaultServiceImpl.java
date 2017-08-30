package ba.biggy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ba.biggy.dao.FaultDAO;
import ba.biggy.model.Fault;

public class FaultServiceImpl implements FaultService{
	
	private FaultDAO faultDAO;
	
	

	public void setFaultDAO(FaultDAO faultDAO) {
		this.faultDAO = faultDAO;
	}



	@Override
	@Transactional
	public void addFault(Fault fault) {
		this.faultDAO.addFault(fault);
	}



	@Override
	@Transactional
	public List<Fault> listToDoFaults() {
		return this.faultDAO.listToDoFaults();
	}



	@Override
	@Transactional
	public void deleteFault(int id) {
		this.faultDAO.deleteFault(id);
	}



	@Override
	@Transactional
	public void updateFault(Fault fault) {
		this.faultDAO.updateFault(fault);
	}



	@Override
	@Transactional
	public Fault getFaultById(int id) {
		return this.faultDAO.getFaultById(id);
	}

}
