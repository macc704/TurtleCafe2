/**
 * キーに対応して車が動くプログラム
 * 
 * Yoshiaki Matsuzawa 2003/06/23
 */
public class HandleKey extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKey());
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
			// 左キーが押されていたら，車を動かす
			int x = car.getX();
			int y = car.getY();
			if (key() == 37) { // 左
				car.warp(x - 5, y);
			}

			// --- 再描画 ---
			update();
		}
	}

}