package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PopQuiz implements ActionListener {
	JFrame fun = new JFrame();
	JPanel and = new JPanel();
	JButton games = new JButton();
	JButton boring = new JButton();
	int score = 0;

	PopQuiz() {
		fun.add(and);
		fun.setVisible(true);
		fun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		games.setText("Increase");
		boring.setText("Show");
		games.addActionListener(this);
		boring.addActionListener(this);
		and.add(games);
		and.add(boring);
		fun.pack();
		fun.setTitle("Sample_Text");
	}

	public static void main(String[] args) {
		PopQuiz buttons = new PopQuiz();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == games) {
			score++;
		} else if (e.getSource() == boring) {
			JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
		}
	}
}
