/*
 * キーに対応して車が動くプログラム2 
 * (押してるかどうか調べて，同時押しに対応できるバージョン)
 * 
 * Yoshiaki Matsuzawa 2011/11/22
 */
public class HandleKeyDown extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKeyDown());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す

		// 車を生成
		ImageTurtle car = new ImageTurtle("car.gif");

		while (true) {

			// --- 待つ ---
			sleep(0.025);

			// --- 処理 ---
			// キーが押されていたら，車を動かす
			if (keyDown(37)) { // 左
				int x = car.getX();
				int y = car.getY();
				car.warp(x - 5, y);
			}
			if (keyDown(38)) { // 上
				int x = car.getX();
				int y = car.getY();
				car.warp(x, y - 5);
			}

			// --- 再描画 ---
			update();
		}
	}

}