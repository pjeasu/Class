package Test;
// 1) ���� ������ 
public class Q1 { 
	public static void main(String[] args) {
		
	
	int a = 10;
	int b = 3;
	
	
	// b = ++a + a++  >> a +=1 ; b = a + a; a += 1;  
	// ���>> a=12 b=22
	
	
	
	System.out.format("a=%d\n", a++); 
	//a = 11
	System.out.format("b=%d\n", ++b); //b = 4
	
	b= ++a;
	System.out.format("a=%d\n", a++);
	System.out.format("b=%d\n", b++);
	//a = 13, b = 13
	
	b = a++;
	System.out.format("a=%d\n", a);
	System.out.format("b=%d\n", b);

	
	}
}
//b = a++ +3;
//�� �Ŀ��� a++�� �� ���� ������ ���� �����.
//b = ++a; �� �Ŀ����� �÷��� �� ����  a += 1; b = a;
//���������ڴ� �׻� �� ������ ����Ǳ����� ���� ����. ���������ڴ� �� ���Ŀ� ���. 
//a *= b+5 �̻�Ȳ������ b+5����, ���Կ����ڴ� �켱������ ���� ���� . >> a = a*(b+5) 
// int a = 3; int b = 3; b = ++a + b-- + a--; 
//							 4 		3     4