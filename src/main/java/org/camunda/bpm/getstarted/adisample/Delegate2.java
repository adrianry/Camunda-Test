package org.camunda.bpm.getstarted.adisample;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Map;
import java.util.logging.Logger;

public class Delegate2 implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger(Delegate2.class.getName());

  public void execute(DelegateExecution execution) throws Exception {
	  Map<String, Object> vars = execution.getVariables();
	 
	  LOGGER.info("\n\n\n Adis Log in die Console aus Delegate2 \n "
	  		+ "execution.getCurrentActivityName: "+execution.getCurrentActivityName()+"\n\n Variable Nachricht hat den Inhalt: " +execution.getVariable("Nachricht")+"\n");
	  
	  LOGGER.info("\n\n HashMap mit Process Variablen:\n");
	  
	  for(Object objname:vars.keySet()) {
		  LOGGER.info((String) objname + ":" +(String) vars.get(objname));
		 }
	  
	  LOGGER.info("\n-------------------------------------------------------------------------------------------\n");
  }

}
