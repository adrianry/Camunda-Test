/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.getstarted.adisample;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Map;
import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger(ProcessRequestDelegate.class.getName());

  public void execute(DelegateExecution execution) throws Exception {
    //LOGGER.info("Processing request by '"+execution.getVariable("customerId")+"'...");
	  Map<String, Object> vars = execution.getVariables();
	 
	  LOGGER.info("\n\n\n Adis Log in die Console \n "
	  		+ "execution.getCurrentActivityName: "+execution.getCurrentActivityName()+"\n\n");
	  
	  LOGGER.info("\n\n\n HashMap mit Process Variablen: \n\n");
	  
	  for(Object objname:vars.keySet()) {
		  LOGGER.info((String) objname);
		  LOGGER.info((String) vars.get(objname));
		 }
	  
	  execution.setVariable("Nachricht", "Hallo du");
	  
	  LOGGER.info("\n-------------------------------------------------------------------------------------------\n");
	  
  }

}
