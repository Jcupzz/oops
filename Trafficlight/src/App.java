import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class App implements ActionListener {

    String value = "";
    JFrame jFrame = new JFrame("Street Light");
    // JButton stand = new JButton();
    // JButton background = new JButton();
    JRadioButton redButton = new JRadioButton("Stop");
    JRadioButton yellowButton = new JRadioButton("Waiting");
    JRadioButton greenButton = new JRadioButton("Go");
    JButton stopView = new JButton();
    JButton waitView = new JButton();
    JButton goView = new JButton();

    App() {

        jFrame.setBounds(20, 20, 1000, 700);
        jFrame.setVisible(true);

        // stand.setBounds(495, 400, 30, 200);
        // stand.setBackground(Color.black);

        // background.setBounds(465, 100, 90, 250);
        // background.setBackground(Color.black);

        redButton.setBounds(900, 520, 70, 30);
     //   redButton.setBackground(Color.red);

        yellowButton.setBounds(900, 570, 70, 30);
     //   yellowButton.setBackground(Color.yellow);

        greenButton.setBounds(900, 620, 70, 30);
   //     greenButton.setBackground(Color.green);

        stopView.setBounds(485, 150, 50, 50);
        stopView.setBackground(Color.DARK_GRAY);
        waitView.setBounds(485, 220, 50, 50);
        waitView.setBackground(Color.DARK_GRAY);
        goView.setBounds(485, 290, 50, 50);
        goView.setBackground(Color.DARK_GRAY);

        jFrame.add(redButton);
        jFrame.add(yellowButton);
        jFrame.add(greenButton);

        jFrame.add(stopView);
        jFrame.add(waitView);
        jFrame.add(goView);

      //  jFrame.add(stand);
      //  jFrame.add(background);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // redButton.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent e) {

        // stopView.setBackground(Color.red);
        // waitView.setBackground(Color.DARK_GRAY);
        // goView.setBackground(Color.DARK_GRAY);

        // }

        // });
        // yellowButton.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent e) {

        // stopView.setBackground(Color.DARK_GRAY);
        // waitView.setBackground(Color.yellow);
        // goView.setBackground(Color.DARK_GRAY);

        // }

        // });
        // greenButton.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent e) {

        // stopView.setBackground(Color.DARK_GRAY);
        // waitView.setBackground(Color.DARK_GRAY);
        // goView.setBackground(Color.green);

        // }

        // });

    }

    public static void main(String[] args) throws Exception {

        new App();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (redButton.isSelected()) {
            stopView.setBackground(Color.RED);
            waitView.setBackground(Color.DARK_GRAY);
            goView.setBackground(Color.DARK_GRAY);
        }
        if (yellowButton.isSelected()) {
            stopView.setBackground(Color.DARK_GRAY);
            waitView.setBackground(Color.YELLOW);
            goView.setBackground(Color.DARK_GRAY);
        }
        if (greenButton.isSelected()) {
            stopView.setBackground(Color.DARK_GRAY);
            waitView.setBackground(Color.DARK_GRAY);
            goView.setBackground(Color.GREEN);
        }

        // value = e.getActionCommand();

        // switch (value) {
        // case "Stop":

        // stopView.setBackground(Color.red);
        // waitView.setBackground(Color.DARK_GRAY);
        // goView.setBackground(Color.DARK_GRAY);

        // break;

        // case "Waiting":

        // stopView.setBackground(Color.DARK_GRAY);
        // waitView.setBackground(Color.yellow);
        // goView.setBackground(Color.DARK_GRAY);

        // break;
        // case "Go":

        // stopView.setBackground(Color.DARK_GRAY);
        // waitView.setBackground(Color.DARK_GRAY);
        // goView.setBackground(Color.green);

        // break;
        // }
    }

}
