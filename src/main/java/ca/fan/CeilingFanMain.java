package ca.fan;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CeilingFanMain extends JFrame implements ActionListener {

  private static final long serialVersionUID = -8398491215656869374L;

  private enum CeilingFanCords {
    SPEED,
    DIRECTION
  }

  private static JFrame frame;
  
  private CeilingFan ceilingFan;

  public CeilingFanMain() {
    ceilingFan = new CeilingFan();
    System.out.println("Initial ceiling fan state: " + ceilingFan.toString());
  }

  public static void main(String[] args) {
    CeilingFanMain instance = new CeilingFanMain();

    setupFrame();
    setupButtons(instance);

    frame.setVisible(true);
  }

  private static void setupFrame() {
    frame = new JFrame("Ceiling Fan");
    frame.setPreferredSize(new Dimension(200, 150));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.pack();
  }

  private static void setupButtons(CeilingFanMain instance) {
    JPanel panel = new JPanel();

    Arrays.asList(CeilingFanCords.values())
        .forEach(
            c -> {
              JButton button = new JButton(c.toString() + " CORD");
              button.setActionCommand(c.toString());
              button.addActionListener(instance);

              button.setSize(100, 200);
              panel.add(button);
            });

    frame.getContentPane().add(panel);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals(CeilingFanCords.SPEED.toString())) {
      ceilingFan.changeSpeed();
      System.out.println(ceilingFan.toString());
    }
    if (e.getActionCommand().equals(CeilingFanCords.DIRECTION.toString())) {
      ceilingFan.changeDirection();
      System.out.println(ceilingFan.toString());
    }
  }
}
