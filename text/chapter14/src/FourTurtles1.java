/*
 * FourTurtles.java
 * ４匹の亀を動かすプログラム１（ListTurtle＋カーソルで管理する）
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FourTurtles1 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles1());
	}

	// タートルを動かす処理
	public void start() {
		// ウインドウの準備
		hide();
		window.setSize(1100, 500);

		// リスト（入れ物）を作る
		ListTurtle<Turtle> turtles = new ListTurtle<Turtle>();
		turtles.warpByTopLeft(100, 300);

		// 4匹のカメを生成
		for (int i = 0; i < 4; i++) {
			turtles.add(new Turtle());
		}

		// 初期位置へ移動
		turtles.get(0).warp(100, 100);
		turtles.get(1).warp(100, 200);
		turtles.get(2).warp(200, 100);
		turtles.get(3).warp(200, 200);

		// カメを動かす
		for (int i = 0; i < 360; i++) {
			for (int j = 0; j < 4; j++) {
				turtles.moveCursorToNext();
				turtles.getObjectAtCursor().fd(1);
				turtles.getObjectAtCursor().rt(1);
			}
		}
	}
}
