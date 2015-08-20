package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Map;
import java.util.logging.Logger;

public class Delegate2 implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger(Delegate2.class.getName());

  public void execute(DelegateExecution execution) throws Exception {
    //LOGGER.info("Processing request by '"+execution.getVariable("Nachricht")+"'...");
	  
	  Map<String, Object> vars = execution.getVariables();
	 
	  LOGGER.info("\n\n\n Adis Log in die Console aus Delegate2 \n "
	  		+ "execution.getCurrentActivityName: "+execution.getCurrentActivityName()+"\n Variable Nachricht hat den Inhalt: " +execution.getVariable("Nachricht")+"\n");
	  
	  LOGGER.info("\n\n\n HashMap mit Process Variablen: \n\n");
	  
	  for(Object objname:vars.keySet()) {
		  LOGGER.info((String) objname);
		  LOGGER.info((String) vars.get(objname));
		 }
	  
	  LOGGER.info("\n-------------------------------------------------------------------------------------------\n");
  }

}
