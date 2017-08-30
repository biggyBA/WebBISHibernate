package ba.biggy.dao;

import java.util.List;

import ba.biggy.model.Fault;

public interface FaultDAO {
	
	public void addFault (Fault fault);
	
	public List<Fault> listToDoFaults();
	
	public void deleteFault (int id);
	
	public Fault getFaultById (int id);
	
	public void updateFault (Fault fault);
	

}
