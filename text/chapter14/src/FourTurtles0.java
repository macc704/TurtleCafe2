/*
 * FourTurtles0.java
 * ４匹の亀を動かすプログラム
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FourTurtles0 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles0());
	}

	// タートルを動かす処理
	public void start() {
		// ウインドウの準備
		hide();
		window.setSize(1100, 500);

		// 4匹のカメを生成
		Turtle turtle0 = new Turtle();
		Turtle turtle1 = new Turtle();
		Turtle turtle2 = new Turtle();
		Turtle turtle3 = new Turtle();

		// 初期位置へ移動
		turtle0.warp(100, 100);
		turtle1.warp(100, 200);
		turtle2.warp(200, 100);
		turtle3.warp(200, 200);

		// カメを動かす
		for (int i = 0; i < 360; i++) {
			turtle0.fd(1);
			turtle0.rt(1);
			turtle1.fd(1);
			turtle1.rt(1);
			turtle2.fd(1);
			turtle2.rt(1);
			turtle3.fd(1);
			turtle3.rt(1);
		}
	}
}
