package day1125.sub;

import java.util.HashMap;
import java.util.Map;

public class UseInterface {

	public static void main(String[] args) {

		// 1. Map생성 (찾아서 사용할 때)
		Map<String, Person> map = new HashMap<String, Person>();

		// 2. 값 할당
		map.put("kim", new JiHoon());
		map.put("lee", new InHyok());
		map.put("byeon", new JoonSu());

		// 3. 키에 해당하는 객체를 찾아서
		String key = "kim";

		// 4. 사용
		if (map.containsKey(key)) {
			Person p = map.get(key);
			System.out.println(p.execute());
		}
	}

}
