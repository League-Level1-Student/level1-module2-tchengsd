package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberGenerator implements ActionListener {
	JFrame wheel = new JFrame();
	JPanel engine = new JPanel();
	JButton gas = new JButton();
	JLabel spare = new JLabel();
	Random oil = new Random();
	int tire = oil.nextInt();

	NumberGenerator() {
		wheel.add(engine);
		wheel.setVisible(true);
		wheel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gas.setText("Generate");
		gas.addActionListener(this);
		spare.setText("" + tire);
		engine.add(gas);
		engine.add(spare);
		wheel.setTitle("something.exe has stopped working");
		wheel.pack();
	}

	public static void main(String[] args) {
		NumberGenerator car = new NumberGenerator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == gas) {
			tire = oil.nextInt();
			spare.setText("" + tire);
		}

	}
}
