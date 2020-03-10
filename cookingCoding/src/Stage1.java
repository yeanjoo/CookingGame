import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Stage1 extends JFrame {
	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField2;

	Font font = new Font("돋움", Font.PLAIN, 20);

	public String dialogue[] = { "친구들\n우리 같이 맛있는\n사과 파이를 \n만들어 볼까?", "먼저 친구의 \n이름을 알려줄레?",
			"printf는 \n컴퓨터가 친구에게 \n말을 하는 함수야", "scanf는 \n친구가 컴퓨터에게 \n말을 하는 함수야",
			"상황에게 따라 \n적절하게 누른다면 \n컴퓨터와 친구가 \n될 수 있을꺼야!", "일단 컴퓨터에게 \n친구의 이름을 \n알려줄까?" };

	/**
	 * Launch the application.
	 */
	static public String username;
	static public ImageIcon input = new ImageIcon("src/image/input.png");
	static public ImageIcon compile = new ImageIcon("scr/image/compile.png");
	static public ImageIcon again = new ImageIcon("scr/image/for.png");
	static public ImageIcon elif = new ImageIcon("scr/image/elif.png");
	static public ImageIcon output = new ImageIcon("scr/image/output.png");
	static public ImageIcon to = new ImageIcon("scr/image/to.png");
	static public ImageIcon where = new ImageIcon("scr/image/where.png");
	public ImageIcon cooker = new ImageIcon("../image/input.png");

	int page = 1;
	int number = 0;
	private JTextField textField_1;

	Stage2 stage2;
	private final JLabel lblNewLabel_2 = new JLabel("New label");

	/**
	 * Create the frame.
	 */

	public Stage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension frameSize = frame.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		setBounds(100, 100, 669, 456);
		getContentPane().setLayout(null);

		JPanel pane_0 = new JPanel();
		pane_0.setLayout(null);
		pane_0.setBackground(new Color(255, 192, 203));
		pane_0.setForeground(new Color(255, 192, 203));
		pane_0.setBounds(0, 0, 473, 321);
		getContentPane().add(pane_0);

		textField = new JTextField();
		pane_0.add(textField);
		textField.setColumns(10);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		textPane.setBounds(262, 36, 199, 162);
		textPane.setOpaque(true);
		pane_0.add(textPane);

		// 요리사 친구
		JButton cook = new JButton(cooker);

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

		textField2 = new JTextField();
		textField2.setBounds(45, 219, 394, 21);
		textField2.setVisible(false);
		pane_0.add(textField2);
		textField2.setColumns(10);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\cook.png"));
		label.setBackground(new Color(255, 255, 255));
		label.setBounds(-118, 10, 345, 303);
		pane_0.add(label);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\kitchen.png"));
		lblNewLabel.setBounds(0, 0, 473, 321);
		pane_0.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(472, 0, 181, 417);
		getContentPane().add(panel_1);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\side.png"));
		lblNewLabel_2.setBounds(0, 0, 179, 159);
		panel_1.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(0, 161, 179, 256);
		panel_1.add(label_1);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 320, 473, 97);
		getContentPane().add(panel_2);

		JButton inputButton = new JButton(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic1.PNG"));

		// 이벤트 처리
		inputButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (page == 1) {
					panel_1.add(inputButton);
					textPane.setText("잘했어 친구! 이제 아래 이름을 넣어줘!");
					page++;
					// 소리도 넣기
					textField2.setVisible(true);

					NextButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							if (e.getSource().equals(NextButton)) {
								username = textPane.getText().toString();
								textPane.setText("그럼 이제 또 \n다른 버튼을 눌러서 요리사의 이름을 알아볼까?");
								textField.setVisible(false);
							}
						}
					});
				} else
					textPane.setText("블록을 잘못 눌렀어 다시 눌러볼까?");
			}
		});
		inputButton.setBounds(39, 27, 137, 51);
		panel_2.add(inputButton);

		JButton outputButton = new JButton(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic2.PNG"));
		outputButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource().equals(outputButton)) {

					if (page == 2) {
						panel_1.add(outputButton);
						textPane.setText("잘했어 친구!\n" + "내 이름은 \n 폰 노이만 이라고 해 \n앞으로 잘 부탁해!");
						stage2 = new Stage2();
						stage2.setVisible(true);

						NextButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								if (e.getSource().equals(NextButton)) {
									stage2 = new Stage2();

								}

							}
						});

					} else
						textPane.setText("블록을 잘못 눌렀어 \n다시 눌러볼까?");

				}

			}
		});
		outputButton.setBounds(281, 27, 137, 51);
		panel_2.add(outputButton);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 473, 93);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\returnCherryPattern.png"));
	}

	private void setLayout(int center) {

	}
}
