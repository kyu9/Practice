package sonagi;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Sonagi_GameView extends JFrame implements ActionListener, KeyListener, ListSelectionListener {

	private JTextField textField_1;
	private JButton btn_gamestart;
	private String[] game_LV = { "lv 1", "lv 2", "lv 3", "lv 4", "lv 5"};
	private JPanel panel_Screen;
	private JLabel label[] = new JLabel[10000];
	private JLabel score;
	private int scorenum = 0;
	private int i = 0;
	private JList list;
	private int spd = 3500;
	private int life = 0;
	private JLabel level;
	private JPanel panel_over;
	private JLabel Well;
	private JLabel lblNewLabel;
	private JLabel lblScore;
	private JLabel Label_nickname;
	private JLabel lblNick;
	private String NickName;
	private Image st;
	private Image man2;
	private Image hry;
	private Image sd;
	private JLabel sad;
	private JLabel save;
	private JLabel hurry;
	private JLabel panel_life1;
	private JLabel panel_life2;
	private JLabel panel_life3;
	Sonagi_main main;

	public Sonagi_GameView(String Nick) {
		NickName = Nick;// �г��� ���� ����

		// ȭ�鱸��
		setTitle("����� ���ϱ�!");
		setSize(1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		textField_1 = new JTextField();// �ܾ��Է�
		textField_1.setBounds(380, 631, 267, 38);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		list = new JList(game_LV);// ���� ����Ʈ �����ֱ�
		list.setSelectedIndex(0);
		list.setFont(new Font("����", Font.BOLD, 22));
		list.setBounds(986, 200, 162, 140);
		getContentPane().add(list);

		btn_gamestart = new JButton("����");// ���� ��ư
		btn_gamestart.setFont(new Font("����", Font.BOLD, 23));
		btn_gamestart.setBounds(700, 627, 105, 38);
		getContentPane().add(btn_gamestart);
		
		panel_Screen = new JPanel();// ����ȭ��
		panel_Screen.setForeground(Color.PINK);
		panel_Screen.setBackground(Color.PINK);
		panel_Screen.setBounds(223, 39, 740, 571);
		getContentPane().add(panel_Screen);
		panel_Screen.setLayout(null);
		panel_Screen.setVisible(false);

		JPanel panel_1 = new JPanel(); // ����ȭ�鿡�� ������ ��
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 520, 740, 10);
		panel_Screen.add(panel_1);

		
		score = new JLabel("Score: 0��");// ������
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setFont(new Font("����", Font.BOLD, 25));
		score.setBounds(60, 241, 149, 45);
		getContentPane().add(score);

		Label_nickname = new JLabel("Nick: " + Nick); //�г��� 
		Label_nickname.setHorizontalAlignment(SwingConstants.CENTER);
		Label_nickname.setFont(new Font("����", Font.BOLD, 25));
		Label_nickname.setBounds(60, 200, 149, 27);
		getContentPane().add(Label_nickname);

		level = new JLabel(); //���� ����Ʈ
		level.setHorizontalAlignment(SwingConstants.CENTER);
		level.setBounds(846, 142, 99, 21);
		//getContentPane().add(level);
		//824, 864,904 40��
		
		panel_life1 = new JLabel();
		panel_life1.setBounds(100,319,26,27);
		st = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\1.PNG");
		st = st.getScaledInstance(panel_life1.getWidth(), panel_life1.getHeight(), 0);
		ImageIcon icon1 = new ImageIcon(st);
		panel_life1.setIcon(icon1);
		getContentPane().add(panel_life1);
		
		panel_life2 = new JLabel();
		panel_life2.setBounds(140,319,26,27);
		st = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\1.PNG");
		st = st.getScaledInstance(panel_life2.getWidth(), panel_life2.getHeight(), 0);
		ImageIcon icon2 = new ImageIcon(st);
		panel_life2.setIcon(icon2);
		getContentPane().add(panel_life2);

		panel_life3 = new JLabel();
		panel_life3.setBounds(180,319,26,27);
		st = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\1.PNG");
		st = st.getScaledInstance(panel_life3.getWidth(), panel_life3.getHeight(), 0);
		ImageIcon icon3 = new ImageIcon(st);
		panel_life3.setIcon(icon3);
		getContentPane().add(panel_life3);

		// ���Ӱ��ȭ��
		panel_over = new JPanel();// ���Ӱ�� �齺���� 
		panel_over.setBounds(200, 30, 794, 286);
		panel_over.setVisible(false);
		getContentPane().add(panel_over);
		panel_over.setLayout(null);
		
		hurry = new JLabel();
		hurry.setBounds(970, 400, 200, 300);
		hry = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\7.PNG");
		hry = hry.getScaledInstance(hurry.getWidth(), hurry.getHeight(), 0);
		ImageIcon hrycon = new ImageIcon(hry);
		hurry.setIcon(hrycon);
		hurry.setVisible(true);
		getContentPane().add(hurry);
		
		sad = new JLabel();
		sad.setBounds(250, 200, 700, 450);
		sd = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\6.PNG");
		sd = sd.getScaledInstance(sad.getWidth(), sad.getHeight(), 0);
		ImageIcon sadcon = new ImageIcon(sd);
		sad.setIcon(sadcon);
		sad.setVisible(false);
		getContentPane().add(sad);
		
		lblNewLabel = new JLabel("Game Over"); // ���� ���� �� 
		lblNewLabel.setBounds(0, 36, 794, 63);
		panel_over.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 54));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		lblNick = new JLabel("Nick");// �г��� 
		lblNick.setBounds(0, 115, 794, 45);
		panel_over.add(lblNick);
		lblNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblNick.setForeground(Color.RED);
		lblNick.setFont(new Font("����", Font.BOLD, 54));

		lblScore = new JLabel("Score"); // ���Ӱ�� ���� 
		lblScore.setBounds(0, 232, 794, 42);
		panel_over.add(lblScore);
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setForeground(Color.RED);
		lblScore.setFont(new Font("����", Font.BOLD, 54));

		Well = new JLabel("���ϱ� ����!");
		Well.setBounds(0, 36, 794, 63);
		Well.setFont(new Font("����",Font.BOLD,54));
		panel_over.add(Well);
		Well.setHorizontalAlignment(SwingConstants.CENTER);
		Well.setForeground(Color.red);
	

		
		setVisible(true);

		// ��ư,����Ʈ,Ű �̺�Ʈ������ �ؽ�Ʈ�ʵ���Ŀ�� ����
		btn_gamestart.addActionListener(this); // ��ư �̺�Ʈ
		textField_1.addKeyListener(this); // Ű �̺�Ʈ
		list.addListSelectionListener(this); // ����Ʈ �̺�Ʈ
		textField_1.requestFocus(); // �ؽ�Ʈ ��Ŀ��

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		// ���ӽ��� ��ư �̺�Ʈ
		if (e.getSource().equals(btn_gamestart)) {

			// ������ 0 = ������ ��� �ִ°�
			life = 0;
			score.setText("Score: 0��"); // ���ӽ��۽� ������ 0��
			scorenum = 0; // �������� ���� =0
			// ���࿡ ���Ӱ��ȭ���� ����� ������ ������ �ʰ�
			if (panel_over.isVisible()) {
				panel_over.setVisible(false);// ���ȭ�� �Ⱥ��̰�
			}

			// �ܾ ������� �ִ��� Ȯ��
			if (label[0] != null) {
				for (int i = 0; i < label.length; i++) {
					// �����尡 ���ư��� ������ ����
					if (!new Sonagi_Thead().isAlive() || !new Sonagi_Move().isAlive()) {
						new Sonagi_Thead().interrupt();// �ܾ� ������ ����
						new Sonagi_Move().interrupt();// �������� ������ ����
					}
					// �ܾ ������� �ִٸ� �Ⱥ��̰�
					if (label[i] != null) {
						label[i].setVisible(false);
					}

				}
			}

			
			// ���ӽ��۽� �ؽ�Ʈ�ʵ� ��Ŀ�� �ֱ�
			textField_1.requestFocus();
			// �ܾ �ѷ��ִ� ������ ����
			new Sonagi_Thead().start();

		}
	}

	// �ܾ �Է��Ͽ� ���ϴܾ� �ִ��� Ȯ���ϴ� Ű�̺�Ʈ
	@Override
	public void keyPressed(KeyEvent e) {

		// ����Ű �̺�Ʈ
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			// �ؽ�Ʈ �ʵ忡 ���� �ִ��� ������ Ȯ��
			if (!textField_1.getText().equals("")) {
				// String ������ �ؽ�Ʈ �� �ֱ�
				String work_answer = textField_1.getText().toString();
				/*
				 * �ؽ�Ʈ �Է°��� ������ �ܾ� �ִ��� �˻� ���� �ܾ� ������ �Ⱥ��̰� �ϰ� ���� 5�� �ֱ� ,�ؽ�Ʈ��
				 * ����(�ܾ Ʋ������ )
				 * 
				 */

				for (int i = 0; i <= label.length; i++) { // ���� �ܾ� �˻� for
					try {
						if (work_answer.equals(label[i].getText())) {// ���ϴܾ� �˻�
							if (label[i].isVisible()) { // ���ϴܾ ȭ�鿡 ������ �ִ��� �˻�
								scorenum = scorenum += 5; // ���� +5
								score.setText("Score: " + scorenum + "��"); // ������ ���� ����
								label[i].setVisible(false);// �ܾ� ȭ�鿡�� �Ⱥ��̰�
								textField_1.setText("");// �ؽ�Ʈ �� ���ֱ�
							}
						} else {
							textField_1.setText("");
						}
					} catch (Exception e2) {
						e2.getMessage();
					}

				}

			}

		}
		
		//��
		if(scorenum>=30)
		{
			save = new JLabel();
			save.setBounds(250, 200, 700, 450);
			man2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\5.PNG");
			man2 = man2.getScaledInstance(save.getWidth(), save.getHeight(), 0);
			ImageIcon mancon2 = new ImageIcon(man2);
			save.setIcon(mancon2);
			getContentPane().add(save);
			save.setVisible(true);
			
			JLabel done = new JLabel("�����ϼ̽��ϴ�! 30�� �޼�!!");
			done.setBounds(300,50,600,100);
			done.setFont(new Font("�޸յձ�������",Font.BOLD,40));
			done.setForeground(Color.blue);
			done.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(done);
			done.setVisible(true); 
			
			panel_Screen.setVisible(false);
			list.setVisible(false);
			score.setVisible(false);
			hurry.setVisible(false);
			Label_nickname.setVisible(false);
			textField_1.setVisible(false);
			btn_gamestart.setVisible(false);
			level.setVisible(false);
			panel_life1.setVisible(false);
			panel_life2.setVisible(false);
			panel_life3.setVisible(false);
			save.setVisible(true);
			new Sonagi_Thead().interrupt();
			new Sonagi_Move().interrupt();
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	class Words{ 
		Vector<String > wordVector = new Vector<String>();
		public Words(String fileName) {
			try {
				Scanner scanner = new Scanner(new FileReader(fileName));
				while(scanner.hasNext()) {
					String word = scanner.nextLine();
					wordVector.add(word);
				}scanner.close();
			}
			catch(FileNotFoundException e) {
				System.out.println("File error");
				System.exit(0);
			}
		}
		public String getRanWord() {
			final int wordmax = wordVector.size();
			int index = (int)(Math.random()*wordmax);
			return wordVector.get(index);
		}
	}
	// �ܾ �ϳ��� �ѷ��ִ� ������
	class Sonagi_Thead extends Thread {

		@Override
		public void run() {
			panel_Screen.setVisible(true);// ����ȭ�� ����
			// �ܾ ������ ���� �ӵ��� ����ȭ�鿡 x�� �������λ���
			for (i = 0; i <= 10000; i++) {

				try {
					Words word = new Words("WordList.txt");
					String temp = word.getRanWord();
					Random random = new Random();// ���� ��ü ����

					label[i] = new JLabel(temp);// �ܾ�
																	// �������
					label[i].setBounds(0, 0, 200, 20);// �ܾ� �ʱ� ��ġ ����,�� ����
					label[i].setFont(new Font("����",Font.BOLD,21));
					panel_Screen.add(label[i]);// �ܾ� �߰�
					label[i].setLocation(random.nextInt(678), 2);// x�� �������� �����ֱ�
					// �ܾ �����̴� ������ ����
					new Sonagi_Move().start();

					Thread.sleep(spd);// ���ӷ����� ���� �ܾ�ӵ�

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	// �ܾ� ��������,���ӿ��� Ȯ���ϴ� ������
	class Sonagi_Move extends Thread {

		@Override
		public void run() {

			// �ܾ� ���� ���� ��ŭ for ���� �� �ܾ�� y�� ����
			for (int a = 0; a <= i; a++) {
				if (label[a].isVisible()) {
					int sp = label[a].getY();
					int xp = label[a].getX();

					label[a].setLocation(xp, sp + 30);

				}

				// �ܾ �������ִ� ���·� �������� �Ѿ����� Ȯ��
				if (label[a].isVisible() && label[a].getY() > 512) {
					label[a].setVisible(false);// �ܾ ���� ������ �ܾ� �����
					life++;// ������ 1 = ���� 1������
				}
			}

			// ������ Ȯ��
			switch (life) {
			case 1: // ���� 1�� ������
				panel_life1.setVisible(false);
				break;

			case 2:// ���� 2 ������
				panel_life1.setVisible(false);
				panel_life2.setVisible(false);
				break;
			case 3:// ���� 3�� ������ ���ӿ���
				if(scorenum<30) {
					panel_life1.setVisible(false);
					panel_life2.setVisible(false);
					panel_life3.setVisible(false);
					// ���� ���ȭ�� ����
					panel_Screen.setVisible(false);
					//panel_over.setVisible(true);
					list.setVisible(false);
					score.setVisible(false);
					hurry.setVisible(false);
					Label_nickname.setVisible(false);
					textField_1.setVisible(false);
					btn_gamestart.setVisible(false);
					level.setVisible(false);
					lblScore.setText(score.getText());
					lblNick.setText(NickName);
					sad.setVisible(true);
					JLabel bad = new JLabel("GameOver!");
					bad.setBounds(300,50,600,100);
					bad.setFont(new Font("�޸յձ�������",Font.BOLD,40));
					bad.setForeground(Color.red);
					bad.setHorizontalAlignment(SwingConstants.CENTER);
					bad.setVisible(true);
					getContentPane().add(bad);
					// ������ ����
					new Sonagi_Thead().interrupt();
					new Sonagi_Move().interrupt();
				}

					break;
				default:
					break;
			}
		}
	}

	//Main ��� 
	public void setSonagi_main(Sonagi_main main) {
		this.main = main;
	}

	// ��������Ʈ �̺�Ʈ ó��
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		String str;
		if (arg0.getSource() == list) {

			switch (list.getSelectedIndex()) {
			case 0:
				spd = 3000;// ���Ӽӵ�
				str = (String) list.getSelectedValue();// ����Ʈ �̸� ����
				level.setText(str); // ���� �󺧿� �����ֱ�
				break;
			case 1:
				spd = 2300;// ���Ӽӵ�
				str = (String) list.getSelectedValue();// ����Ʈ �̸� ����
				level.setText(str);// ���� �󺧿� �����ֱ�
				break;
			case 2:
				spd = 1500;// ���Ӽӵ�
				str = (String) list.getSelectedValue();// ����Ʈ �̸� ����
				level.setText(str);// ���� �󺧿� �����ֱ�
				break;
			case 3:
				spd = 1000;// ���Ӽӵ�
				str = (String) list.getSelectedValue();// ����Ʈ �̸� ����
				level.setText(str);// ���� �󺧿� �����ֱ�
				break;
			case 4:
				spd = 700;// ���Ӽӵ�
				str = (String) list.getSelectedValue();// ����Ʈ �̸� ����
				level.setText(str);// ���� �󺧿� �����ֱ�
				break;
			default:
				break;
			}
		}
	}
}
