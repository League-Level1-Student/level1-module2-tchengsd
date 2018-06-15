import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What is the popcorn flavor?");
	Popcorn yum = new Popcorn(flavor);
	Microwave thang = new Microwave();
	thang.putInMicrowave(yum);
	thang.setTime(2);
	thang.startMicrowave();
}
}
