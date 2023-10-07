package clientCountries;

import java.util.List;

import com.soap.ws.client.countries.*;

public class CountriesClient{
	public CountriesClient() {
	}
	
	public String orderCountries(int input) {
		 CountryInfoService service = new CountryInfoService();
		  CountryInfoServiceSoapType serviceSoap = service.getCountryInfoServiceSoap();
		  
		  
		 ArrayOftCountryCodeAndName names = serviceSoap.listOfCountryNamesByName();
		 List<TCountryCodeAndName> list = names.getTCountryCodeAndName();
		 TCountryCodeAndName country = list.get(input);
		 
		 
		 
		 return country.getSName();	
	}
}