package Test;
import java.util.*;
//3) 단일연결리스트 인터페이스 구현 답 : List.java(GenericList.java) 
// 컬렉션 타입 예제~~~
public class Q3_CollectionSample {
	public static void main(String[] args) throws Exception {
		//mapTest();
		setTest();
		
		
	}
		public static void mapTest() {
			Map<String,String> people = new HashMap<String, String>(); //키, 밸류.. 우편번호가 키, 해당되는 주소가 밸류가 됨. 키 값이 충돌날수있따.겹칠수있따.
			people.put("홍길동", "1반");								
			people.put("김수철", "2반");
			people.put("한국화", "3반");
			people.put("윤명길", "4반");
			people.put("강호동", "1반");
			people.put("홍길동", "3반"); //key 중복

			
			//Map !!! <key, value>  key >> f(x) >> 주소(인덱스)    key를 넣으면 value가 나옴. 
			//데이터가 몇개이든(키가 겹치지 않는다면) 성능은 O(1)
			//중복되는 key가 생긴다면 안됨 > 자바의 hash map은 덮어써버림 키가 같은데 벨류가 다르면 덮어씀! 
			//순서가 다르게 출력될수있음 
			//검색할때 편리
			//성격이 set과 비슷 . set은 겹치는것을 허용하지 않음. 둘다 똑같이 중복 불가
			//중요한 Hash Map의  3가지  특성 : 키와 데이터(밸류)로 구성, 키로 데이터에 바로 접근 가능, 성능은 항상 O(1) > 바로 찾아갈수있음,비교를 딱 한번함.  
			//hash 함수는 키를 주소로 만들어주는 역할임. 데이터가 있따면 특정한 길이의  숫자값(hash value, 16진수)으로 만들어버림, 암호화할때 사용..
			
			for(String key : people.keySet()) {
				System.out.format("key : %s, value : %s\n", key, people.get(key));
			}
		}
		
				
		
		
		
		public static void listTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++)
			list.addLast(i); // addTail과 같음 
		
		Collections.reverse(list); // 내부적으로 순서를 뒤집음!  
		for (Integer temp : list) { //for문의 다른 형태! 자바 컬렉션을 쓸 경우 가능. 컬렉션에서 데이터를 하나씩 가져옴 for each!!! :콜론 다음에는 컬렉션을 상속받은것이 오ㅏ야함..자바유틸에 있는것을 상속받은 모든것은 for each로 활용 가능!!! 타입에따라 방식은 조금씩 다름  
									// list 자리에는 컬렉션의 인터페이스, Integer자리에는 엘레멘트 타입..! 
			System.out.println("temp = " + temp);
		}
		
		//위와 같은 의미 , 하나씩 꺼내서 데이터에 접근할수있음. 위의 방식이 좋음. 하지만 index번호, 색인이 필요한경우는 아래! 
		for(int i = 0; i < list.size(); i++) {
			System.out.println("temp = " + list.get(i));
			}
		}
		
		
		
		
		public static void setTest() throws Exception { //Set의 성질을 보여줌
			Set<Integer> numbers = new HashSet<Integer>(); //Integer가 아닌 문자열이라면.  비교하는 방식이 복잡해질수있찌만 Hash값을 이용하면 편함. 숫자, 문자끼리 비교하는게 아니라 변환된 Hash값끼리 비교함 . 비교할때 Hash로 하면 빠르다.
			
			
			
			
			/*
			//Calendar.getInstance() >>> 현재 달력의 인스턴스를 가져옴
			//getTimeInMillis() >>> 1970년 1월 1일 0시 0분 0초부터 시작한 밀리세컨즈 단위의 시간 
			
			Calendar c = Calendar.getInstance(); //객체가 생겼을때 현재시간이 세팅이됨.
			for(int i = 0; i <10; i++) { 
				System.out.format("Thread Id : %d, Time : %d\n", 
						Thread.currentThread().getId(), Calendar.getInstance().getTimeInMillis()); // Calendar.getInstance()자리에 객체 c를 넣으면 고정된 값 출력
				Thread.currentThread().sleep(1000); ////현재 쓰레드를 지정된 시간(밀리세컨즈단위) 만큼 잠들게함(sleep, 동작(스케줄링)을 하지않고 수면대기하는것) 1000은 1초
			}
			*/
			
			
			
		/*
			for(int i = 0; i <= 100; i++) {
				double rand = Math.random() * Calendar.getInstance().getTimeInMillis(); //랜덤한 값을 만들어내는 방법중 하나 
				System.out.println("random =  " + ((long)rand) % 45 + 1);
			}
			*/	
			
			
			for (int i = 0; i< 100; i++) {
				System.out.println("Time is " +Calendar.getInstance().getTimeInMillis()); // 시간만 가지고는 완벽하게 랜덤한 값을 만들순없음 짧은 시간안에서 만든 랜덤값은 변화량이 적음. >> 이 경우 곱해서 변화량을 크게 만듬 
			}
				
			while (numbers.size() <6) { //1~45중에 랜덤한값6개구하기, set은 집합... 겹치는걸 허용하지않음  
				double rand = Math.random() * Calendar.getInstance().getTimeInMillis(); //Math.random() 이 함수안에 getTimeInMillis()가 들어가있음, 좀더 복잡한 값, 랜덤값을 만들기 위해 한번더 곱함 
				numbers.add(Math.abs((int)((long)rand)%45) +1) ;
			}
			for(Integer temp : numbers) {
				System.out.println(temp);
			}
				
			
		
			
		}
		
}

//모든객체는 해쉬값을 가지고있따.
//hashCode() >>> Return a hash code value for the object 




