/**
 * �L�[�ɑΉ����ĎԂ������v���O����
 * 
 * Yoshiaki Matsuzawa 2003/06/23
 */
public class HandleKey extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKey());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();// �^�[�g��������

		// �Ԃ𐶐�
		ImageTurtle car = new ImageTurtle("car.gif");

		while (true) {

			// --- �҂� ---
			sleep(0.025);

			// --- ���� ---
			// ���L�[��������Ă�����C�Ԃ𓮂���
			int x = car.getX();
			int y = car.getY();
			if (key() == 37) { // ��
				car.warp(x - 5, y);
			}

			// --- �ĕ`�� ---
			update();
		}
	}

}