package org.camunda.bpm.getstarted.adisample;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Methodenaufruf implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger(ProcessRequestDelegate.class.getName());
	private Expression InputFeld;
	
	  public void execute(DelegateExecution execution) throws Exception {
	    try {
	    	String inputFeld = (String)InputFeld.getValue(execution);
	    	
	    	 LOGGER.info("\n\n\n Klasse Methodenaufruf meldet: " + inputFeld +"\n\n\n");
	    		
	    	execution.setVariable("inputFeld", inputFeld);
	    			 
	    } catch (Exception ex) {
	       // throw new BpmnError();
	    }
	  }

	}