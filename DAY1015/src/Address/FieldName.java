package Address;
//Address Ŭ������ Set<String>���� ��밡��
public enum FieldName {
	DOB("DOB"),
	NICKNAME("NICKNAME"),
	ADDRESS_CITY("ADDRESS_CITY"),
	ADDRESS_STATE("ADDRESS_STATE"),
	ADDRESS_POSTCODE("ADDRESS_POSTCODE"),
	ADDRESS_STREET("ADDRESS_STREET"),
	;
	//����� �����ϰ� ���ָ鼭 �԰�ȭ
	//���� �ʵ�� �����Ҽ�����, �̰��� ���ŵ� �ʵ常 �����ְ� ����.. 
	
	
	
	private String value;
	private FieldName(String value) {
		this.value = value;
		
	}
	
	public String value() {
		return this.value; 
	}
	
	
	public String type() {
		if(value.equals("ADDRESS_POSTCODE")) {//�ʵ�� �ִ°� �ƴ϶� ������ Ÿ���� �䱸�Ѵٸ�? 
			return "����";
		}else {
			return"���ڿ�";
		}
	}
}
