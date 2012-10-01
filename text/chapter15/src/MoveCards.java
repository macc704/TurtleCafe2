/*
 * プログラム名：カードをリスト１からリスト２に移動するプログラム
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class MoveCards extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards());
	}

	// タートルを動かす処理
	public void start() {

		hide();
		Turtle.window.size(550, 300);

		// リストを２つ作る
		ListTurtle<CardTurtle> list1 = new ListTurtle<CardTurtle>(true, "リスト1");
		list1.warp(50, 40);
		ListTurtle<CardTurtle> list2 = new ListTurtle<CardTurtle>(true, "リスト2");
		list2.warp(50, 110);

		// リスト１に１０枚のカードを入れる
		for (int i = 0; i < 10; i++) {
			list1.addLast(new CardTurtle(i * 10));
		}

		// アニメションループ
		do {
			sleep(0.5);

			if (list1.getSize() != 0) {
				list2.addLast(list1.getObjectAtCursor());// 入れ物１から入れ物２にカードを移動する
			} else if (list1.getSize() == 0) {
				break;// アニメーションループを抜ける
			}

			update();
		} while (true);

		print("アニメーションループが終了しました．");
	}

}