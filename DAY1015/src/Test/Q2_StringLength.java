package Test;
//2) ���ڿ��� ���̸� ���ϴ� �Լ� (String�� length�� ���� ���)

public class Q2_StringLength {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.format("���� : 5, ������ : %d\n", length(s1));
	}

	public static int length(String s) {
		int count = 0;
		if (s != null) {// ���ڰ� ���ٸ� ���ڿ��� ���̴� 0
			try {
			while (s.charAt(count) != '\0') 
				count++; //���� �ϳ��� ����������  null���ڰ� �ƴϸ�  ī��Ʈ ����
		} catch (IndexOutOfBoundsException ex) { 
			System.out.println("this is not abnormal"); //�������� ���̽��� �ƴϴ� 
		}
		
		} return 0;
	}
}
