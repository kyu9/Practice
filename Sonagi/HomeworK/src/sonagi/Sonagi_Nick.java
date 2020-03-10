package sonagi;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JList;

class Sonagi_Nick extends JFrame implements ActionListener,KeyListener{
	private JTextField textField;// �г��� �Է�â
	private  JLabel lblNewLabel;  // �� 
	private JLabel back;
	private Image im;
	private JLabel eNewLabel;
	public  String Nick_Name; // �г��� ���� 
	Sonagi_main main; // Main
	
	
	public Sonagi_Nick(){
		// ȭ�鱸�� 
		setSize(500,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("����Ǳ��ϱ�");
		getContentPane().setLayout(null);
		
		back = new JLabel();
		back.setBounds(0,280,this.getWidth(),290);
		im = Toolkit.getDefaultToolkit().getImage("C:\\Users\\�Ե�\\Pictures\\8.PNG");
		im = im.getScaledInstance(back.getWidth(),back.getHeight(),0);
		ImageIcon icon = new ImageIcon(im);
		back.setIcon(icon);
		getContentPane().add(back);
		back.setOpaque(true);
		back.setVisible(true);
		

		eNewLabel = new JLabel("����� ���ϱ�");
	    eNewLabel.setFont(new Font("�޸�ձ�������", Font.BOLD, 50));
	    eNewLabel.setForeground(Color.BLACK);
	    eNewLabel.setBounds(60, 38, 381, 131);
	    eNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    getContentPane().add(eNewLabel);
	      
	    lblNewLabel = new JLabel("�̸��� �Է��ϼ���!"); // �� 
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(60, 118, 381, 131);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField(); //�г��� �Է�â 
		textField.setFont(new Font("����", Font.BOLD, 24));
		textField.setBounds(84, 221, 208, 49);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ȯ��"); //Ȯ�ι�ư 
		btnNewButton.setFont(new Font("����", Font.BOLD, 22));
		btnNewButton.setBounds(310, 221, 92, 49);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel(""); // �г��� �� 
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 19));
		lblNewLabel_1.setBounds(24, 202, 188, 47);
		getContentPane().add(lblNewLabel_1);
		setVisible(true);
		// �г��� �Է�â Ű �̺�Ʈ (this)
		textField.addKeyListener(this);
		
	}
	// ��ư  �̺�Ʈ 
	@Override
	public void actionPerformed(ActionEvent e)
	     {
		  
		if(!textField.getText().equals("")){
			
			// �ؽ�Ʈ �̷�â�� ���� �ִٸ� �г��� ������ ���� �� ����ȭ�� ���� 
			Nick_Name = textField.getText().toString();
			main.showGameView(this, Nick_Name);
			
			
		}else {
			// �ؽ�Ʈ �Է�â�� ���� ���ٸ� ���ؽ�Ʈ ���� 
			lblNewLabel.setText("�ùٸ��� ���� �г��� �Դϴ�.");
		}
		
	}

	//Main ��� 
	public void setSonagi_main(Sonagi_main main) {
	
		this.main =main;
		
	}
//����Ű �̺�Ʈ 
	@Override
	public void keyPressed(KeyEvent e) {
		//����Ű �̺�Ʈ 
		if (e.getKeyCode() == KeyEvent.VK_ENTER){
			// �ؽ�Ʈ �̷�â�� ���� �ִٸ� �г��� ������ ���� �� ����ȭ�� ���� 
		if(!textField.getText().equals("")){
			
			Nick_Name = textField.getText().toString();
			main.showGameView(this, Nick_Name);
			
		}else {
			// �ؽ�Ʈ �Է�â�� ���� ���ٸ� ���ؽ�Ʈ ���� 
			lblNewLabel.setText("�̸��� �Է��ϼ���!");
		}
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
	
}