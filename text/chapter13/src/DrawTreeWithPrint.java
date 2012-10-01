/*
 * DrawTreeWithPrint.java
 * 再帰を使って木を描くプログラム(プリント付き)
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawTreeWithPrint extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTreeWithPrint());
	}

	// タートルを動かす処理
	public void start() {
		window.size(500, 500);
		warp(250, 400); // 木を描く位置まで移動する

		drawY(50);
	}

	// Yを描く
	void drawY(int length) {
		printStart(length);

		if (length < 5) {// 再帰の終点
			printEnd();
			return;
		}

		fd(length);// 幹を書く

		// 左の枝を描く
		lt(30);
		fd(length / 2);
		drawY(length / 2);
		bk(length / 2);
		rt(30);

		// 右の枝を描く
		rt(30);
		fd(length / 2);
		drawY(length / 2);
		bk(length / 2);
		lt(30);

		bk(length);// 幹を書く

		printEnd();
	}

	void printStart(int length) {
		makeIndent();
		print("drawY(" + length + ")");
		nestCount++;
	}

	void printEnd() {
		nestCount--;
		makeIndent();
		print("//");
	}

	int nestCount = 0;

	void makeIndent() {
		for (int i = 0; i < nestCount; i++) {
			printNoln("\t");
		}
	}

}