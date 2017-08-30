package ba.biggy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ba.biggy.model.Fault;
import ba.biggy.service.FaultService;

@Controller
public class SubmitFaultController {
	
	private FaultService faultService;

	@Autowired(required=true)
	@Qualifier(value="faultService")
	public void setFaultService(FaultService faultService) {
		this.faultService = faultService;
	}
	
	
	@RequestMapping(value = "/submitFault", method = RequestMethod.GET)
	public String submitFault(Model model) {
		model.addAttribute("fault", new Fault());
		return "submitFaultPage";
	}
	
	
	@RequestMapping(value= "/saveFault", method = RequestMethod.POST)
	public String addFault(@ModelAttribute("fault") Fault fault){
			
			if(fault.getId() == 0){
				//add new fault
				this.faultService.addFault(fault);
			}else{
				//update fault
				//this.faultService.updateFault(fault);
			}
			
			return "redirect:/";
			
	}

}
