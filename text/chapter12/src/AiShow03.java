/*
 * AiShow01.java
 * Created on 2011/12/14
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/*
 * «θ’vO
 * booleanΕCrΕreturnπ’ΔEo
 */
public class AiShow03 {

	public static void main(String[] args) {
		AiShow03 main = new AiShow03();
		main.run();
	}

	void run() {
		boolean aishow = judge("ΨΊρΖ", "H‘Γ");
		if (aishow == true) {
			System.out.println("«ΞΑΏθI");
		} else {
			System.out.println("wΝζDDD");
		}
	}

	boolean judge(String name1, String name2) {
		int x = name1.hashCode() + name2.hashCode();
		x = x % 100;
		if (x > 80) {
			return true;
		} else {
			return false;
		}
	}

}
