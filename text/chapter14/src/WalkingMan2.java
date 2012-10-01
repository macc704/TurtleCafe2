/*
 * WalkingMan2.java
 * �l�������A�j���[�V�����v���O���� (List�g�p��)
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class WalkingMan2 extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new WalkingMan2());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		window.setSize(1100, 500);

		// �A�j���[�V�����p�摜��p�ӂ���
		ListTurtle<ImageTurtle> holder = new ListTurtle<ImageTurtle>(true);
		holder.warpByTopLeft(50, 200);
		for (int i = 1; i <= 8; i++) {
			holder.addLast(new ImageTurtle("man" + i + ".gif"));
		}

		Turtle man = new Turtle();

		// �A�j���[�V�������[�v
		while (true) {
			// --- �҂� ---
			sleep(0.1); // 0.1�b

			// --- �������s�� ---
			holder.moveCursorToNext();
			man.looks(holder.getObjectAtCursor());

			// --- �ĕ`�悷�� ---
			update();
		}

	}
}