package Address;

import java.util.Set;

public interface Address {

	
	String getFirstName();
	
	void setFirstName(String firstname);
	
	String getLastName();
	
	void setLastName(String lastname);
	
	
	
	Set<String> getFieldName();
	
	void addField(String fieldName, String value); //String value에서 String을 넣으면 나중에 입력할때 확인을 하기 어렵다
	
	String getField(String FieldName);
	
	void removeField(String FieldName);
	
	
	
	
	
	//field는 위의 firstname, lastname값.....? 
	
	//String이 아닌 다른 타입이 와도 됨. 
	//유연하게 인터페이스가 동작할수있게끔~~~
	//입력하는 값을 제한하고 싶을 때 ? 열거형 사용. 





	/*
	String getPostcode();
	
	String getAddressStreet();
	
	String getCity();
	
	String getState();
	*/
	






}
