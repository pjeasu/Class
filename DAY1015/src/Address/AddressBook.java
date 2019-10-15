package Address;

import java.util.*; //자바의 컬렉션 객체사용

public class AddressBook <T extends Address>{


	private List<T> list; //T자리에 address가 직접와도됨 이 T는 항상 Address에서 상속받은것

	public addressBook() {
		this.list = new ArrayList<T>();
	}
	
	public void add() {
		this.list = new ArrayList<T>();
	}
	
	public AddressBook() {
		this.list = new ArrayList<T>();
	}
	
	public AddressBook() {
		this.list = new ArrayList<T>();
	}
	
	
	
	
	
	
}
