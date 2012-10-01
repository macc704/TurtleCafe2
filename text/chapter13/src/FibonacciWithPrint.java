/*
 * Fibonacchi.java
 * フィボナッチ数列を計算するプログラム(プリント付き)
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FibonacciWithPrint extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new FibonacciWithPrint());
	}

	void start() {
		print("fib(5) = " + fib(5));
	}

	int fib(int n) {
		printStart(n);
		int value;
		if (n == 1) {
			value = 1;
		} else if (n == 2) {
			value = 2;
		} else {
			value = fib(n - 1) + fib(n - 2);
		}
		printEnd(value);
		return value;
	}

	void printStart(int n) {
		makeIndent();
		print("fib(" + n + ")");
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
