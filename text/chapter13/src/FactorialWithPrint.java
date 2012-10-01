/*
 * Factorial.java
 * 階乗を計算するプログラム(プリント付き)
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FactorialWithPrint extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new FactorialWithPrint());
	}

	void start() {
		print("factorial(5) = " + factorial(5));
	}

	int factorial(int n) {
		printStart(n);
		int result;
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}
		printEnd(result);
		return result;
	}

	void printStart(int n) {
		makeIndent();
		print("factorial(" + n + ")");
		nestCount++;
	}

	void printEnd(int result) {
		nestCount--;
		makeIndent();
		print("// return " + result + "");
	}

	int nestCount = 0;

	void makeIndent() {
		for (int i = 0; i < nestCount; i++) {
			printNoln("\t");
		}
	}

}
