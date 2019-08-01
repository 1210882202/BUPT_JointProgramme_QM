import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultipleButtons2 extends JFrame {
  private JButton addButton, minusButton;
  private JLabel label;
  private int number;

  public MultipleButtons2() {
    super("Multiple Buttons");
    addButton = new JButton("Add");
    addButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          label.setText("" + (++number));
        }
      }
    );
    minusButton = new JButton("Minus");
    minusButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("" + (--number));
      }
    });
    label = new JLabel(""+ number, JLabel.CENTER);
    this.getContentPane().add(this.addButton, BorderLayout.EAST);
    this.getContentPane().add(this.label, BorderLayout.CENTER);
    this.getContentPane().add(this.minusButton, BorderLayout.WEST);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 100);
    this.setVisible(true);
  }
  public static void main(String[] args) { new MultipleButtons2(); }
}
