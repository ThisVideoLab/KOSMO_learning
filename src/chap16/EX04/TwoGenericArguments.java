package chap16.EX04;

//wpsjflr zmffotm : �Ű� ����

class KeyValue<K,V>{
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}

}

public class TwoGenericArguments {
	public static void main(String[] args) {

		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		//KeyValue<String, Integer> kv1 = new keyValue(); // �����ڿ��� ���� ������
		kv1.setKey("���");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("===============");
		
		KeyValue <Integer, String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("not ��û�� �������� ã�� �� �����ϴ�.");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("===============");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		kv3.setKey("��հ�");
		kv3.setValue(555.555);
		System.out.println(kv3.getKey());  
		System.out.println(kv3.getValue());
		
		// Ư�� Ÿ���� ������� ���� ��� void ����� �����
		KeyValue<String, Void> kv4 = new KeyValue();
		kv4.setKey("Ű���� ���");
		//kv4.setKey(1111); // ���Ұ�
		
		System.out.println(kv4.getKey());
		
		
		
	// ������ ��
	}

}
