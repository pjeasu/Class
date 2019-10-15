package Test;
import java.util.*;
//3) ���Ͽ��Ḯ��Ʈ �������̽� ���� �� : List.java(GenericList.java) 
// �÷��� Ÿ�� ����~~~
public class Q3_CollectionSample {
	public static void main(String[] args) throws Exception {
		//mapTest();
		setTest();
		
		
	}
		public static void mapTest() {
			Map<String,String> people = new HashMap<String, String>(); //Ű, ���.. �����ȣ�� Ű, �ش�Ǵ� �ּҰ� ����� ��. Ű ���� �浹�����ֵ�.��ĥ���ֵ�.
			people.put("ȫ�浿", "1��");								
			people.put("���ö", "2��");
			people.put("�ѱ�ȭ", "3��");
			people.put("�����", "4��");
			people.put("��ȣ��", "1��");
			people.put("ȫ�浿", "3��"); //key �ߺ�

			
			//Map !!! <key, value>  key >> f(x) >> �ּ�(�ε���)    key�� ������ value�� ����. 
			//�����Ͱ� ��̵�(Ű�� ��ġ�� �ʴ´ٸ�) ������ O(1)
			//�ߺ��Ǵ� key�� ����ٸ� �ȵ� > �ڹ��� hash map�� �������� Ű�� ������ ������ �ٸ��� ���! 
			//������ �ٸ��� ��µɼ����� 
			//�˻��Ҷ� ��
			//������ set�� ��� . set�� ��ġ�°��� ������� ����. �Ѵ� �Ȱ��� �ߺ� �Ұ�
			//�߿��� Hash Map��  3����  Ư�� : Ű�� ������(���)�� ����, Ű�� �����Ϳ� �ٷ� ���� ����, ������ �׻� O(1) > �ٷ� ã�ư�������,�񱳸� �� �ѹ���.  
			//hash �Լ��� Ű�� �ּҷ� ������ִ� ������. �����Ͱ� �ֵ��� Ư���� ������  ���ڰ�(hash value, 16����)���� ��������, ��ȣȭ�Ҷ� ���..
			
			for(String key : people.keySet()) {
				System.out.format("key : %s, value : %s\n", key, people.get(key));
			}
		}
		
				
		
		
		
		public static void listTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++)
			list.addLast(i); // addTail�� ���� 
		
		Collections.reverse(list); // ���������� ������ ������!  
		for (Integer temp : list) { //for���� �ٸ� ����! �ڹ� �÷����� �� ��� ����. �÷��ǿ��� �����͸� �ϳ��� ������ for each!!! :�ݷ� �������� �÷����� ��ӹ������� ��������..�ڹ���ƿ�� �ִ°��� ��ӹ��� ������ for each�� Ȱ�� ����!!! Ÿ�Կ����� ����� ���ݾ� �ٸ�  
									// list �ڸ����� �÷����� �������̽�, Integer�ڸ����� ������Ʈ Ÿ��..! 
			System.out.println("temp = " + temp);
		}
		
		//���� ���� �ǹ� , �ϳ��� ������ �����Ϳ� �����Ҽ�����. ���� ����� ����. ������ index��ȣ, ������ �ʿ��Ѱ��� �Ʒ�! 
		for(int i = 0; i < list.size(); i++) {
			System.out.println("temp = " + list.get(i));
			}
		}
		
		
		
		
		public static void setTest() throws Exception { //Set�� ������ ������
			Set<Integer> numbers = new HashSet<Integer>(); //Integer�� �ƴ� ���ڿ��̶��.  ���ϴ� ����� ������������� Hash���� �̿��ϸ� ����. ����, ���ڳ��� ���ϴ°� �ƴ϶� ��ȯ�� Hash������ ���� . ���Ҷ� Hash�� �ϸ� ������.
			
			
			
			
			/*
			//Calendar.getInstance() >>> ���� �޷��� �ν��Ͻ��� ������
			//getTimeInMillis() >>> 1970�� 1�� 1�� 0�� 0�� 0�ʺ��� ������ �и������� ������ �ð� 
			
			Calendar c = Calendar.getInstance(); //��ü�� �������� ����ð��� �����̵�.
			for(int i = 0; i <10; i++) { 
				System.out.format("Thread Id : %d, Time : %d\n", 
						Thread.currentThread().getId(), Calendar.getInstance().getTimeInMillis()); // Calendar.getInstance()�ڸ��� ��ü c�� ������ ������ �� ���
				Thread.currentThread().sleep(1000); ////���� �����带 ������ �ð�(�и����������) ��ŭ ������(sleep, ����(�����ٸ�)�� �����ʰ� �������ϴ°�) 1000�� 1��
			}
			*/
			
			
			
		/*
			for(int i = 0; i <= 100; i++) {
				double rand = Math.random() * Calendar.getInstance().getTimeInMillis(); //������ ���� ������ ����� �ϳ� 
				System.out.println("random =  " + ((long)rand) % 45 + 1);
			}
			*/	
			
			
			for (int i = 0; i< 100; i++) {
				System.out.println("Time is " +Calendar.getInstance().getTimeInMillis()); // �ð��� ������� �Ϻ��ϰ� ������ ���� ��������� ª�� �ð��ȿ��� ���� �������� ��ȭ���� ����. >> �� ��� ���ؼ� ��ȭ���� ũ�� ���� 
			}
				
			while (numbers.size() <6) { //1~45�߿� �����Ѱ�6�����ϱ�, set�� ����... ��ġ�°� �����������  
				double rand = Math.random() * Calendar.getInstance().getTimeInMillis(); //Math.random() �� �Լ��ȿ� getTimeInMillis()�� ������, ���� ������ ��, �������� ����� ���� �ѹ��� ���� 
				numbers.add(Math.abs((int)((long)rand)%45) +1) ;
			}
			for(Integer temp : numbers) {
				System.out.println(temp);
			}
				
			
		
			
		}
		
}

//��簴ü�� �ؽ����� �������ֵ�.
//hashCode() >>> Return a hash code value for the object 




