package ba.biggy.service;

import java.util.List;

import ba.biggy.model.Fault;

public interface FaultService {
	
	public void addFault (Fault fault);
	
	public List<Fault> listToDoFaults();
	
	public void deleteFault (int id);
	
	public void updateFault (Fault fault);
	
	public Fault getFaultById (int id);
	

}
