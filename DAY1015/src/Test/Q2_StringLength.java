package Test;
//2) 문자열의 길이를 구하는 함수 (String의 length와 같은 기능)

public class Q2_StringLength {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.format("예상값 : 5, 실제값 : %d\n", length(s1));
	}

	public static int length(String s) {
		int count = 0;
		if (s != null) {// 문자가 없다면 문자열의 길이는 0
			try {
			while (s.charAt(count) != '\0') 
				count++; //문자 하나를 가져왔을때  null문자가 아니면  카운트 증가
		} catch (IndexOutOfBoundsException ex) { 
			System.out.println("this is not abnormal"); //정상적인 케이스가 아니다 
		}
		
		} return 0;
	}
}
