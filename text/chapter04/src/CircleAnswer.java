/*
 * 円を書くプログラム
 * 2003/06/01
 * Yoshiaki Matsuzawa
 */
public class CircleAnswer extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new CircleAnswer());
	}

	//タートルを動かす処理
	public void start(){
	
		int i;//ループ用
		
		//円を書く
		i = 1;
		while(i <= 360){
			fd(1);
			rt(1);
			i = i + 1;
		}
		
	}
	
}