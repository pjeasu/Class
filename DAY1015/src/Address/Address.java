package Address;

import java.util.Set;

public interface Address {

	
	String getFirstName();
	
	void setFirstName(String firstname);
	
	String getLastName();
	
	void setLastName(String lastname);
	
	
	
	Set<String> getFieldName();
	
	void addField(String fieldName, String value); //String value���� String�� ������ ���߿� �Է��Ҷ� Ȯ���� �ϱ� ��ƴ�
	
	String getField(String FieldName);
	
	void removeField(String FieldName);
	
	
	
	
	
	//field�� ���� firstname, lastname��.....? 
	
	//String�� �ƴ� �ٸ� Ÿ���� �͵� ��. 
	//�����ϰ� �������̽��� �����Ҽ��ְԲ�~~~
	//�Է��ϴ� ���� �����ϰ� ���� �� ? ������ ���. 





	/*
	String getPostcode();
	
	String getAddressStreet();
	
	String getCity();
	
	String getState();
	*/
	






}
