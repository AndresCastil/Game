import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class TresRaya implements ActionListener {

	JFrame frame = new JFrame();
	JPanel btnPanel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] btn = new JButton[9];
	boolean turnoJugador;

	TresRaya() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("3 en Raya");
		frame.setSize(800, 800);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.getContentPane().add(btnPanel);

		btnPanel.setLayout(new GridLayout(3, 3));
		btnPanel.setBackground(new Color(150, 150, 150));

		for (int i = 0; i < 9; i++) {
			btn[i] = new JButton();
			btnPanel.add(btn[i]);
			btn[i].setFont(new Font("Arial Black", Font.BOLD, 120));
			btn[i].setFocusable(false);
			btn[i].addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 9; i++) {
			if (e.getSource() == btn[i]) {
				if (turnoJugador) {
					if (btn[i].getText() == "") {
						btn[i].setText("X");
						turnoJugador = false;
						check();
					}
				} else {
					if (btn[i].getText() == "") {
						btn[i].setText("O");
						turnoJugador = true;
						check();
					}
				}
			}
		}
	}

	public void check() {

		// check si gana X
		if ((btn[0].getText() == "X") && (btn[1].getText() == "X") && (btn[2].getText() == "X")) {
			ganaX(0, 1, 2);
		}
		if ((btn[3].getText() == "X") && (btn[4].getText() == "X") && (btn[5].getText() == "X")) {
			ganaX(3, 4, 5);
		}
		if ((btn[6].getText() == "X") && (btn[7].getText() == "X") && (btn[8].getText() == "X")) {
			ganaX(6, 7, 8);
		}
		if ((btn[0].getText() == "X") && (btn[3].getText() == "X") && (btn[6].getText() == "X")) {
			ganaX(0, 3, 6);
		}
		if ((btn[1].getText() == "X") && (btn[4].getText() == "X") && (btn[7].getText() == "X")) {
			ganaX(1, 4, 7);
		}
		if ((btn[2].getText() == "X") && (btn[5].getText() == "X") && (btn[8].getText() == "X")) {
			ganaX(2, 5, 8);
		}
		if ((btn[0].getText() == "X") && (btn[4].getText() == "X") && (btn[8].getText() == "X")) {
			ganaX(0, 4, 8);
		}
		if ((btn[2].getText() == "X") && (btn[4].getText() == "X") && (btn[6].getText() == "X")) {
			ganaX(2, 4, 6);
		}
		// check si gana O
		if ((btn[0].getText() == "O") && (btn[1].getText() == "O") && (btn[2].getText() == "O")) {
			ganaO(0, 1, 2);
		}
		if ((btn[3].getText() == "O") && (btn[4].getText() == "O") && (btn[5].getText() == "O")) {
			ganaO(3, 4, 5);
		}
		if ((btn[6].getText() == "O") && (btn[7].getText() == "O") && (btn[8].getText() == "O")) {
			ganaO(6, 7, 8);
		}
		if ((btn[0].getText() == "O") && (btn[3].getText() == "O") && (btn[6].getText() == "O")) {
			ganaO(0, 3, 6);
		}
		if ((btn[1].getText() == "O") && (btn[4].getText() == "O") && (btn[7].getText() == "O")) {
			ganaO(1, 4, 7);
		}
		if ((btn[2].getText() == "O") && (btn[5].getText() == "O") && (btn[8].getText() == "O")) {
			ganaO(2, 5, 8);
		}
		if ((btn[0].getText() == "O") && (btn[4].getText() == "O") && (btn[8].getText() == "O")) {
			ganaO(0, 4, 8);
		}
		if ((btn[2].getText() == "O") && (btn[4].getText() == "O") && (btn[6].getText() == "O")) {
			ganaO(2, 4, 6);
		}
	}

	public void ganaX(int a, int b, int c) {

		for (int i = 0; i < 9; i++) {
			btn[i].setEnabled(false);
		}
		JOptionPane.showMessageDialog(null, ("X gana"));
	}

	public void ganaO(int a, int b, int c) {

		for (int i = 0; i < 9; i++) {
			btn[i].setEnabled(false);
		}
		JOptionPane.showMessageDialog(null, ("O gana"));

	}

}
