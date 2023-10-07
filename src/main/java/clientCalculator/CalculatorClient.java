package clientCalculator;

import com.soap.ws.client.calculator.*;


public class CalculatorClient {
	
	public CalculatorClient ( ) {}
	
	
	public int add(int x, int y) {
		Calculator service =new Calculator();
		CalculatorSoap serviceSoap = service.getCalculatorSoap();
		
		
		return serviceSoap.add(x, y);
	}
	
	public int divide(int x, int y) {
		Calculator service =new Calculator();
		CalculatorSoap serviceSoap = service.getCalculatorSoap();
		
		return serviceSoap.divide(x, y);
		
	}

}
