import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CookintStart extends JFrame {

	Stage1 stage1;

	public CookintStart() {
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		panel.setBounds(0, 0, 693, 462);
		getContentPane().add(panel);
		this.setSize(704, 501);
		this.setVisible(true);
		panel.setLayout(null);
		
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\pie.png"));
				lblNewLabel.setBackground(new Color(255, 192, 203));
				lblNewLabel.setBounds(150, 106, 343, 209);
				panel.add(lblNewLabel);
		

		JButton button = new JButton("시작해봐요!");
		button.setBounds(244, 398, 154, 54);
		panel.add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				stage1 = new Stage1();
				stage1.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\asdf.png"));
		lblNewLabel_1.setBounds(-23, -33, 767, 537);
		panel.add(lblNewLabel_1);

	}

	public static void main(String[] args) {
		new CookintStart();

	}

}
