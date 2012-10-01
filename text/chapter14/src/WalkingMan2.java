/*
 * WalkingMan2.java
 * 人が歩くアニメーションプログラム (List使用版)
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class WalkingMan2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingMan2());
	}

	// タートルを動かす処理
	public void start() {

		hide();
		window.setSize(1100, 500);

		// アニメーション用画像を用意する
		ListTurtle<ImageTurtle> holder = new ListTurtle<ImageTurtle>(true);
		holder.warpByTopLeft(50, 200);
		for (int i = 1; i <= 8; i++) {
			holder.addLast(new ImageTurtle("man" + i + ".gif"));
		}

		Turtle man = new Turtle();

		// アニメーションループ
		while (true) {
			// --- 待つ ---
			sleep(0.1); // 0.1秒

			// --- 処理を行う ---
			holder.moveCursorToNext();
			man.looks(holder.getObjectAtCursor());

			// --- 再描画する ---
			update();
		}

	}
}