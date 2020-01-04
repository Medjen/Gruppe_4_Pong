package de.hft.ip1.pong;

import javax.swing.*;
import static de.hft.ip1.pong.Application.ROOTFRAME;

import java.awt.Dimension;
import java.awt.Toolkit;

public class MainMenu extends JPanel {

	private int width_px = 500;
	private int height_px = 500;

	/** Attributes */
	/**
	 * button to start the new game
	 */
	private JButton btnStartNewGame;

	/**
	 * button to exit the game
	 */
	private JButton btnExit;

	/**
	 * Textfield to enter the wished playfield height
	 */
	private JTextField height;

	/**
	 * Textfield to enter the wished playfield width
	 */
	private JTextField width;

	private JLabel widthLabel;
	private JLabel heightLabel;
	private JLabel px1;
	private JLabel px2;

	/**
	 * Operation MainMenu.<br />
	 * 
	 * - construct this JPanel<br />
	 * - init the components you need for this (see method below)<br />
	 * - remove all elements from the root frame<br />
	 * - add this panel to the root frame
	 *
	 * @return
	 */
	public MainMenu() {
		width = new JTextField("" + width_px);
		height = new JTextField("" + height_px);
		btnExit = new JButton("Beenden");
		btnStartNewGame = new JButton("Start");
		widthLabel = new JLabel("Breite:");
		heightLabel = new JLabel("Hoehe:");
		px1 = new JLabel("px");
		px2 = new JLabel("px");
		ROOTFRAME.setSize(220, 200);
		initComponents();
	}

	/**
	 * Operation initComponents.<br />
	 * 
	 * initialize all fields and additionally needed thing like Actions, etc.
	 *
	 */
	private void initComponents() {

		widthLabel.setBounds(10, 20, 120, 30);
		ROOTFRAME.add(widthLabel);

		width.setBounds(55, 20, 125, 30);
		ROOTFRAME.add(width);

		px1.setBounds(182, 20, 30, 30);
		ROOTFRAME.add(px1);

		heightLabel.setBounds(10, 70, 120, 30);
		ROOTFRAME.add(heightLabel);

		height.setBounds(55, 70, 125, 30);
		ROOTFRAME.add(height);

		px2.setBounds(182, 70, 30, 30);
		ROOTFRAME.add(px2);

		btnExit.setBounds(10, 120, 85, 30);
		ROOTFRAME.add(btnExit);

		btnStartNewGame.setBounds(110, 120, 85, 30);
		ROOTFRAME.add(btnStartNewGame);

		btnExit.addActionListener(e -> {
			ROOTFRAME.dispose();
		});

		btnStartNewGame.addActionListener(e -> {
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			if (width.getText().length() != 0 && height.getText().length() != 0) {
				try {
					width_px = Integer.parseInt(width.getText());
					height_px = Integer.parseInt(height.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Ungueltige Eingabe.", "Fehler!", JOptionPane.ERROR_MESSAGE);
					width.setText("");
					height.setText("");
					return;
				}
				if (width_px <= screenSize.width && height_px <= screenSize.height) {
					Dimension playFieldSize = new Dimension(width_px, height_px);
					new InGame(playFieldSize);
				} else {
					JOptionPane.showMessageDialog(null,
							"Die Fenstergroesse darf nicht die des Bildschirms uebersteigen.", "Achtung!",
							JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Bitte fuelle alle Felder aus.", "Fehler!",
						JOptionPane.ERROR_MESSAGE);
			}
		});
	}
}