package view;

import java.util.EventObject;

public class SainReportButtonEvent extends EventObject{

	// Make it so that its sends the credentials of the Student to the controller
	// to create the Sain View

	public SainReportButtonEvent(Object source) {
		super(source);
	}



}