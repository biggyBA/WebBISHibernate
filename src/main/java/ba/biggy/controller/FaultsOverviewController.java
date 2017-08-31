package ba.biggy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ba.biggy.model.Fault;
import ba.biggy.service.FaultService;

@Controller
public class FaultsOverviewController {

	
	private FaultService faultService;
	
	@Autowired(required = true)
	@Qualifier(value = "faultService")
	public void setFaultService(FaultService faultService) {
		this.faultService = faultService;
	}
	
	
	/*@RequestMapping(value="/faultsOverview")
	public ModelAndView showFaultsOverview(ModelAndView model) throws IOException{
		List<Fault> faultsToDo = faultDAO.listToDoFaults();
	    model.addObject("faultsToDo", faultsToDo);
	    model.setViewName("faultsOverviewPage");
		
	    return model;
	}*/
	
	@RequestMapping (value = "/faultsOverview", method = RequestMethod.GET)
	public String showFaultsOverview(Model model) {
		model.addAttribute("fault", new Fault());
		model.addAttribute("faultsToDo", this.faultService.listToDoFaults());
		return "faultsOverviewPage";
		
	}
	
	
	@RequestMapping(value = "/deleteFault/{id}")
	public String deleteFault(@PathVariable("id") int id) {
	    this.faultService.deleteFault(id);
	    return "redirect:/";
	}
	
	
	@RequestMapping(value= "editFault/updateFault", method = RequestMethod.POST)
	public String updateFault(@ModelAttribute("fault") Fault fault){
			this.faultService.updateFault(fault);
			return "redirect:/";
	}
	
	
	
	@RequestMapping("/editFault/{id}")
	public String editFault(@PathVariable("id") int id, Model model) {
		model.addAttribute("fault", this.faultService.getFaultById(id));
		return "editFaultPage";
	}
	
	
	@RequestMapping(value = "/editFault")
	public ModelAndView editFault(HttpServletRequest request) {
		int faultId = Integer.parseInt(request.getParameter("id"));
		Fault fault = this.faultService.getFaultById(faultId);
		ModelAndView model = new ModelAndView("editFaultPage");
		model.addObject("fault", fault);
		return model;
	}
	
	
	
	
	
	
}
