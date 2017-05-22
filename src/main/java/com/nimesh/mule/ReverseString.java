package com.nimesh.mule;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;





public class ReverseString extends AbstractMessageTransformer {
	
	
	public Object transformMessage(MuleMessage message, String outputEncodin) throws TransformerException {
		String name =message.getProperty("name",PropertyScope.INVOCATION);
		String sb= new StringBuffer(name).reverse().toString();
	
		return "Reverse String:  " +sb;
		
	}

	

}
