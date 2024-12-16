package day1125;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {

		// 1. Map생성 (찾아서 사용할 때)
		Map<String, Object> map = new HashMap<String, Object>();

		// 2. 값 할당
		map.put("kim", new JiHoon());
		map.put("lee", new InHyok());
		map.put("byeon", new JoonSu());

		// 3. 키에 해당하는 객체를 찾아서
		String key = "lee";

		// 4. 사용
		if ("kim".equals(key)) {
			JiHoon jh = (JiHoon) map.get(key);
			System.out.println(jh.execute());
		}
		if ("lee".equals(key)) {
			InHyok ih = (InHyok) map.get(key);
			System.out.println(ih.execute());
		}

		if ("byeon".equals(key)) {
			JoonSu js = (JoonSu) map.get(key);
			System.out.println(js.execute());
		}

	}

}
