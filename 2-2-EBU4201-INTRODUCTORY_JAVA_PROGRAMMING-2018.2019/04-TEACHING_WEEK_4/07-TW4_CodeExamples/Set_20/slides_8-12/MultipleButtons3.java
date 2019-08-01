import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultipleButtons3 extends JFrame {
  private JButton addButton, minusButton;
  private JLabel label;
  private int number;
  public MultipleButtons3() {
    super("Multiple Buttons");
    addButton = new JButton("Add");
    addButton.addActionListener(new PlusListener());
    minusButton = new JButton("Minus");
    minusButton.addActionListener(new MinusListener());
    label = new JLabel(""+ number, JLabel.CENTER);
    this.getContentPane().add(this.addButton, BorderLayout.EAST);
    this.getContentPane().add(this.label, BorderLayout.CENTER);
    this.getContentPane().add(this.minusButton, BorderLayout.WEST);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 100);
    this.setVisible(true);
  }
  public class PlusListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText(""+(++number));
    }
  }
  public class MinusListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText(""+(--number));
    }
  }
  public static void main(String[] args) { new MultipleButtons3(); }
}
