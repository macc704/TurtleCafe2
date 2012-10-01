/*
 * �v���O�������F�J�[�h�����X�g�P���烊�X�g�Q�Ɉړ�����v���O����
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class MoveCards extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveCards());
	}

	// �^�[�g���𓮂�������
	public void start() {

		hide();
		Turtle.window.size(550, 300);

		// ���X�g���Q���
		ListTurtle<CardTurtle> list1 = new ListTurtle<CardTurtle>(true, "���X�g1");
		list1.warp(50, 40);
		ListTurtle<CardTurtle> list2 = new ListTurtle<CardTurtle>(true, "���X�g2");
		list2.warp(50, 110);

		// ���X�g�P�ɂP�O���̃J�[�h������
		for (int i = 0; i < 10; i++) {
			list1.addLast(new CardTurtle(i * 10));
		}

		// �A�j���V�������[�v
		do {
			sleep(0.5);

			if (list1.getSize() != 0) {
				list2.addLast(list1.getObjectAtCursor());// ���ꕨ�P������ꕨ�Q�ɃJ�[�h���ړ�����
			} else if (list1.getSize() == 0) {
				break;// �A�j���[�V�������[�v�𔲂���
			}

			update();
		} while (true);

		print("�A�j���[�V�������[�v���I�����܂����D");
	}

}