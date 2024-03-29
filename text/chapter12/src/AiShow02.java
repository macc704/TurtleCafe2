/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * 相性占いプログラム
 * String版
 */
public class AiShow02 {

	public static void main(String[] args) {
		AiShow02 main = new AiShow02();
		main.run();
	}

	void run() {
		String aishow = judge("木村拓哉", "工藤静香");
		System.out.println("相性は" + aishow + "です");
	}

	String judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		String text = "";
		if (x > 80) {
			text = "ばっちり";
		} else {
			text = "そこそこ";
		}
		return text;
	}
}
