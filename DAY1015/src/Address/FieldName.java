package Address;
//Address 클래스의 Set<String>에서 사용가능
public enum FieldName {
	DOB("DOB"),
	NICKNAME("NICKNAME"),
	ADDRESS_CITY("ADDRESS_CITY"),
	ADDRESS_STATE("ADDRESS_STATE"),
	ADDRESS_POSTCODE("ADDRESS_POSTCODE"),
	ADDRESS_STREET("ADDRESS_STREET"),
	;
	//설계는 유연하게 해주면서 규격화
	//들어가는 필드는 제한할수있음, 이곳에 열거된 필드만 쓸수있게 제한.. 
	
	
	
	private String value;
	private FieldName(String value) {
		this.value = value;
		
	}
	
	public String value() {
		return this.value; 
	}
	
	
	public String type() {
		if(value.equals("ADDRESS_POSTCODE")) {//필드명만 주는게 아니라 데이터 타입을 요구한다면? 
			return "숫자";
		}else {
			return"문자열";
		}
	}
}
