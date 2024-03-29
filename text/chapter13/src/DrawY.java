/*
 * DrawY.java
 * Yを描くプログラム
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawY extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawY());
	}

	// タートルを動かす処理
	public void start() {
		window.size(500, 500);
		warp(250, 400); // 木を描く位置まで移動する

		drawY(50);
	}

	// Yを描く
	void drawY(int length) {
		fd(length);// 幹を書く

		// 左の枝を描く
		lt(30);
		fd(length / 2);
		bk(length / 2);
		rt(30);

		// 右の枝を描く
		rt(30);
		fd(length / 2);
		bk(length / 2);
		lt(30);

		bk(length);// 幹を書く
	}

}