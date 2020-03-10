import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTable;

public class Stage2 extends JFrame {

	public String dialogue[] = { "잘했어!" + Stage1.username + "친구! 오늘 우리는 컴퓨터를 이용해 사과파이를 만들거야!",
			"사과파이를 만들기 위해서는 사과가 필요하겠지?", "나를 위해 사과를 골라줘!", "if 문을 사용하면 과일을 고를 수 있어!",
			"왜냐면 if 라는 뜻은 '만약에' 라는 뜻이기 때문이야!" };

	/**
	 * Launch the application.
	 */

	static public ImageIcon im1 = new ImageIcon("src/images/orange.png");
	static public ImageIcon im2 = new ImageIcon("src/images/grape.png");
	static public ImageIcon im3 = new ImageIcon("src/images/apple.png");
	static public ImageIcon cooker = new ImageIcon("scr/image/cook.png");
	static public ImageIcon input = new ImageIcon("src/image/input.png");

	int page = 1;
	int number = 0;
	Stage3 stage3;

	/**
	 * Create the frame.
	 */
	public Stage2() {

		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 457);
		getContentPane().setLayout(null);

		JPanel pane_0 = new JPanel();
		pane_0.setLayout(null);
		pane_0.setBackground(new Color(255, 192, 203));
		pane_0.setForeground(new Color(255, 192, 203));
		pane_0.setBounds(0, 0, 473, 321);
		getContentPane().add(pane_0);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		textPane.setBounds(260, 48, 190, 178);
		pane_0.add(textPane);

		JButton NextButton = new JButton("NEXT");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource().equals(NextButton)) {
					if (dialogue[number] != null) {
						textPane.setText(dialogue[number]);
						number++;
					} else
						return;
				}

			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\cook.png"));
		lblNewLabel.setBounds(-139, -10, 574, 340);
		pane_0.add(lblNewLabel);
		NextButton.setBounds(364, 275, 97, 23);
		pane_0.add(NextButton);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\kitchen.png"));
		lblNewLabel_1.setBounds(0, 0, 471, 321);
		pane_0.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(472, 0, 161, 417);
		getContentPane().add(panel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\side.png"));
		lblNewLabel_2.setBounds(0, 0, 161, 417);
		panel_1.add(lblNewLabel_2);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 320, 473, 97);
		getContentPane().add(panel_2);

		// JButton orangeButton = new JButton(im1);
//      JButton grapeButton = new JButton(im2);
//      JButton appleButton = new JButton(im3);
//      
		JButton appleButton = new JButton("New button");
		appleButton.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic20.PNG"));
		appleButton.setBounds(327, 18, 97, 77);
		panel_2.add(appleButton);

		JButton orangeButton = new JButton("New button");
		orangeButton.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic21.PNG"));
		orangeButton.setBounds(38, 22, 84, 69);
		panel_2.add(orangeButton);

		JButton grapeButton = new JButton("New button");
		grapeButton.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic22.PNG"));
		grapeButton.setBounds(186, 20, 76, 73);
		panel_2.add(grapeButton);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\returnCherryPattern.png"));
		label.setBounds(0, 0, 473, 97);
		panel_2.add(label);

		// 이벤트 처리
		appleButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (page == 1) {
					panel_1.add(appleButton);
					textPane.setText("잘했어 친구!");
					page++;
					// 소리도 넣기
					NextButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							stage3 = new Stage3();
							stage3.setVisible(true);

						}

					});
				}
			}
		});
		orangeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("이 과일로는 \n사과파이를 만들 수 \n없어!");

			}

		});
		grapeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("이 과일로는 \n사과파이를 만들 수 \n없어!");

			}

		});

//      

	}
}