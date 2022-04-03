package chap16.EX04;

//wpsjflr zmffotm : 매개 변수

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
		//KeyValue<String, Integer> kv1 = new keyValue(); // 생성자에는 생략 가능함
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("===============");
		
		KeyValue <Integer, String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("not 요청한 페이지를 찾을 수 없습니다.");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("===============");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		kv3.setKey("평균값");
		kv3.setValue(555.555);
		System.out.println(kv3.getKey());  
		System.out.println(kv3.getValue());
		
		// 특정 타입을 사용하지 않을 경우 void 사용을 사용함
		KeyValue<String, Void> kv4 = new KeyValue();
		kv4.setKey("키값만 사용");
		//kv4.setKey(1111); // 사용불가
		
		System.out.println(kv4.getKey());
		
		
		
	// 문서의 끝
	}

}
