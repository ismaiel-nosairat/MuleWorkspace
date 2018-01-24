package com.somaa;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class MessageAnalyzer implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		String msg=eventContext.getMessage().getPayloadAsString();
		return "MSG after analyzing =" +msg.toUpperCase(); 
	}

}
