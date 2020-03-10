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

public class Stage5 extends JFrame {
   private JTextField textField;

   public String dialogue[] = { Stage1.username + "! 우리의 사과파이가 완성됬어!", "정말 수고 많았어",
         "이 요리는 끝났지만 오늘 배웠던 scanf,printf,if,for 잊지말기!", };

   public ImageIcon cooker = new ImageIcon("../image/input.png");

   int page = 1;
   int number = 0;
   private JTextField textField_1;

   /**
    * Create the frame.
    */
   public Stage5() {
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
                  System.exit(0);
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
      
      JLabel lblNewLabel_1 = new JLabel("New label");
      lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AMPM\\Desktop\\returnCherryPattern.png"));
      lblNewLabel_1.setBounds(0, 0, 473, 97);
      panel_2.add(lblNewLabel_1);

   }
}