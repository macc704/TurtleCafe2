/*
 * プログラム名：絵辞書アプリケーション 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DictionaryApplication extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DictionaryApplication());
	}

	// タートルを動かす処理
	public void start() {

		hide();
		window.setSize(700, 500);

		// 入力ボックス
		InputTurtle input = new InputTurtle();
		input.toJapaneseMode();
		input.warpByTopLeft(30, 30);

		// 出力結果
		ImageTurtle result = new ImageTurtle("notfound.gif");
		result.size(100, 100);
		result.warpByTopLeft(30, 60);

		// 辞書の読みを入れておく入れ物
		ListTurtle<CardTurtle> keys = new ListTurtle<CardTurtle>(true);
		keys.warpByTopLeft(30, 200);
		keys.addLast(new CardTurtle("りんご"));
		keys.addLast(new CardTurtle("いちご"));
		keys.addLast(new CardTurtle("すいか"));
		keys.addLast(new CardTurtle("みかん"));

		// 辞書の内容（絵）を入れておく入れ物
		ListTurtle<ImageTurtle> values = new ListTurtle<ImageTurtle>(true);
		values.warpByTopLeft(30, 250);
		values.addLast(new ImageTurtle("apple.gif"));
		values.addLast(new ImageTurtle("strawberry.gif"));
		values.addLast(new ImageTurtle("wm.gif"));
		values.addLast(new ImageTurtle("orange.gif"));
		values.addLast(new ImageTurtle("notfound.gif"));

		while (true) {
			sleep(0.025);// 待つ

			if (key() == 10) {// エンターキーが押されたら、
				// 検索を行い，結果を表示する
				String key = input.text();
				ImageTurtle value = search(key, keys, values);
				result.looks(value);
				input.clearText();
			}

			update();// 再描画する
		}
	}

	// 検索する
	ImageTurtle search(String searchKey, ListTurtle<CardTurtle> keys,
			ListTurtle<ImageTurtle> values) {
		for (int i = 0; i < keys.getSize(); i++) {// １つずつ調べる
			keys.setCursor(i);
			if (keys.getObjectAtCursor().getText().equals(searchKey)) {// 見つかったら
				values.setCursor(i);
				return values.getObjectAtCursor();// 検索結果を返す
			}
		}

		// 見つからなかったら
		return values.get(keys.getSize());// 最後のものを返す
	}
}
