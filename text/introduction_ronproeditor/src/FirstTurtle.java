/**
 * �v���O�������F �C�ӂ̑傫���̎l�p�`�������v���O����
 * �쐬�ҁF Yoshiaki Matsuzawa
 * �쐬���F 2007/09/22
 */
public class FirstTurtle extends Turtle {

	//�N������
	public static void main(String[] args) {
		Turtle.startTurtle(new FirstTurtle());
	}

	//�^�[�g���𓮂�������
	public void start() {
	
		//�ӂ̒�������͂�����
		print("��������͂��Ă�������");
		int len = input();
		
		//�l�p�`������
		for(int i = 0; i < 4; i++){
			fd(len);
			rt(90);
		}
	}

}