package clientCC;

import com.soap.ws.client.cc.*;

public class CreditCardConvertor {
	
	public CreditCardConvertor(){}
	
	public String checkCreditCardType(String input) {
		
		CreditCardValidator service =  	new CreditCardValidator();
		CreditCardValidatorSoap serviceSOAP =  service.getCreditCardValidatorSoap();
		
		if(serviceSOAP.validMod10(input)) {
			return serviceSOAP.getCardType(input);
		}
		return "Input is not valid Credit Card";
		
	}

}
