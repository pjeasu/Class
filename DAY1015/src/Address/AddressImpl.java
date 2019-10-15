package Address;

import java.util.*;

public class AddressImpl implements Address {
	private String firstName;
	private String lastName;
	private Map<String, String> fields;
	
	public AddressImpl() {
		this.fields = new HashMap<String, String>();
	}

	@Override
	public String getFirstName() { //getter
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public void setFirstName(String firstname) { //setter
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLastName(String lastname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getFieldName() {
		// TODO Auto-generated method stub
		return this.fields.keySet();
	}

	@Override
	public void addField(String fieldName, String value) {
		// TODO Auto-generated method stub
		this.fields.put(fieldName, value);
		
	}
	
	
	
}
