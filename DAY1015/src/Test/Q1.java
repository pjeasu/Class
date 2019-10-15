package Test;
// 1) 증감 연산자 
public class Q1 { 
	public static void main(String[] args) {
		
	
	int a = 10;
	int b = 3;
	
	
	// b = ++a + a++  >> a +=1 ; b = a + a; a += 1;  
	// 출력>> a=12 b=22
	
	
	
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
//이 식에서 a++은 이 문장 끝나고 나서 실행됨.
//b = ++a; 이 식에서는 플러스 후 대입  a += 1; b = a;
//전위연산자는 항상 그 연산이 실행되기전에 먼저 계산됨. 후위연산자는 그 이후에 계산. 
//a *= b+5 이상황에서는 b+5먼저, 대입연산자는 우선순위가 가장 낮음 . >> a = a*(b+5) 
// int a = 3; int b = 3; b = ++a + b-- + a--; 
//							 4 		3     4