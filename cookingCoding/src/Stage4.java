import java.awt.Color;
import java.awt.FlowLayout;
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

public class Stage4 extends JFrame {
	private JTextField textField;
	private Stage5 stage5 = new Stage5();

	public String dialogue[] = { Stage1.username + "가 \n사과를 준비해 줄 동안 \n나는 다른 반죽 등을 \n준비했어!",
			"이제 내 반죽과 \n너의 사과를 합쳐 \n사과파이를 만들어보자!", "너가 준비됬다면 \n알려줘! ",
			"하지만 사용한 재료와 \n같지 않는 반죽 종류를 \n써버리면  파이가 \n망쳐질 꺼야", "예를 들면 사과 파이에 고구마 파이 반죽을 사용하면 분명 파이 맛이 이상하겠지?",
			"컴퓨터에서는 이런 파이 반죽들의 종류들을 자료형이라고 해", "내가 파이에 사용한 \n반죽 종류는 \n숫자형 파이 반죽이야 \n숫자형 파이 반죽을 \n선택해줄래?" };

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

	/**
	 * Create the frame.
	 */
	public Stage4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 456);
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
		textPane.setBounds(262, 36, 199, 148);
		textPane.setOpaque(true);
		pane_0.add(textPane);

		// 요리사 친구
		JButton cook = new JButton(cooker);

		JButton NextButton = new JButton("NEXT");
		// NextButton을 누르면 대사가 넘어가게 함
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
		panel_1.setBounds(472, 0, 136, 417);
		getContentPane().add(panel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\side.png"));
		lblNewLabel_2.setBounds(0, 0, 136, 417);
		panel_1.add(lblNewLabel_2);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 320, 473, 97);
		getContentPane().add(panel_2);

		// 스트링 인트 버튼
		JButton stringButton = new JButton("stringButton");
		stringButton.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic10.PNG"));
		stringButton.setBounds(62, 31, 105, 39);
		panel_2.add(stringButton);

		JButton intButton = new JButton("stringButton");
		intButton.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pic3.PNG"));
		intButton.setBounds(292, 31, 105, 39);
		panel_2.add(intButton);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\returnCherryPattern.png"));
		lblNewLabel_1.setBounds(0, 0, 473, 97);
		panel_2.add(lblNewLabel_1);

		intButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText("정답이야!");
				NextButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						stage5 = new Stage5();
						stage5.setVisible(true);
					}

				});
			}
		});
		stringButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText("숫자형을 눌러줘 " + Stage1.username + "야");
			}
		});

	}
}
