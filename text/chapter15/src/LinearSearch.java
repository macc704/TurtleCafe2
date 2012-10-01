import java.awt.Color;

/*
 * �v���O�������F�ŏ��l�̌��� 
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class LinearSearch extends Turtle {

	// �N������
	public static void main(String[] args) {
		Turtle.startTurtle(new LinearSearch());
	}

	// �^�[�g���𓮂�������
	public void start() {
		hide();
		Turtle.window.size(550, 400);

		// �J�[�h�̑������
		ListTurtle<CardTurtle> �ŏ��l��� = new ListTurtle<CardTurtle>(true, "�ŏ��l���");
		ListTurtle<CardTurtle> �������� = new ListTurtle<CardTurtle>(true, "��������");
		ListTurtle<CardTurtle> �����ϑ� = new ListTurtle<CardTurtle>(true, "�����ϑ�");
		�ŏ��l���.warpByTopLeft(50, 20);
		�ŏ��l���.setBgColor(new Color(255, 153, 204));
		��������.warpByTopLeft(50, 90);
		��������.setBgColor(new Color(51, 102, 255));
		�����ϑ�.warpByTopLeft(50, 160);
		�����ϑ�.setBgColor(new Color(0, 204, 153));

		// �{�^�������
		ButtonTurtle stepButton = new ButtonTurtle("�X�e�b�v");
		stepButton.warpByTopLeft(400, 20);

		// �J�[�h��8�����A���������ɓ����
		for (int i = 0; i < 8; i++) {
			��������.addLast(new CardTurtle(random(100)));
		}
		waitForPushButton(stepButton);

		// ��ԏ������̂�������
		�ŏ��l���.addLast(��������.getObjectAtCursor());
		waitForPushButton(stepButton);
		while (��������.getSize() > 0) {
			if (��������.getObjectAtCursor().getNumber() < �ŏ��l���
					.getObjectAtCursor().getNumber()) {// (�������Ȃ���΁j
				�����ϑ�.addLast(�ŏ��l���.getObjectAtCursor());
				�ŏ��l���.addLast(��������.getObjectAtCursor());
			} else {
				�����ϑ�.addLast(��������.getObjectAtCursor());
			}
			waitForPushButton(stepButton);
		}
		�����ϑ�.moveAllTo(��������);
		waitForPushButton(stepButton);

	}

	// �X�e�b�v�{�^�����������܂ő҂�
	void waitForPushButton(ButtonTurtle button) {
		do {
			update();
			sleep(0.025);
		} while (!(button.isClicked()));
	}

}