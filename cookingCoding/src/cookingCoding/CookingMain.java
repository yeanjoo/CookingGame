package cookingCoding;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CookingMain implements MouseListener {
	// 이미지
	static public ImageIcon input = new ImageIcon("src/image/input.png");
	static public ImageIcon compile = new ImageIcon("scr/image/compile.png");
	static public ImageIcon again = new ImageIcon("scr/image/for.png");
	static public ImageIcon elif = new ImageIcon("scr/image/elif.png");
	static public ImageIcon output = new ImageIcon("file:///C:/Users/AMPM/eclipse-workspace/cookingCoding/src/image/output.png");
	static public ImageIcon to = new ImageIcon("scr/image/to.png");
	static public ImageIcon where = new ImageIcon("scr/image/where.png");

	String dialogue[] = { "안녕친구들 우리 같이 맛있는 사과 파이를 만들어 볼까?", "먼저 친구의 이름을 알려줄래?", "printf는 컴퓨터가 친구에게 말을 하는 함수야",
			"scanf는 친구가 컴퓨터에게 말을 하는 함수야", "상황에게 따라 적절하게 누를수 있다면 컴퓨터와 친구가 될 수 있을꺼야!" };
	JFrame frame = new JFrame();
	// stage1
	JButton bolckOfscanf = new JButton(input);
	JButton bolckOfprintf = new JButton(output);
	// stage2
	JButton bolckOfelif = new JButton(elif);
	// stage3
	JButton bolckOfto = new JButton(to);
	JButton bolckOfwhere = new JButton(where);
	// stage4
	JButton bolckOfexcute = new JButton(compile);

	JPanel firstPanel = new JPanel();
	JPanel secondPanel = new JPanel();
	JPanel thridPanel = new JPanel();

	JLabel text = new JLabel();
	JTextField inText = new JTextField();
	JLabel outText = new JLabel();
	GridBagLayout layout = new GridBagLayout();

	int page = 1;
	int number = 0;
	GridBagConstraints c = new GridBagConstraints();

	public CookingMain() {
		// 레이아웃 설정
		/*
		 * frame.setLayout(layout); frame.setVisible(true); frame.setSize(1200, 900);
		 * c.weightx = 1.0; c.weighty = 1.0; c.fill = GridBagConstraints.BOTH;
		 * c.gridwidth = 4; c.gridheight = 4; // 좌표찍기 layout(firstPanel, 0, 0, 2, 2);
		 * layout(secondPanel, 2, 2, 1, 3); layout(thridPanel, 0, 2, 3, 1);
		 */
		frame.setLayout(new GridLayout(3, 3));
		frame.setVisible(true);
		frame.setSize(1200, 900);
		frame.add(firstPanel);
		frame.add(secondPanel);
		frame.add(thridPanel);

		// 색갈 뒤에가서 지워주기
		firstPanel.setBackground(Color.BLACK);
		secondPanel.setBackground(Color.CYAN);
		thridPanel.setBackground(Color.GRAY);

		firstPanel.setLayout(null);
		secondPanel.setLayout(null);
		thridPanel.setLayout(null);

		// 버튼
		bolckOfscanf.setSize(230, 70);
		bolckOfprintf.setSize(230, 70);
		thridPanel.add(bolckOfscanf);
		thridPanel.add(bolckOfprintf);

		text.setText("이름을 알려주세요!");
		firstPanel.add(text);
		firstPanel.add(inText);

	}

	public void layout(Component obj, int x, int y, int width, int height) {
		c.gridx = x; // 시작위치 x
		c.gridy = y; // 시작위치 y
		c.gridwidth = width; // 컨테이너 너비
		c.gridheight = height; // 컨테이너 높이
		layout.setConstraints(obj, c);
		frame.add(obj);

	}

	public void action() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource().equals(bolckOfscanf)) {
			if (page == 1) {
				secondPanel.add(bolckOfscanf);
				text.setText("잘했어 친구!");
				
				page++;
				// 소리도 넣기
			} else
				text.setText("블록을 잘못 눌렀어 다시 눌러볼까?");
		}
		if (e.getSource().equals(bolckOfprintf)) {
			if (page == 2) {
				outText.setText(inText.getText().toString());
				secondPanel.add(bolckOfscanf);
				text.setText("잘했어 친구!");

			} else
				text.setText("블록을 잘못 눌렀어 다시 눌러볼까?");
		}
		if (e.getSource().equals(firstPanel)) {
			text.setText(dialogue[number]);
			number++;
		}
		;

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스 위에 있으면 안쪽 메시지 출력
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스 위에 있으면 바깥쪽 메시지 출력
	}

}
