package org.camunda.edugraph.schemaEngineering;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendMahnung implements JavaDelegate {

	 private static final String HOST = "smtp.gmail.com";
	  private static final String USER = "absender@gmail.com";
	  private static final String PWD = "thb2017";

	  private final static Logger LOGGER = Logger.getLogger("SendMahnung");

	  public void execute(DelegateExecution execution) throws Exception {  
	      String crID = (String) execution.getVariable("crID");
	      String implementDeadline = (String) execution.getVariable("implementDeadline");
	      String recipient = (String) execution.getVariable("emailAdress");
	      
	      Email email = new SimpleEmail();
	      email.setCharset("utf-8");
	      email.setHostName(HOST);
	      email.setSmtpPort(465);
	      email.setAuthentication(USER, PWD);
	      email.setSSL(true);
	      
	      try {
	          email.setFrom("Steering Committee");
	          email.setSubject("Mahung für Change Request: " +crID+ " ");
	          email.setMsg("Hallo, Sie werden umgehend dazu aufgefordert, den Change Request mit der ID: " + crID +
	        		  "zu bearbeiten."
	          		+ "\n Die Deadline ist der  "+ implementDeadline +" "
	          		+ "\n\n Mit freundlichen Gruessen, "
	          		+ "\n Das Steering Committee");

	          email.addTo(recipient);

	          email.send();
	          LOGGER.info("Task Assignment Email successfully sent to address: " + recipient); 

	        } catch (Exception e) {
	          LOGGER.log(Level.WARNING, "Could not send email to assignee", e);
	        }
	      
	    }

}
