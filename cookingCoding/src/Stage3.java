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
import java.awt.Font;

public class Stage3 extends JFrame {
	private JTextField textField;
	private JLabel splitApple = new JLabel();
	private JButton[] check = new JButton[5];
	private Stage4 stage4;
	private int checkNumber;
	private boolean isCorrect = true;

	public String dialogue[] = { Stage1.username + "! \n고마워 . \n이제 고른 사과를 썰어보자!", "다섯 조각이면 \n적당할 것 같아!",
			"그렇다면 다섯 번을 \n썰어야겠지?", "이렇게 같은 동작을 \n여러 번 해야 할때 \n우리는 for 이라고 \n불러!",
			"하지만 for을 \n사용할 때 동작을 \n몇 번 하고싶은지 \n알려줘야 해!", "어디서부터에 0을 넣고 \n어디까지에 내가 \n원하는 숫자를 넣어줘!",
			"순서를 꼭 지켜서 \n넣어줘야해!" };

	/**
	 * Launch the application.
	 */

	static public ImageIcon im1 = new ImageIcon("src/images/orange.png");
	static public ImageIcon im2 = new ImageIcon("src/images/grape.png");
	static public ImageIcon im3 = new ImageIcon("src/images/apple.png");
	static public ImageIcon cooker = new ImageIcon("scr/image/cook.png");
	static public ImageIcon input = new ImageIcon("src/image/input.png");

	int count = 0;
	int number = 0;

	/**
	 * Create the frame.
	 */
	public Stage3() {
		// 건들지 말것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 456);
		getContentPane().setLayout(null);

		JPanel pane_0 = new JPanel();
		pane_0.setLayout(null);
		pane_0.setBackground(new Color(255, 192, 203));
		pane_0.setForeground(new Color(255, 192, 203));
		pane_0.setBounds(0, 0, 473, 321);
		getContentPane().add(pane_0);

		JLabel smallApple = new JLabel("New label");
		smallApple.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\smallapple.png"));
		smallApple.setBounds(180, 166, 84, 145);
		pane_0.add(smallApple);

		JLabel label = new JLabel("New label");
		label.setVisible(false);
		label.setBounds(145, 169, 196, 139);
		pane_0.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\splitApple.png"));

		// 요리사 친구 버튼
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\AMPM\\Desktop\\cook.png"));
		lblNewLabel.setBounds(-17, 10, 202, 311);
		pane_0.add(lblNewLabel);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		textPane.setBounds(280, 36, 169, 145);
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

		NextButton.setBounds(364, 275, 97, 23);
		pane_0.add(NextButton);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\kitchen.png"));
		lblNewLabel_1.setBounds(0, 0, 473, 321);
		pane_0.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 320, 473, 97);
		getContentPane().add(panel_2);

		// 버튼 다섯개
		JButton button1 = new JButton("New button");
		button1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic4.PNG"));
		button1.setBounds(47, 13, 97, 35);
		panel_2.add(button1);

		JButton button2 = new JButton("New button");
		button2.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic7.PNG"));
		button2.setBounds(193, 13, 86, 35);
		panel_2.add(button2);

		JButton button3 = new JButton("New button");
		button3.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic5.PNG"));
		button3.setBounds(331, 13, 97, 35);
		panel_2.add(button3);

		JButton button4 = new JButton("New button");
		button4.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic8.PNG"));
		button4.setBounds(108, 58, 97, 38);
		panel_2.add(button4);

		JButton button5 = new JButton("New button");
		button5.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic6.PNG"));
		button5.setBounds(264, 58, 97, 38);
		panel_2.add(button5);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\returnCherryPattern.png"));
		lblNewLabel_2.setBounds(0, -1, 473, 97);
		panel_2.add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBounds(472, 0, 136, 417);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\side.png"));
		lblNewLabel_3.setBounds(0, 5, 136, 412);
		panel.add(lblNewLabel_3);
		// <-

		// 이벤트 처리
		// 일일히 버튼을 넣어서 순서를 검사

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNumber != 0)
					isCorrect = false;

				checkNumber++;
				count++;
				panel_2.add(button1);
				if (count == 5) {
					if (isCorrect == false) {
						textPane.setText("친구, 순서가 맞지 않는 것 같아 다시 적어 줄래?");
						panel_2.removeAll();
						count = 0;
						checkNumber = 0;
						return;
					}

					textPane.setText("잘했어! 친구!");
					smallApple.setVisible(false);
					label.setVisible(true);

					NextButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							stage4 = new Stage4();
							stage4.setVisible(true);

						}
					});
				}

			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNumber != 1)
					isCorrect = false;
				checkNumber++;
				count++;
				panel_2.add(button2);
				if (count == 5) {
					if (isCorrect == false) {
						textPane.setText("친구, 순서가 맞지 않는 것 같아 다시 적어 줄래?");
						panel_2.removeAll();
						count = 0;
						checkNumber = 0;
						return;
					}

					textPane.setText("잘했어! 친구!");
					smallApple.setVisible(false);
					label.setVisible(true);
					NextButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							stage4 = new Stage4();
							stage4.setVisible(true);

						}
					});

				}
			}
		});
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNumber != 2)
					isCorrect = false;
				checkNumber++;
				count++;
				panel_2.add(button3);
				if (count == 5) {
					if (isCorrect == false) {
						textPane.setText("친구, 순서가 맞지 않는 것 같아 다시 적어 줄래?");
						panel_2.removeAll();
						count = 0;
						checkNumber = 0;
						return;
					}

					textPane.setText("잘했어! 친구!");
					smallApple.setVisible(false);
					label.setVisible(true);
					NextButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							stage4 = new Stage4();
							stage4.setVisible(true);

						}
					});
				}
			}
		});
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNumber != 3)
					isCorrect = false;
				checkNumber++;
				count++;
				panel_2.add(button4);
				if (count == 5) {
					if (isCorrect == false) {
						textPane.setText("친구, 순서가 맞지 않는 것 같아 다시 적어 줄래?");
						panel_2.removeAll();
						count = 0;
						checkNumber = 0;
						return;
					}
					textPane.setText("잘했어! 친구!");
					smallApple.setVisible(false);
					label.setVisible(true);
					NextButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							stage4 = new Stage4();
							stage4.setVisible(true);

						}
					});
				}
			}

		});
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNumber != 4)
					isCorrect = false;
				checkNumber++;
				count++;
				panel_2.add(button5);
				if (count == 5) {
					if (isCorrect == false) {
						textPane.setText("친구, 순서가 맞지 않는 것 같아 다시 적어 줄래?");
						panel_2.removeAll();
						count = 0;
						checkNumber = 0;
						return;
					}

					textPane.setText("잘했어! 친구!");
					count = 0;
					smallApple.setVisible(false);
					label.setVisible(true);
					NextButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							stage4 = new Stage4();
							stage4.setVisible(true);

						}
					});
				}
			}
		});

	}// <-똥냄새 나는 코딩

}