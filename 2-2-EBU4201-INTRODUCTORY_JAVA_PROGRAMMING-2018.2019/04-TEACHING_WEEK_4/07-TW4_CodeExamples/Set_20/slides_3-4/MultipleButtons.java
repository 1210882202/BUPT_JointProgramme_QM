import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultipleButtons extends JFrame implements ActionListener {
  private JButton addButton,minusButton;
  private JLabel label;
  private int number;

  public MultipleButtons() {
    // super();
    super("Multiple Buttons");
    addButton = new JButton("Add");
    addButton.addActionListener(this);
    minusButton = new JButton("Minus");
    minusButton.addActionListener(this);
    label = new JLabel(""+ number, JLabel.CENTER);
    this.getContentPane().add(this.addButton, BorderLayout.EAST);
    this.getContentPane().add(this.label, BorderLayout.CENTER);
    this.getContentPane().add(this.minusButton, BorderLayout.WEST);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 100);
    this.setVisible(true);
  }

  public static void main(String[] args) { new MultipleButtons(); }

  public void actionPerformed(ActionEvent e){
	// How do we figure out which JButton is which?
        JButton eventSource = (JButton) e.getSource();
	if (eventSource.equals(addButton)) label.setText("" + (++number));
	else if (eventSource.equals(minusButton)) label.setText("" + (--number));
  }
}